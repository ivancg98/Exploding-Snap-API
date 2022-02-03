package be.g00glen00b.springbootgraphql.alumne;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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