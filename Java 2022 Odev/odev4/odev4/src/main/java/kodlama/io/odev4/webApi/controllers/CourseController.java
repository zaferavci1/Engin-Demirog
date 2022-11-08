package kodlama.io.odev4.webApi.controllers;


import kodlama.io.odev4.business.abstracts.CourseService;
import kodlama.io.odev4.business.request.CreateCourseRequest;
import kodlama.io.odev4.business.response.GetAllCourseResponse;
import kodlama.io.odev4.entities.concrete.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/getall")
    public List<GetAllCourseResponse> getAll(){
        return courseService.getAll();
    }

    @GetMapping("getcourse/{id}")
    public  Courses getCourse(@PathVariable("id") int id){
        return courseService.course(id);
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable int id) throws Exception{
        courseService.Delete(id);
    }

    @PostMapping(value = "/coursename")
    public void Add(@RequestBody CreateCourseRequest course) throws Exception{
        courseService.Add(course);
    }
}
