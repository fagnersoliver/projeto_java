package br.com.poney.ws.Impl;

public class ImplementLoginProxy implements br.com.poney.ws.Impl.ImplementLogin {
  private String _endpoint = null;
  private br.com.poney.ws.Impl.ImplementLogin implementLogin = null;
  
  public ImplementLoginProxy() {
    _initImplementLoginProxy();
  }
  
  public ImplementLoginProxy(String endpoint) {
    _endpoint = endpoint;
    _initImplementLoginProxy();
  }
  
  private void _initImplementLoginProxy() {
    try {
      implementLogin = (new br.com.poney.ws.Impl.ImplementLoginServiceLocator()).getImplementLogin();
      if (implementLogin != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)implementLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)implementLogin)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (implementLogin != null)
      ((javax.xml.rpc.Stub)implementLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.poney.ws.Impl.ImplementLogin getImplementLogin() {
    if (implementLogin == null)
      _initImplementLoginProxy();
    return implementLogin;
  }
  
  public br.com.poney.ws.bean.BeanLogin validaLogin(br.com.poney.ws.bean.BeanLogin obj) throws java.rmi.RemoteException{
    if (implementLogin == null)
      _initImplementLoginProxy();
    return implementLogin.validaLogin(obj);
  }
  
  
}