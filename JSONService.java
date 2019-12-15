package com.karthik.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/animal")
public class JSONService {

	@GET
	@Path("/get")
	@Produces("application/json")
	public Animal getAnimalInJSON() {

		Animal animal = new Animal();
		animal.setName("Lion");
		animal.setType("Walk");
		
		return animal; 

	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createAnimalInJSON(Animal animal) {

		String result = "Animal : " + animal;
		return Response.status(201).entity(result).build();
		
	}
	
}