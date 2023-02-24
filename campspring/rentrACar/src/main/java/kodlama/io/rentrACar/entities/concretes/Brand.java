package kodlama.io.rentrACar.entities.concretes;

import lombok.*;

import javax.persistence.*;

//lombok getter ve setterları kullanmamamızı sağlıyor
@Table(name = "brands")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Brand {

    @Id//Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}

