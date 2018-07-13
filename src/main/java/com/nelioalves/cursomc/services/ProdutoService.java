package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService{
	
	@Autowired
	private ProdutoRepository repo;
	
	public Produto busca(Integer id) {
		Optional<Produto> produto  = repo.findById(id);
		return produto.orElse(null);
	}
}
