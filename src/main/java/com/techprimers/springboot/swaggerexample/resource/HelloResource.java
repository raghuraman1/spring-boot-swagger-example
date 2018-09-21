package com.techprimers.springboot.swaggerexample.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "HelloWorld Resource", description = "shows hello world")
public class HelloResource {

    @ApiOperation(value = "Returns Hello World")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Hello World")
            }
    )
    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @ApiOperation(value = "Returns Hello World")
    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello) {
        return hello;
    }

    @ApiOperation(value = "Returns Hello World")
    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }
    
    @ApiOperation(value = "Uses Abc", response=Abc.class)
   
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved resource"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @PostMapping("/abc")
    public Abc abc(@RequestBody  @Valid final Abc hello) {
        return hello;
    }
}

