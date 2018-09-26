package br.com.caelum.almocotecnicosolid.repository;

import br.com.caelum.almocotecnicosolid.domain.Estoque;
import br.com.caelum.almocotecnicosolid.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

    @Query("select e from Estoque e where e.produto.id = ?1")
    Optional<Estoque> findByProdutoId(Long id);
}
