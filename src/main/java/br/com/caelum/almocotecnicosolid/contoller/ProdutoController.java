package br.com.caelum.almocotecnicosolid.contoller;

import br.com.caelum.almocotecnicosolid.domain.Cliente;
import br.com.caelum.almocotecnicosolid.domain.Produto;
import br.com.caelum.almocotecnicosolid.repository.ProdutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;


    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping("/form")
    public String form() {
        return "produtos/produtos-form";
    }

    @PostMapping
    public String salva(Produto produto) {
        produtoRepository.save(produto);
        return "redirect:produtos";
    }

    @GetMapping
    public String lista(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produtos/lista";
    }
}
