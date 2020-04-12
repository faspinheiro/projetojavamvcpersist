package br.com.faspinheiro.projetojavmvcpersistencia.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavmvcpersistencia.model.negocio.Produto;
import br.com.faspinheiro.projetojavmvcpersistencia.model.repository.IProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private IProdutoRepository repositorio;
	
	public List<Produto> obterTodos() {		
		return (List<Produto>) repositorio.findAll();
	}
	
	public Produto obterProduto(Integer id){
		return repositorio.findById(id).get();
	}
	
	public void incluir(Produto produto) {
		repositorio.save(produto);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}
	

	public IProdutoRepository getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IProdutoRepository repositorio) {
		this.repositorio = repositorio;
	}	

}
