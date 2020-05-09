package com.jserver.api;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/status")
public class Status {

  private static class StatusResponse {
    public Date date;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public StatusResponse getStatus() {
    StatusResponse response = new StatusResponse();
    response.date = new Date();
    return response;
  }

}