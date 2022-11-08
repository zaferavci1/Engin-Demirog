package kodlama.io.odev4.business.concrete;

import kodlama.io.odev4.business.abstracts.LowerCourseService;
import kodlama.io.odev4.business.request.CreateLowerCourseRequest;
import kodlama.io.odev4.business.response.GetAllLowerCourseResponse;
import kodlama.io.odev4.dataAccess.abstracts.LowerCourseRepository;
import kodlama.io.odev4.entities.concrete.Courses;
import kodlama.io.odev4.entities.concrete.LowerCours;

import java.util.ArrayList;
import java.util.List;

public class LowerCourseManager implements LowerCourseService {

    private LowerCourseRepository lowerCourseRepository;

    public LowerCourseManager(LowerCourseRepository lowerCourseRepository) {
        this.lowerCourseRepository = lowerCourseRepository;
    }

    @Override
    public List<GetAllLowerCourseResponse> getAll() {
        List<LowerCours> lowerCourseList = lowerCourseRepository.findAll();
        List<GetAllLowerCourseResponse> getAllLowerCourseResponse = new ArrayList<GetAllLowerCourseResponse>();
        for (LowerCours lowerCourse : lowerCourseList) {
            GetAllLowerCourseResponse lowerCourseItem = new GetAllLowerCourseResponse(lowerCourse.getId(),lowerCourse.getName());
            getAllLowerCourseResponse.add(lowerCourseItem);
        }
        return getAllLowerCourseResponse;
    }

    @Override
    public LowerCours lowerCours(String name) {
        List<LowerCours> getIdLowerCourse = lowerCourseRepository.findAll();
        for (LowerCours course : getIdLowerCourse) {
            if(name == course.getName()){
                return course;
            }
        }
        throw new RuntimeException("Bu isimde de kurs bulunmuyor");
    }

    @Override
    public void Add(CreateLowerCourseRequest lowerCourse) throws Exception {
        LowerCours lowerCours = new LowerCours();
        if (lowerCourseRepository.findAll().stream().anyMatch(l -> l.getName().equals(lowerCours.getName()))){
            throw new RuntimeException("bu isimde kurs bulunuyor");
        }
        else{
            lowerCours.setName(lowerCours.getName());
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
