package com.example.api.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.api.model.Produto;
import com.example.api.service.ProdutoService;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoControllers {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/todos")
	public ResponseEntity<List <Produto>> mostrarTodos(){
		return ResponseEntity.ok().body(produtoService.mostrarProdutos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> buscarProduto(@PathVariable Long id){
		return ResponseEntity.ok().body(produtoService.findById(id));
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Produto> create(@RequestBody Produto produto){
		Produto produto2 = produtoService.create(produto); 
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").buildAndExpand(produto2.getId()).toUri(); 
		return ResponseEntity.created(uri).build(); 
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto){
		return ResponseEntity.ok().body(produtoService.update(id, produto));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Produto> delete(@PathVariable Long id){
		return ResponseEntity.ok().body(produtoService.delete(id));
	}
}
