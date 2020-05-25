package com.globhack.leaf.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globhack.leaf.model.dao.IUsuariosDao;
import com.globhack.leaf.model.entity.UsuariosEntity;



@Service
public class UsuariosServiceImpl implements IUsuariosService {

	@Autowired
	private IUsuariosDao usuarioDao;

	@Override
	public UsuariosEntity createUser(UsuariosEntity usuario) {
		UsuariosEntity usuarioNuevo = usuarioDao.save(usuario);
		return usuarioNuevo;
	}
}
