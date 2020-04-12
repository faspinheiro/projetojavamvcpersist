package br.com.faspinheiro.projetojavmvcpersistencia.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavmvcpersistencia.model.negocio.ItemPedido;
import br.com.faspinheiro.projetojavmvcpersistencia.model.repository.IItemPedidoRepository;

@Service
public class ItemPedidoService {
	
	@Autowired
	private IItemPedidoRepository repositorio;
	
	public List<ItemPedido> obterTodos() {		
		return (List<ItemPedido>) repositorio.findAll();
	}
	
	public ItemPedido obterItemPedido(Integer id){
		return repositorio.findById(id).get();
	}
	
	public void incluir(ItemPedido item) {
		repositorio.save(item);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}
	

	public IItemPedidoRepository getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IItemPedidoRepository repositorio) {
		this.repositorio = repositorio;
	}	

}
