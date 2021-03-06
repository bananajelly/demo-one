package com.example.demo.one.controller;

import com.example.demo.one.dto.Item;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/items")
@Api("Items API")
public class ItemController {

    @POST
    @ApiOperation("Save item to wishlist")
    public Response saveItem(@Valid Item item) {
        return Response.ok(item)
                .type(MediaType.APPLICATION_JSON)
                .encoding("UTF-8")
                .build();
    }
}
