package com.globhack.leaf.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globhack.leaf.model.dao.IClasesDao;
import com.globhack.leaf.model.entity.ClasesEntity;



@Service
public class ClasesServiceImpl implements IClasesService {

	@Autowired
	private IClasesDao claseDao;

	@Override
	public ClasesEntity createClassRoom(ClasesEntity clase) {
		return claseDao.save(clase);
	}

}
