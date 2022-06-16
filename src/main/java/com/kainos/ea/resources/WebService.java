package com.kainos.ea.resources;

import io.swagger.annotations.Api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/api")
@Api("Engineering Academy Dropwizard API")
public class WebService {

    /*@GET
    @Path("/print/{msg}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getMsg(@PathParam("msg") String message) {
        return "Hello from a RESTful Web service: " + message;
    }

    @POST
    @Path("/print")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String sendMsg(Message message) {
        return "Hello from a RESTful Web service: " + message.getText();
    }*/

    @GET
    @Path("/print/{msg}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getMsg(@PathParam("msg") String message) {
        return "Hello from a RESTful Web service: " + message;
    }

    @POST
    @Path("/print")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String sendEmployeeDetails(Employee employee) {
        return "Employee Number: " + employee.getEmployeeID()
                + "Employee Name: " + employee.getEmployeeName()
                + "National Insurance Number: " + employee.getNationalInsurance()
                + "Bank Account Number: " + employee.getBankAccountNo()
                + "Starting Salary: " + employee.getStartingSalary()
                + "Address: " + employee.getEmployeeAddress()
                + "DepartmentID: " + employee.getDepartmentID();
    }
}
