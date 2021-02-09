package com.estudo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("/echo")
public class Estudo {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String exemplo() throws JsonProcessingException {
		String result = "";

		User user = new User();
		user.setId(1);
		user.setNome("Testando....");

		result = new ObjectMapper().writeValueAsString(user);

		return result;
	}
}
