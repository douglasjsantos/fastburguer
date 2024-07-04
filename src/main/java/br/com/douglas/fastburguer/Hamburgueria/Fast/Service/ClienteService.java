package br.com.douglas.fastburguer.Hamburgueria.Fast.Service;

import br.com.douglas.fastburguer.Hamburgueria.Fast.Domain.Cliente;
import br.com.douglas.fastburguer.Hamburgueria.Fast.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvarCliente(Cliente cliente){
       return clienteRepository.save(cliente);
    }

    public Cliente buscarClientePorId(Long id){

        Optional<Cliente> clienteOptional = clienteRepository.findById(id);

        if(clienteOptional.isPresent()){
            return clienteOptional.get();
        } else{
            throw new RuntimeException("Não existe cliente com esse id");
        }

    }

    public List<Cliente> listarTodosOsClientes(){
        return clienteRepository.findAll();
    }

    public void excluirCliente(Long id){
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);

        if(clienteOptional.isPresent()){
            clienteRepository.delete(clienteOptional.get());
        } else {
            throw new RuntimeException("Cliente não encontrado");
        }
    }

    public Cliente atualizarCliente(Cliente cliente){
        Optional<Cliente> contatoOptional = clienteRepository.findById(cliente.getId());

        if(contatoOptional.isPresent()){
            return clienteRepository.save(cliente);
        } else {
            throw new RuntimeException("Não existe esse cliente");
        }
    }

   public Cliente buscarClientePorNome(String nome){
        Optional<Cliente> clienteOptional = clienteRepository.findByNome(nome);

       if (clienteOptional.isPresent()) {
           return clienteOptional.get();
       } else {
           throw new RuntimeException("Cliente não encontrado!");
       }
   }

    public Cliente buscarClientePorEmail(String email){
        Optional<Cliente> clienteOptional = clienteRepository.findByEmail(email);

        if(clienteOptional.isPresent()){
            return clienteOptional.get();
        } else {
            throw new RuntimeException("E-mail não encontrado");
        }
    }

    public Cliente buscarClientePorTelefone(String telefone){
        Optional<Cliente> clienteOptional = clienteRepository.findByTelefone(telefone);

        if(clienteOptional.isPresent()){
            return clienteOptional.get();
        } else {
            throw new RuntimeException("Telefone não encontrado");
        }
    }
}
