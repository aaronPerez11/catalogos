package com.verificador.catalogos.web.model;


import java.util.Objects;
import com.verificador.catalogos.domain.entity.Marca;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Tolerate;


@Builder(toBuilder = true)
@Getter
public class MarcaModel {
	
	
	private Long id;
	private String nombre;
	private String descripcion;
	

	@Tolerate
	protected MarcaModel() {
		
	}
	
	public static MarcaModel crearModeloMarca(Marca marca) {
		if(Objects.nonNull(marca)) {
			return MarcaModel.builder()
					.id(marca.getId())
					.nombre(marca.getNombre())
					.descripcion(marca.getDescripcion())
					.build();	
		}
		return null;
	}

}
