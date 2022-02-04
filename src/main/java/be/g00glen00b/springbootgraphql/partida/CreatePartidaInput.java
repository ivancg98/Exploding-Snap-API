package be.g00glen00b.springbootgraphql.partida;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatePartidaInput {
    private Integer puntuacio;
    private boolean guanyador;
    private Long alumneId;
}