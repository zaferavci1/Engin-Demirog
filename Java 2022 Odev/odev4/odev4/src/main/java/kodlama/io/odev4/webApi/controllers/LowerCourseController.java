package kodlama.io.odev4.webApi.controllers;

import kodlama.io.odev4.business.abstracts.LowerCourseService;
import kodlama.io.odev4.business.request.CreateCourseRequest;
import kodlama.io.odev4.business.request.CreateLowerCourseRequest;
import kodlama.io.odev4.business.response.GetAllCourseResponse;
import kodlama.io.odev4.business.response.GetAllLowerCourseResponse;
import kodlama.io.odev4.entities.concrete.Courses;
import kodlama.io.odev4.entities.concrete.LowerCours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lowercourse")
public class LowerCourseController {

    private LowerCourseService lowerCourseService;

    @Autowired
    public LowerCourseController(LowerCourseService lowerCourseService) {
        this.lowerCourseService = lowerCourseService;
    }

    @GetMapping("/getall")
    public List<GetAllLowerCourseResponse> getAll(){
        return lowerCourseService.getAll();
    }

    @PostMapping(value = "/coursename")
    public void Add(@RequestBody CreateLowerCourseRequest lowerCourse) throws Exception{
        lowerCourseService.Add(lowerCourse);
    }

    @GetMapping("getlowercourse/{id}")
    public LowerCours getLowerCourse(@PathVariable("id") int name){
        return lowerCourseService.lowerCours(name);
    }
}
