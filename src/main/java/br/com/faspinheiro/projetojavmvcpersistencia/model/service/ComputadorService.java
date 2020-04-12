package br.com.faspinheiro.projetojavmvcpersistencia.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavmvcpersistencia.model.negocio.Computador;
import br.com.faspinheiro.projetojavmvcpersistencia.model.repository.IComputadorRepository;

@Service
public class ComputadorService {
	
	@Autowired
	private IComputadorRepository repositorio;
	
	public List<Computador> obterTodos(){		
		return (List<Computador>) repositorio.findAll();
	}
	
	public Computador obterComputador(Integer id) {		
		return repositorio.findById(id).get();
	}
	
	public void incluir(Computador computador) {
		repositorio.save(computador);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}

	public IComputadorRepository getRepository() {
		return repositorio;
	}
	public void setRepository(IComputadorRepository repository) {
		this.repositorio = repository;
	}

}
