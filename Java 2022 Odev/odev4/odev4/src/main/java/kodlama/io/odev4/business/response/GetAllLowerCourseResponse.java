package kodlama.io.odev4.business.response;

import kodlama.io.odev4.entities.concrete.Courses;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllLowerCourseResponse {
    private int id;
    private String name;
    private Courses course;
}
