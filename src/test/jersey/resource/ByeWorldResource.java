package test.jersey.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/byeworld")
public class ByeWorldResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Bye World RESTful Jersey!";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello World RESTful Jersey"
				+ "</hello>";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_JSON)
	public String sayHtmlHello() {
		return "<html> " + "<title>" + "Bye World RESTful Jersey"
				+ "</title>" + "<body><h1>" + "Bye World RESTful Jersey"
				+ "</body></h1>" + "</html> ";
	}

}