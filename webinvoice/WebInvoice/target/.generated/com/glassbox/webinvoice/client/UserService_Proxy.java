package com.glassbox.webinvoice.client;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class UserService_Proxy extends RemoteServiceProxy implements com.glassbox.webinvoice.client.UserServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.glassbox.webinvoice.client.UserService";
  private static final String SERIALIZATION_POLICY ="B7B1DDB172D1F02BD980CE7F2D6A1BCE";
  private static final com.glassbox.webinvoice.client.UserService_TypeSerializer SERIALIZER = new com.glassbox.webinvoice.client.UserService_TypeSerializer();
  
  public UserService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "services/userService", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void findUser(java.lang.String email, java.lang.String password, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("UserService_Proxy", "findUser");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(email);
      streamWriter.writeString(password);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void rigesterUser(java.lang.String firstName, java.lang.String lastName, java.lang.String[] emails, java.lang.String password, com.glassbox.webinvoice.shared.entity.AuState state, int postCode, java.lang.String suburb, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("UserService_Proxy", "rigesterUser");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 7);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("[Ljava.lang.String;/2600011424");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("com.glassbox.webinvoice.shared.entity.AuState/222852153");
      streamWriter.writeString("I");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(firstName);
      streamWriter.writeString(lastName);
      streamWriter.writeObject(emails);
      streamWriter.writeString(password);
      streamWriter.writeObject(state);
      streamWriter.writeInt(postCode);
      streamWriter.writeString(suburb);
      helper.finish(callback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
