package br.com.fagner.poneyjaxws.ws.intface;

public class DemoInterfaceProxy implements br.com.fagner.poneyjaxws.ws.intface.DemoInterface {
  private String _endpoint = null;
  private br.com.fagner.poneyjaxws.ws.intface.DemoInterface demoInterface = null;
  
  public DemoInterfaceProxy() {
    _initDemoInterfaceProxy();
  }
  
  public DemoInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initDemoInterfaceProxy();
  }
  
  private void _initDemoInterfaceProxy() {
    try {
      demoInterface = (new br.com.fagner.poneyjaxws.ws.impl.DemoInterfaceImplServiceLocator()).getDemoInterfaceImplPort();
      if (demoInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)demoInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)demoInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (demoInterface != null)
      ((javax.xml.rpc.Stub)demoInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.fagner.poneyjaxws.ws.intface.DemoInterface getDemoInterface() {
    if (demoInterface == null)
      _initDemoInterfaceProxy();
    return demoInterface;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (demoInterface == null)
      _initDemoInterfaceProxy();
    return demoInterface.helloWorld();
  }
  
  public java.lang.String hi(java.lang.String arg0) throws java.rmi.RemoteException{
    if (demoInterface == null)
      _initDemoInterfaceProxy();
    return demoInterface.hi(arg0);
  }
  
  
}