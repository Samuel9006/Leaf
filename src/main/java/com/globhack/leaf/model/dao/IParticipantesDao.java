package com.globhack.leaf.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.globhack.leaf.model.entity.ParticipantesEntity;
import com.globhack.leaf.model.entity.ParticipantesId;

public interface IParticipantesDao extends CrudRepository<ParticipantesEntity, ParticipantesId>{

}
