package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.model.Produto;
import com.example.api.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> mostrarProdutos(){
		return produtoRepository.findAll();
	}
	
	public Produto findById(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
	public Produto update(Long id, Produto produto) {
		Produto produto2 = findById(id);
		produto2.setNome(produto.getNome());
		produto2.setPreco(produto.getPreco());
		return produtoRepository.save(produto2);
	}
	
	public Produto delete(Long id) {
		Produto produto2 = findById(id);
		produtoRepository.deleteById(id);
		return produto2;
	}
	
	public Produto create(Produto produto) {
		produto.setId(null);
		return produtoRepository.save(produto);
	}
}
