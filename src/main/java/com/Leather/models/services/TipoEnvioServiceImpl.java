package com.Leather.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Leather.models.dao.ITipoEnvioDao;
import com.Leather.models.entity.TipoEnvio;

@Service
public class TipoEnvioServiceImpl implements ITipoEnvioService {

	@Autowired
	private ITipoEnvioDao iTipoEnvioDao;

	@Override
	@Transactional(readOnly = true)// true modo lectura
	public List<TipoEnvio> findAll() {
		return (List<TipoEnvio>) iTipoEnvioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)// true modo lectura
	public TipoEnvio findById(Long id) {
		return iTipoEnvioDao.findById(id).orElse(null);
	}

	@Override
	//@Transactional
	public TipoEnvio save (TipoEnvio tipoEnvio) {
		 return iTipoEnvioDao.save(tipoEnvio);
	}

	@Override
	//@Transactional
	public void delete(Long id) {
		iTipoEnvioDao.deleteById(id);
	}
}
