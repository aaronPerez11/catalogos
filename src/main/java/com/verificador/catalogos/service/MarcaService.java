package com.verificador.catalogos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verificador.catalogos.domain.entity.Marca;
import com.verificador.catalogos.domain.repository.MarcaRepository;


@Service
public class MarcaService {
	
	private final MarcaRepository marcasRepository;
	
	@Autowired
	private MarcaService(MarcaRepository marcasRepository) {
		this.marcasRepository = marcasRepository;
	}
	
	public List<Marca> consultarMarcas(){
		return marcasRepository.findAll();	
	}

}
