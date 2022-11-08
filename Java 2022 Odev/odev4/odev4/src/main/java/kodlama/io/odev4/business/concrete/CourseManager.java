package kodlama.io.odev4.business.concrete;

import kodlama.io.odev4.business.abstracts.CourseService;
import kodlama.io.odev4.business.request.CreateCourseRequest;
import kodlama.io.odev4.business.response.GetAllCourseResponse;
import kodlama.io.odev4.dataAccess.abstracts.CourseRepository;
import kodlama.io.odev4.entities.concrete.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseManager implements CourseService {

    private CourseRepository courseRepostory;

    @Autowired
    public CourseManager(CourseRepository courseRepostory) {
        this.courseRepostory = courseRepostory;
    }


    @Override
    public List<GetAllCourseResponse> getAll() {
        List<Courses> courseList = courseRepostory.findAll();
        List<GetAllCourseResponse> courseResponses = new ArrayList<GetAllCourseResponse>();
        for (Courses course: courseList) {
            GetAllCourseResponse courseItem = new GetAllCourseResponse(course.getId(), course.getCourseName());

            courseResponses.add(courseItem);
        }
        return courseResponses;
    }

    @Override
    public Courses course(int id) {
        List<Courses> getIdCours = courseRepostory.findAll();
        for (Courses cours : getIdCours) {
            if (id == cours.getId()){
                return cours;
            }
        }
        throw new RuntimeException(("bu id de kurs bulunmuyor"));

    }


    @Override
    public void Add(CreateCourseRequest createCourseRequest) throws Exception {

        Courses cours = new Courses();
        if (courseRepostory.findAll().stream().anyMatch(l -> l.getCourseName().equals(createCourseRequest.getName()))){
            throw new RuntimeException("bu isimde kurs bulunuyor");
        }
        else{
            cours.setCourseName(createCourseRequest.getName());
            courseRepostory.save(cours);
            throw new RuntimeException("eklendi");
        }

    }

    @Override
    public void Delete(int id) {
        List<Courses> deleteCours = courseRepostory.findAll();
        for (Courses cours : deleteCours) {
            if (id == cours.getId()){
                courseRepostory.delete(cours);
            }
        }
    }
}
