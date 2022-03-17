package br.com.nogueira.calculator;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;
import javax.xml.ws.WebServiceRef;

public class Main {
	
	@WebServiceRef(wsdlLocation="http://localhost:8080/CalculatorService/services/Calculator?wsdl")
	static CalculatorService service;

	public static void main(String[] args) throws ServiceException, RemoteException {
		
		Calculator port = service.getCalculator();
		
		port.add(2, 5);
		
	}
	
	
}
