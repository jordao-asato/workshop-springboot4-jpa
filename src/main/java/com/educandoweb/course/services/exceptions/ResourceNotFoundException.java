package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	// id do objeto que tentamos encontrar mas falhamos
	public ResourceNotFoundException(Object id) {
		super("Resource not found! Id " + id);
	}

}
