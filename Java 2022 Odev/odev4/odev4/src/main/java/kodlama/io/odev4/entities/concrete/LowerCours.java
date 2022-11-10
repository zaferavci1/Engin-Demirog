package kodlama.io.odev4.entities.concrete;

import lombok.*;

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



    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;
}
