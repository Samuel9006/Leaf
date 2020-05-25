package com.globhack.leaf.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globhack.leaf.model.dao.IParticipantesDao;
import com.globhack.leaf.model.entity.ParticipantesEntity;

@Service
public class ParticipantesServiceImpl implements IParticipantesService {

	@Autowired
	private IParticipantesDao participanteDao;

	@Override
	public ParticipantesEntity inscriptionClass(ParticipantesEntity participantes) {
		return participanteDao.save(participantes);
	}

}
