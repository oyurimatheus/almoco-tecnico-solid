package br.com.caelum.almocotecnicosolid.contoller;


import br.com.caelum.almocotecnicosolid.domain.Compra;
import br.com.caelum.almocotecnicosolid.domain.Estoque;
import br.com.caelum.almocotecnicosolid.domain.NotaFiscal;
import br.com.caelum.almocotecnicosolid.domain.Produto;
import br.com.caelum.almocotecnicosolid.repository.CompraRepository;
import br.com.caelum.almocotecnicosolid.repository.EstoqueRepository;
import br.com.caelum.almocotecnicosolid.repository.NotaFiscalRepository;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/compras")
public class CompraController {

    private CompraRepository compraRepository;
    private EstoqueRepository estoqueRepository;
    private NotaFiscalRepository notaFiscalRepository;
    private JavaMailSender mailSender;

    public CompraController(CompraRepository compraRepository, EstoqueRepository estoqueRepository, NotaFiscalRepository notaFiscalRepository, JavaMailSender mailSender) {
        this.compraRepository = compraRepository;
        this.estoqueRepository = estoqueRepository;
        this.notaFiscalRepository = notaFiscalRepository;
        this.mailSender = mailSender;
    }

    @GetMapping("/{id}")
    public String processaCompra(@PathVariable("id") Long id) {
        // Compra compra = compraRepository.findById(id).get();

        // cria e salva a nota fiscal
       // NotaFiscal notaFiscal = compra.emiteNotaFiscal();
        //notaFiscalRepository.save(notaFiscal);

        // envia email
        SimpleMailMessage email = new SimpleMailMessage();
        email.setFrom("yuri.oliveira@alura.com.br");
        email.setSubject("Compra realizada com sucesso");
        email.setText("Sua compra foi realizada com sucesso");
        email.setTo("lucas.felix@caelum.com.br");
        mailSender.send(email);

        // Decrementa do estoque
       // for(Produto p : compra.getProdutos()) {
//            Estoque estoque = estoqueRepository.findByProdutoId(p.getId()).get();
//            estoque.decrementa(1);
//        }

        return "compras/processada";
    }
}
