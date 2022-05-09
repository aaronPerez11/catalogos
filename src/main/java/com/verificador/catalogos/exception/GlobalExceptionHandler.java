package com.verificador.catalogos.exception;


import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.verificador.catalogos.utils.enums.TipoErrorEnum;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ExceptionNotFound.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public final ResponseEntity<Object> handlerExceptionNotFound(final ExceptionNotFound exception, WebRequest request) {
		List<String> details = new ArrayList<>();
		details.add(exception.getLocalizedMessage());
		
		return new ResponseEntity<Object>(new ErrorResponseModel(TipoErrorEnum.NOT_FOUND.getError(), details),
				HttpStatus.NOT_FOUND);
				
	}
	
	@ExceptionHandler(ExceptionBadRequest.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public final ResponseEntity<Object> handlerExceptionBadRequest(ExceptionBadRequest exception, WebRequest request) {
		List<String> details = new ArrayList<>();
		details.add(exception.getLocalizedMessage());

		return new ResponseEntity<Object>(new ErrorResponseModel(TipoErrorEnum.BAD_REQUEST.getError(), details),
				HttpStatus.BAD_REQUEST);
	}
}
