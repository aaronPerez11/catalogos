package com.verificador.catalogos.utils;

public interface Constantes {
	
	String CONTEXT_ROOT = "/";
	String CONTEXT_PATH_MARCAS = "marcas";
	String CONTEXT_PATH_GASOLINERAS = "gasolineras";
	String CONTEXT_MARCAS = CONTEXT_ROOT+CONTEXT_PATH_MARCAS;
	String CONTEXT_ID = CONTEXT_ROOT+"{id}";
	String CONTEXT_GASOLINERAS = CONTEXT_ID+CONTEXT_ROOT+CONTEXT_PATH_GASOLINERAS;
}
