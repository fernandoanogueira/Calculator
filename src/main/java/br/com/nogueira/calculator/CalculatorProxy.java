package br.com.nogueira.calculator;

public class CalculatorProxy implements br.com.nogueira.calculator.Calculator {
  private String _endpoint = null;
  private br.com.nogueira.calculator.Calculator calculator = null;
  
  public CalculatorProxy() {
    _initCalculatorProxy();
  }
  
  public CalculatorProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorProxy();
  }
  
  private void _initCalculatorProxy() {
    try {
      calculator = (new br.com.nogueira.calculator.CalculatorServiceLocator()).getCalculator();
      if (calculator != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculator)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculator != null)
      ((javax.xml.rpc.Stub)calculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.nogueira.calculator.Calculator getCalculator() {
    if (calculator == null)
      _initCalculatorProxy();
    return calculator;
  }
  
  public long add(long firstNumber, long secondNumber) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.add(firstNumber, secondNumber);
  }
  
  public java.math.BigDecimal divide(long firstNumber, long secondNumber) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.divide(firstNumber, secondNumber);
  }
  
  public long multiply(long firstNumber, long secondNumber) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.multiply(firstNumber, secondNumber);
  }
  
  public long subtract(long firstNumber, long secondNumber) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.subtract(firstNumber, secondNumber);
  }
  
  
}