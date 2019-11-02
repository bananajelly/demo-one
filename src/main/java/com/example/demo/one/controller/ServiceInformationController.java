package com.example.demo.one.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("service-info")
@Api("Service Information API")
public class ServiceInformationController {

    @GET
    @ApiOperation("Check application status")
    public Response info() {
        return Response.ok("It works!")
                .type(MediaType.APPLICATION_JSON)
                .encoding("UTF-8")
                .build();
    }
}
