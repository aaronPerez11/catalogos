package com.verificador.catalogos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verificador.catalogos.domain.entity.Marcas;
import com.verificador.catalogos.domain.repository.MarcasRepository;


@Service
public class MarcasService {
	
	private final MarcasRepository marcasRepository;
	
	@Autowired
	private MarcasService(MarcasRepository marcasRepository) {
		this.marcasRepository = marcasRepository;
	}
	
	public List<Marcas> consultarMarcas(){
		return marcasRepository.findAll();	
	}

}
