package uy.edu.ude.rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import uy.edu.ude.dto.QuoteDto;
import uy.edu.ude.dto.ValueDto;

@Path("/")
public class QuoteEndpoint {

	private List<QuoteDto> quotedtos = Arrays.asList(
			new QuoteDto("success",
					new ValueDto(1, "Working with Spring Boot is like pair-programming with the Spring developers.")),
			new QuoteDto("success", new ValueDto(2, "With Boot you deploy everywhere you can find a JVM basically.")),
			new QuoteDto("success",
					new ValueDto(3,
							"@springboot with @springframework is pure productivity! Who said in #java one has to write double the code than in other langs? #newFavLib")),
			new QuoteDto("success",
					new ValueDto(4,
							"The real benefit of Boot, however, is that it's just Spring. That means any direction the code takes, regardless of complexity, I know it's a safe bet.")),
			new QuoteDto("success", new ValueDto(5, "Really loving Spring Boot, makes stand alone Spring apps easy.")),
			new QuoteDto("success", new ValueDto(6,
					"Previous to Spring Boot, I remember XML hell, confusing set up, and many hours of frustration.")));

	@GET
	@Path("/api")
	@Produces(MediaType.APPLICATION_JSON)
	public List<QuoteDto> getAll() {
		return quotedtos;
	}

	@GET
	@Path("/api/random")
	@Produces(MediaType.APPLICATION_JSON)
	public QuoteDto getRandom() {
		int random = (int) (Math.random() * quotedtos.size());
		return quotedtos.get(random);
	}

}
