package br.com.faspinheiro.projetojavmvcpersistencia.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavmvcpersistencia.model.negocio.Livro;
import br.com.faspinheiro.projetojavmvcpersistencia.model.repository.ILivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private ILivroRepository repositorio;
	
	public List<Livro> obterTodos(){		
		return (List<Livro>) repositorio.findAll();
	}
	
	public Livro obterLivro(Integer id) {		
		return repositorio.findById(id).get();
	}
	
	public void incluir(Livro livro) {
		repositorio.save(livro);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}

	public ILivroRepository getRepository() {
		return repositorio;
	}
	public void setRepository(ILivroRepository repository) {
		this.repositorio = repository;
	}

}
