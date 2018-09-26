package br.com.caelum.almocotecnicosolid.repository;

import br.com.caelum.almocotecnicosolid.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
