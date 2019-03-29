package com.productreview.exceptions;

public class ReviewProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 2947390810342987567L;

	public ReviewProductNotFoundException(String message) {
		super(message);
	}
}
