package be.g00glen00b.springbootgraphql.alumne;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlumneRepository extends JpaRepository<Alumne, Long> {
    int deleteByIdAlumne(Long idAlumne);
}
