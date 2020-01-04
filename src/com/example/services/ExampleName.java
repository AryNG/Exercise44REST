package com.example.services;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

	//In this part you'll need to "set" the path from whichs is going to access. 
@Path ("/MessageEx")
public class ExampleName {
	//We need in lib all the JARs inside Jersey-api (api,ext and lib)
	
	
	@POST
	public String sayHiP()
	{
		return "Welcome Unit, Post a directive";
	}
	@GET
	public String sayHiG()
	{
		return "Welcome Unit";
	}
	@PUT
	public String sayHiT()
	{
		return "Welcome Unit, Put a directive";
	}
	@DELETE
	public String sayHiD()
	{
		return "Welcome Unit, DELETE directive";
	}
	
	@HEAD
	public String sayHiH()
	{
		return "Welcome Unit, Head Directive.";
	}
	
	@OPTIONS
	public String sayHiOPT()
	{
		return "Welcome Unit, Select the Option";
	}
	@GET
	@Path ("/{name}")
	public String nameOPT(@PathParam("name") String name)
	{
		return "Welcome "+name+" Unit";
	}
	
	@POST //using Postman
	@Path("/sum/{number1}/{number2}")
	public double numbers(@PathParam("number1")double number1, @PathParam("number2")double number2) {
		return number1+number2;
	}
	@GET //QueryParamether
	@Path("/sums/")
	public double numbersSum(@QueryParam("n1")double number1, @QueryParam("n2")double number2) {
		return number1+number2;
	}
	@GET //With Json
	@Path("/rest/{n1}/{n2}")
	@Produces(MediaType.APPLICATION_JSON)
	public String rest(@PathParam("n1")double number1, @PathParam("n2")double number2) {
		String myJson = "";
		
		myJson="{\"rest\" : "+(number1-number2) + "}";
		
		return myJson;
	}
}
