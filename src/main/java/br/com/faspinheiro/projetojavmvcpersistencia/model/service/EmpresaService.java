package br.com.faspinheiro.projetojavmvcpersistencia.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavmvcpersistencia.model.negocio.Empresa;
import br.com.faspinheiro.projetojavmvcpersistencia.model.repository.IEmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private IEmpresaRepository repositorio;
	
	public List<Empresa> obterTodos(){		
		return (List<Empresa>) repositorio.findAll();
	}
	
	public Empresa obterEmpresa(Integer id) {		
		return repositorio.findById(id).get();
	}
	
	public void incluir(Empresa empresa) {
		repositorio.save(empresa);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}

	public IEmpresaRepository getRepository() {
		return repositorio;
	}
	public void setRepository(IEmpresaRepository repository) {
		this.repositorio = repository;
	}

}
