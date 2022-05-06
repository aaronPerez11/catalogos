package com.verificador.catalogos.exception;

import java.util.List;

import lombok.Getter;

@Getter
public class ErrorResponseModel {
	private String mensaje;
	private List<?> detalle;
	
	 public ErrorResponseModel(String mensaje, List<?> detalle) {
	        this.mensaje = mensaje;
	        this.detalle = detalle;
	 }

}
