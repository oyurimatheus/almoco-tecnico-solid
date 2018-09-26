package br.com.caelum.almocotecnicosolid.repository;

import br.com.caelum.almocotecnicosolid.domain.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Long> {
}
