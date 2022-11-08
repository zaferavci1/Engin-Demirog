package kodlama.io.odev4.business.abstracts;

import kodlama.io.odev4.business.request.CreateLowerCourseRequest;
import kodlama.io.odev4.business.response.GetAllLowerCourseResponse;
import kodlama.io.odev4.entities.concrete.LowerCours;

import java.util.ArrayList;
import java.util.List;

public interface LowerCourseService {

    List<GetAllLowerCourseResponse> getAll();
    LowerCours lowerCours(String name);
    void Add(CreateLowerCourseRequest lowerCourse) throws Exception;
    void Delete(int id);
}