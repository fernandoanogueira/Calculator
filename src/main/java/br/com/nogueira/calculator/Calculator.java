/**
 * Calculator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.nogueira.calculator;

public interface Calculator extends java.rmi.Remote {
    public long add(long firstNumber, long secondNumber) throws java.rmi.RemoteException;
    public java.math.BigDecimal divide(long firstNumber, long secondNumber) throws java.rmi.RemoteException;
    public long multiply(long firstNumber, long secondNumber) throws java.rmi.RemoteException;
    public long subtract(long firstNumber, long secondNumber) throws java.rmi.RemoteException;
}
