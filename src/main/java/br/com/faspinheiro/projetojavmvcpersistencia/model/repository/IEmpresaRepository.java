package br.com.faspinheiro.projetojavmvcpersistencia.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.faspinheiro.projetojavmvcpersistencia.model.negocio.Empresa;

@Repository
public interface IEmpresaRepository extends CrudRepository<Empresa, Integer> {

}
