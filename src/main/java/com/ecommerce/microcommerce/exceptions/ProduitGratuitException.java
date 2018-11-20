package com.ecommerce.microcommerce.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends RuntimeException {
	 public ProduitGratuitException(String message)
	 {
		 super(message);
	 }

}
