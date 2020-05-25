package com.globhack.leaf.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globhack.leaf.model.dao.IListasDao;
import com.globhack.leaf.model.entity.ListasEntity;

@Service
public class ListasServiceImpl implements IListasService{

	@Autowired
	private IListasDao listaDao;
	
	@Override
	public List<ListasEntity> findCategory(String dscodigo) {
		return listaDao.findByDscodigo(dscodigo);
	}

}
