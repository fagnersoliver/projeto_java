package br.com.fagner.poneyjaxws.ws.intface;

public class ProductWSProxy implements br.com.fagner.poneyjaxws.ws.intface.ProductWS {
  private String _endpoint = null;
  private br.com.fagner.poneyjaxws.ws.intface.ProductWS productWS = null;
  
  public ProductWSProxy() {
    _initProductWSProxy();
  }
  
  public ProductWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductWSProxy();
  }
  
  private void _initProductWSProxy() {
    try {
      productWS = (new br.com.fagner.poneyjaxws.ws.impl.ProductWSImplServiceLocator()).getProductWSImplPort();
      if (productWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productWS != null)
      ((javax.xml.rpc.Stub)productWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.fagner.poneyjaxws.ws.intface.ProductWS getProductWS() {
    if (productWS == null)
      _initProductWSProxy();
    return productWS;
  }
  
  public br.com.fagner.poneyjaxws.ws.intface.Product find() throws java.rmi.RemoteException{
    if (productWS == null)
      _initProductWSProxy();
    return productWS.find();
  }
  
  public br.com.fagner.poneyjaxws.ws.intface.Product[] findAll() throws java.rmi.RemoteException{
    if (productWS == null)
      _initProductWSProxy();
    return productWS.findAll();
  }
  
  
}