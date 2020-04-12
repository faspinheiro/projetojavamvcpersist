package br.com.faspinheiro.projetojavmvcpersistencia.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.faspinheiro.projetojavmvcpersistencia.model.negocio.Computador;

@Repository
public interface IComputadorRepository extends CrudRepository<Computador, Integer> {

}
