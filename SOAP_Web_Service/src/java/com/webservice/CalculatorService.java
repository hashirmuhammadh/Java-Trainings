/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hashir
 */
@WebService(serviceName = "CalculatorService")
public class CalculatorService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "sum")
     // @WebParam annotation indicates parameters to method coming from SOAP request.
     public int sum(@WebParam(name = "num1") int num1, 
                   @WebParam(name = "num2") int num2) {
        
        int sum = 0;
        
        sum = num1 + num2;
        
        return sum;
     }
     
     @WebMethod(operationName = "mul")
     // @WebParam annotation indicates parameters to method coming from SOAP request.
     public int mul(@WebParam(name = "num1") int num1, 
                   @WebParam(name = "num2") int num2) {
        
        int mul ;
        
        mul = num1 * num2;
        
        return mul;
     }
     
      @WebMethod(operationName = "div")
     // @WebParam annotation indicates parameters to method coming from SOAP request.
     public int div(@WebParam(name = "num1") int num1, 
                   @WebParam(name = "num2") int num2) {
        
        int div ;
        
        div = num1 / num2;
        
        return div;
     }
     
      
      @WebMethod(operationName = "sub")
     // @WebParam annotation indicates parameters to method coming from SOAP request.
     public int sub(@WebParam(name = "num1") int num1, 
                   @WebParam(name = "num2") int num2) {
        
        int sub ;
        
        sub = num1 - num2;
        
        return sub;
     }
}
