package br.com.douglas.fastburguer.Hamburgueria.Fast.Controller;


import br.com.douglas.fastburguer.Hamburgueria.Fast.Domain.Cliente;
import br.com.douglas.fastburguer.Hamburgueria.Fast.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvarCliente(@RequestBody Cliente cliente) {
        return clienteService.salvarCliente(cliente);
    }

    @GetMapping("/cliente/id/{id}")
    public Cliente buscarCliente(@PathVariable Long id) {
        return clienteService.buscarClientePorId(id);
    }

    @GetMapping("/cliente")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> listarTodosOsClientes() {
        return clienteService.listarTodosOsClientes();
    }

    @DeleteMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirCliente(@PathVariable Long id) {
        clienteService.excluirCliente(id);
    }

    @GetMapping("/cliente/nome/{nome}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente buscarClientePorNome(@PathVariable String nome){
      return clienteService.buscarClientePorNome(nome);
    }

    @GetMapping("/cliente/email/{email}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente buscarClientePorEmail(@PathVariable String email){
        return clienteService.buscarClientePorEmail(email);
    }

    @PutMapping("/cliente")
    @ResponseStatus(HttpStatus.OK)
    public Cliente atualizarCliente(@RequestBody Cliente cliente){
        return clienteService.atualizarCliente(cliente);
    }

    @GetMapping("/cliente/telefone/{telefone}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente buscarClientePorTelefone(@PathVariable String telefone){
        return clienteService.buscarClientePorTelefone(telefone);
    }

}
