package be.g00glen00b.springbootgraphql.alumne;

import be.g00glen00b.springbootgraphql.partida.Partida;
import be.g00glen00b.springbootgraphql.partida.PartidaRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class AlumneResolver implements GraphQLResolver<Alumne> {
    private PartidaRepository partidaRepository;

    public List<Partida> getPartidesJugades(Alumne alumne){
        return partidaRepository.findByIdAlumne(alumne.getIdAlumne());
    }
}
