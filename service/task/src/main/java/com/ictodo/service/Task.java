package com.ictodo.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ictodo.exception.SomeException;
import com.ictodo.model.Product;

@Path("/hello")
public class Task {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        new Product();
        try {
            throw new SomeException();
        } catch (SomeException e) {
            System.out.println("Test");
        }
        return "Hello from RESTEasy Reactive";
    }
}