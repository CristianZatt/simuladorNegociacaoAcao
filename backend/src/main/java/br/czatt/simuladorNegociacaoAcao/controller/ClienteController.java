package br.czatt.simuladorNegociacaoAcao.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.czatt.simuladorNegociacaoAcao.model.Cliente;
import br.czatt.simuladorNegociacaoAcao.repository.ClienteRepository;
 

@RestController
@RequestMapping("/api")
public class ClienteController {
 
	@Autowired
	ClienteRepository repository;
 
	@GetMapping("/clientes")
	public List<Cliente> getAllClientes() {
		System.out.println("Get all Clientes...");
 
		List<Cliente> clientes = new ArrayList<>();
		repository.findAll().forEach(clientes::add);
 
		return clientes;
	}
 
	@PostMapping("/cliente")
	public Cliente postCliente(@RequestBody Cliente cliente) {
 
		Cliente _cliente = repository.save(new Cliente(cliente.getLogin(), cliente.getNome()));
		return _cliente;
	}
 
	@DeleteMapping("/cliente/{id}")
	public ResponseEntity<String> deleteCliente(@PathVariable("id") long id) {
		System.out.println("Delete Cliente with ID = " + id + "...");
 
		repository.deleteById(id);
 
		return new ResponseEntity<>("Cliente has been deleted!", HttpStatus.OK);
	}
 
	@GetMapping("clientes/nome/{nome}")
	public List<Cliente> findByAge(@PathVariable String nome) {
 
		List<Cliente> clientes = repository.findByNome(nome);
		return clientes;
	}
 
	@PutMapping("/cliente/{id}")
	public ResponseEntity<Cliente> updateCliente(@PathVariable("id") long id, @RequestBody Cliente cliente) {
		System.out.println("Update Cliente with ID = " + id + "...");
 
		Optional<Cliente> clienteData = repository.findById(id);
 
		if (clienteData.isPresent()) {
			Cliente _cliente = clienteData.get();
			_cliente.setLogin(cliente.getLogin());
			_cliente.setNome(cliente.getNome());
			return new ResponseEntity<>(repository.save(_cliente), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}