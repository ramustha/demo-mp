package com.example.demo.client;

import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@RegisterRestClient
@RegisterClientHeaders
@ApplicationScoped
public interface Service {

    @GET
    @Path("auth/token")
    String doSomething(@PathParam("parameter") String parameter);

}
