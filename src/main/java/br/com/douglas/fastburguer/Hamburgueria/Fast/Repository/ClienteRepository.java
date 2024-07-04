package br.com.douglas.fastburguer.Hamburgueria.Fast.Repository;

import br.com.douglas.fastburguer.Hamburgueria.Fast.Domain.Cliente;
//import br.com.douglas.fastburguer.Hamburgueria.Fast.Domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Optional<Cliente> findByNome(String nome);
    public Optional<Cliente> findByEmail(String email);
    //public Cliente findByPedido(Pedido pedido);
    public Optional<Cliente> findByTelefone(String telefone);
}
