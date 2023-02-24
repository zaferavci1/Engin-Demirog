package kodlama.io.odev4.business.abstracts;

import kodlama.io.odev4.business.request.CreateLowerCourseRequest;
import kodlama.io.odev4.business.response.GetAllLowerCourseResponse;
import kodlama.io.odev4.entities.concrete.LowerCours;

import java.util.List;

public interface LowerCourseService {

    List<GetAllLowerCourseResponse> getAll();
    LowerCours lowerCours(int id);
    void Add(CreateLowerCourseRequest createLowerCourseRequest) throws Exception;
    void Delete(int id);
}
