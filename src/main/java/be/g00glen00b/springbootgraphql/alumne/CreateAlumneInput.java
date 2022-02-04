package be.g00glen00b.springbootgraphql.alumne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateAlumneInput {
    private String nom;
    private Alumne.House casa;
}










