package com.finastra.sme.rest;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/booking-manager")
public class BookingManagerController {
	
	@Get("/")
	public String createDeal() {
		return "For testing...";
	}

}
