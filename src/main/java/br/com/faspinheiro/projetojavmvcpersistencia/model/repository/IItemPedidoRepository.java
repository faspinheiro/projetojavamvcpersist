package br.com.faspinheiro.projetojavmvcpersistencia.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.faspinheiro.projetojavmvcpersistencia.model.negocio.ItemPedido;

@Repository
public interface IItemPedidoRepository extends CrudRepository<ItemPedido, Integer> {

}
