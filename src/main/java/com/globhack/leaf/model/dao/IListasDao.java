package com.globhack.leaf.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.globhack.leaf.model.entity.ListasEntity;

public interface IListasDao extends CrudRepository<ListasEntity, Integer>{

	@Query("FROM ListasEntity l WHERE l.dscodigo = ?1 AND l.snactivo = 'S' ")
	public List<ListasEntity> findByDscodigo(String dscodigo);
	
}
