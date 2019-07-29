package com.kiran.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/movie")
public class InsertDetails {
	
	@GET
	@Path("/st/{type}/{date_}/{time_}/{place}")
	@Produces(MediaType.TEXT_PLAIN)
	public String insertDetails(@PathParam("type") String type,
			@PathParam("date_") String date, @PathParam("time_") String time,
			@PathParam("place") String place) {
		System.out.println(type +"   "+date+"   "+time+"	"+place);
		return "success";
	}
	
	
	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_XML)
	public String insertDetails2(@QueryParam("type") String type,
			@QueryParam("date_") String date, @QueryParam("time_") String time,
			@QueryParam("place") String place) {
		
		System.out.println(type +"   "+date+"   "+time+"	"+place);
		return "<result><success>success</success></result>";
	}
	
	
	@GET
	@Path("/matrix")
	@Produces(MediaType.APPLICATION_JSON)
	public String insertDetails3(@MatrixParam("type") String type,
			@MatrixParam("date_") String date, @MatrixParam("time_") String time,
			@MatrixParam("place") String place) {
		
		System.out.println(type +"   "+date+"   "+time+"	"+place);
		return "{\"success\", \"success\"}";
	}
	
	
	@POST
	@Path("/form")
	@Produces(MediaType.TEXT_HTML)
	public String insertDetails4(@FormParam("type") String type,
			@FormParam("date_") String date, @FormParam("time_") String time,
			@FormParam("place") String place) {
		
		System.out.println(type +"   "+date+"   "+time+"	"+place);
		return "<html><body>Success</body></html>";
	}
}
