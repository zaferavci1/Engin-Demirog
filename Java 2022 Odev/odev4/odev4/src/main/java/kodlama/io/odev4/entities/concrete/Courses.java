package kodlama.io.odev4.entities.concrete;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "courseName")
    private String courseName;

 /*   @ManyToMany(mappedBy = "kurs")
    private List<LowerCours> kurs = new ArrayList<LowerCours>();*/

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    private List<LowerCours> lowerCourse;
}
