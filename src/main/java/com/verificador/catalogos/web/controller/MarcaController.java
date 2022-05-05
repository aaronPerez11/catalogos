package com.verificador.catalogos.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verificador.catalogos.service.MarcaService;
import com.verificador.catalogos.web.model.MarcaModel;

import static com.verificador.catalogos.utils.Constantes.CONTEXT_MARCAS;

import java.util.List;

@RestController
@RequestMapping(value = CONTEXT_MARCAS)
public class MarcaController {
	
	private final MarcaService marcasService;
	
	@Autowired
	private MarcaController(MarcaService marcasService) {
		this.marcasService = marcasService;
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MarcaModel>> consultarMarcas(){
		return ResponseEntity.status(HttpStatus.OK).body(marcasService.findAll());
	}
}

