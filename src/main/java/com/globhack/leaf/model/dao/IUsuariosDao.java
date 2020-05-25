package com.globhack.leaf.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.globhack.leaf.model.entity.UsuariosEntity;

public interface IUsuariosDao extends CrudRepository<UsuariosEntity,Integer>{

	
	public UsuariosEntity findByNmdocumento(Integer nmdocumento);
	
}
