package kodlama.io.odev4.entities.concrete;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "lowerCours")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class LowerCours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;


    /*@ManyToMany
    private List<Courses> kurs = new ArrayList<Courses>();

    public void addCourses(Courses cours){
        this.kurs.add(cours);
    }*/
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;
}
