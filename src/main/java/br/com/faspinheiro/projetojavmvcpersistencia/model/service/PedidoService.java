package br.com.faspinheiro.projetojavmvcpersistencia.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavmvcpersistencia.model.negocio.Pedido;
import br.com.faspinheiro.projetojavmvcpersistencia.model.repository.IPedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private IPedidoRepository repositorio;
	
	public List<Pedido> obterTodos() {		
		return (List<Pedido>) repositorio.findAll();
	}
	
	public Pedido obterPedido(Integer id){
		return repositorio.findById(id).get();
	}
	
	public void incluir(Pedido pedido) {
		repositorio.save(pedido);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}
	

	public IPedidoRepository getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IPedidoRepository repositorio) {
		this.repositorio = repositorio;
	}	

}
