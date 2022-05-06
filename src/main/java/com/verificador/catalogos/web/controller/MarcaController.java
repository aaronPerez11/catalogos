package com.verificador.catalogos.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verificador.catalogos.service.EstacionService;
import com.verificador.catalogos.service.MarcaService;
import com.verificador.catalogos.web.model.EstacionModel;
import com.verificador.catalogos.web.model.MarcaModel;
import static com.verificador.catalogos.utils.Constantes.CONTEXT_MARCAS;
import static com.verificador.catalogos.utils.Constantes.CONTEXT_ID;
import static com.verificador.catalogos.utils.Constantes.CONTEXT_GASOLINERAS;

import java.util.List;

@RestController
@RequestMapping(value = CONTEXT_MARCAS)
public class MarcaController {
	
	private final MarcaService marcasService;
	private final EstacionService estacionService;
	
	@Autowired
	private MarcaController(MarcaService marcasService,
			EstacionService estacionService) {
		this.marcasService = marcasService;
		this.estacionService = estacionService;
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MarcaModel>> consultarMarcas(){
		return ResponseEntity.status(HttpStatus.OK).body(marcasService.findAll());
	}
	
	@GetMapping(value = CONTEXT_ID, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MarcaModel> consultarMarca(@PathVariable(required = true) Long id){
		return ResponseEntity.status(HttpStatus.OK).body(marcasService.findById(id));
	}
	
	@GetMapping(value = CONTEXT_GASOLINERAS, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EstacionModel>> consultarEstaciones(@PathVariable(required = true) Long id){
		return ResponseEntity.status(HttpStatus.OK).body(estacionService.findEstacionByIdMarca(id));
	}
}

