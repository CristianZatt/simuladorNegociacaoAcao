package br.czatt.simuladorNegociacaoAcao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.czatt.simuladorNegociacaoAcao.model.Cliente;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    List<Cliente> findByLogin(@Param("login") String login);

    List<Cliente> findByNome(@Param("nome") String nome);
    
    
    @Override
    @Transactional(timeout = 10)
    public List<Cliente> findAll();

}
