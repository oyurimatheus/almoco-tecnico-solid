package br.com.caelum.almocotecnicosolid.repository;

import br.com.caelum.almocotecnicosolid.domain.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {
}
