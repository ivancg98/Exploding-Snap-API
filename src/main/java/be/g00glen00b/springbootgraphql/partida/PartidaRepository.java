package be.g00glen00b.springbootgraphql.partida;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
    List<Partida> findByIdAlumne(long idAlumne);
}
