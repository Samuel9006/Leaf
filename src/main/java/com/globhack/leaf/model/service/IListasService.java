package com.globhack.leaf.model.service;

import java.util.List;

import com.globhack.leaf.model.entity.ListasEntity;

public interface IListasService {

	public List<ListasEntity> findCategory(String codigo);
}
