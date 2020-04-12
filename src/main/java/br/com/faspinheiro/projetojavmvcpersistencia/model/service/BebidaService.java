package br.com.faspinheiro.projetojavmvcpersistencia.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavmvcpersistencia.model.negocio.Bebida;
import br.com.faspinheiro.projetojavmvcpersistencia.model.repository.IBebidaRepository;

@Service
public class BebidaService {
	
	@Autowired
	private IBebidaRepository repositorio;
	
	public List<Bebida> obterTodos(){		
		return (List<Bebida>) repositorio.findAll();
	}
	
	public Bebida obterBebida(Integer id) {		
		return repositorio.findById(id).get();
	}
	
	public void incluir(Bebida bebida) {
		repositorio.save(bebida);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}

	public IBebidaRepository getRepository() {
		return repositorio;
	}
	public void setRepository(IBebidaRepository repository) {
		this.repositorio = repository;
	}

}
