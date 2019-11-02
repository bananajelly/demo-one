package com.example.demo.one.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.lang.management.ManagementFactory;
import java.util.concurrent.TimeUnit;

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

    @GET
    @Path("uptime")
    public Response uptime() {

        long uptime = ManagementFactory.getRuntimeMXBean().getUptime();

        return Response.ok(String.format("Uptime %d min, %d sec",
                TimeUnit.MILLISECONDS.toMinutes(uptime),
                TimeUnit.MILLISECONDS.toSeconds(uptime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(uptime))))
                .type(MediaType.APPLICATION_JSON)
                .encoding("UTF-8")
                .build();
    }
}
