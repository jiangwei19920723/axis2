/**
 * ServiceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package cn.jcloud.srm.client.oa.authority;

public class ServiceException extends java.lang.Exception {
    private static final long serialVersionUID = 1508209862804L;
    private cn.jcloud.srm.client.oa.authority.AuthorityServiceStub.ServiceExceptionE faultMessage;

    public ServiceException() {
        super("ServiceException");
    }

    public ServiceException(java.lang.String s) {
        super(s);
    }

    public ServiceException(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public ServiceException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        cn.jcloud.srm.client.oa.authority.AuthorityServiceStub.ServiceExceptionE msg) {
        faultMessage = msg;
    }

    public cn.jcloud.srm.client.oa.authority.AuthorityServiceStub.ServiceExceptionE getFaultMessage() {
        return faultMessage;
    }
}
