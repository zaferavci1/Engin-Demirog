package kodlama.io.odev4.business.abstracts;

import kodlama.io.odev4.business.request.CreateCourseRequest;
import kodlama.io.odev4.business.response.GetAllCourseResponse;
import kodlama.io.odev4.entities.concrete.Courses;

import java.util.List;

public interface CourseService {

    List<GetAllCourseResponse> getAll();
    Courses course(int id);
    void Add(CreateCourseRequest course) throws Exception;
    void Delete(int id);
}
