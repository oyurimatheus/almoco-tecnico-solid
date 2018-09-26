package br.com.caelum.almocotecnicosolid.repository;

import br.com.caelum.almocotecnicosolid.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
