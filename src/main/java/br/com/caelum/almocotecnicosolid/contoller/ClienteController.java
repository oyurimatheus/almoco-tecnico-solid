package br.com.caelum.almocotecnicosolid.contoller;

import br.com.caelum.almocotecnicosolid.domain.Cliente;
import br.com.caelum.almocotecnicosolid.repository.ClienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/form")
    public String form() {
        return "clientes/clientes-form";
    }

    @PostMapping
    public String salva(Cliente cliente) {
        clienteRepository.save(cliente);
        return "redirect:clientes/";
    }

    @GetMapping
    public String lista(Model model) {
        model.addAttribute("clientes", clienteRepository.findAll());
        return "clientes/lista";
    }
}
