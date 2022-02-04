package be.g00glen00b.springbootgraphql.alumne;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Alumne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlumne;
    private String nom;
    private House casa;

    public enum House {
        GRYFFINDOR, HUFFLEPUFF, RAVENCLAW, SLYTHERIN
    }
}