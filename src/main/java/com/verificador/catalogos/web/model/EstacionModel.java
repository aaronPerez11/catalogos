package com.verificador.catalogos.web.model;

import java.util.Objects;

import com.verificador.catalogos.domain.entity.Estacion;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Tolerate;

@Getter
@Builder(toBuilder = true)
public class EstacionModel {

	private Long id;
	private String nombre;
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
