package com.verificador.catalogos.web.model;

import java.util.Objects;

import com.verificador.catalogos.domain.entity.Estacion;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Tolerate;

@Getter
@Builder(toBuilder = true)
@Schema(name = "Estacion Model", description = "Modelo de datos de estación gasolinera")
public class EstacionModel {

	@Schema(description = "Identificador único de la estación gasolinera", example = "1")
	private Long id;
	
	@Schema(description = "Nombre de la marca gasolinera", example = "Petro Seven")
	private String nombre;
	
	@Schema(description = "Dirección de la estación gasolinera", example = "Arturo B. de la Garza esq, Jorge González Camarena s/n, El Roble, 66414 San Nicolás de los Garza, N.L.")
	private String direccion;
	
	@Tolerate
	protected EstacionModel() {
		
	}
	
	public static EstacionModel crearEstacionModel(Estacion estacion) {
		if(Objects.nonNull(estacion)) {
			return EstacionModel.builder()
					.id(estacion.getId())
					.nombre(estacion.getMarca().getNombre())
					.direccion(estacion.getDireccion())
					.build();
		}
		return null;
	}
}
