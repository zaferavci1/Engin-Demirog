package kodlama.io.odev4.business.concrete;

import kodlama.io.odev4.business.abstracts.LowerCourseService;
import kodlama.io.odev4.business.request.CreateLowerCourseRequest;
import kodlama.io.odev4.business.response.GetAllCourseResponse;
import kodlama.io.odev4.business.response.GetAllLowerCourseResponse;
import kodlama.io.odev4.dataAccess.abstracts.CourseRepository;
import kodlama.io.odev4.dataAccess.abstracts.LowerCourseRepository;
import kodlama.io.odev4.entities.concrete.Courses;
import kodlama.io.odev4.entities.concrete.LowerCours;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LowerCourseManager implements LowerCourseService {

    private LowerCourseRepository lowerCourseRepository;
    private CourseRepository courseRepository;

    public LowerCourseManager(LowerCourseRepository lowerCourseRepository,CourseRepository _courseRepository) {
        this.lowerCourseRepository = lowerCourseRepository;
        this.courseRepository = _courseRepository;
    }

    @Override
    public List<GetAllLowerCourseResponse> getAll() {
        List<LowerCours> lowerCourseList = lowerCourseRepository.findAll();
        List<Courses> courseList = courseRepository.findAll();
        List<GetAllLowerCourseResponse> getAllLowerCourseResponse = new ArrayList<GetAllLowerCourseResponse>();
        List<GetAllCourseResponse> getAllCourseResponses = new ArrayList<GetAllCourseResponse>();
        Courses course = new Courses();
        for (Courses courses : courseList) {
            if(courses.getId() == )
                course = courseList.get(courses.getId());
        }


        for (LowerCours lowerCourse : lowerCourseList) {
            GetAllLowerCourseResponse lowerCourseItem = new GetAllLowerCourseResponse(lowerCourse.getId(),lowerCourse.getName(),
                    lowerCourse.getCourse(),course.getCourseName());
            getAllLowerCourseResponse.add(lowerCourseItem);
        }
        return getAllLowerCourseResponse;
    }

    @Override
    public LowerCours lowerCours(int id) {
        List<LowerCours> getNameLowerCourse = lowerCourseRepository.findAll();
        for (LowerCours lowerCourse : getNameLowerCourse) {
            if(id == lowerCourse.getId()){
                return lowerCourse;
            }
        }
        throw new RuntimeException("Bu id de kurs bulunmuyor");
    }

    @Override
    public void Add(CreateLowerCourseRequest createLowerCourse) throws Exception {
        LowerCours lowerCours = new LowerCours();
        Courses course = new Courses();
        List<Courses> courseList = courseRepository.findAll();
        for (Courses courses : courseList) {
            if (createLowerCourse.getCoursId() == courses.getId()){
                course = courses;
            }
        }
        if (lowerCourseRepository.findAll().stream().anyMatch(l -> l.getName().equals(createLowerCourse.getLowerName()))){
            throw new RuntimeException("bu isimde kurs bulunuyor");
        }
        else{
            lowerCours.setName(createLowerCourse.getLowerName());
            lowerCours.setCourse(course);
            lowerCourseRepository.save(lowerCours);
            throw new RuntimeException("eklendi");
        }
    }

    @Override
    public void Delete(int id) {
        List<LowerCours> deleteLowerCours = lowerCourseRepository.findAll();
        for (LowerCours lowerCours : deleteLowerCours) {
            if (id == lowerCours.getId()){
                lowerCourseRepository.delete(lowerCours);
            }
        }
    }
}
