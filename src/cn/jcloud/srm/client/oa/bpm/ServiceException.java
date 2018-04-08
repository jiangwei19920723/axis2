/**
 * ServiceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package cn.jcloud.srm.client.oa.bpm;

public class ServiceException extends java.lang.Exception {
    private static final long serialVersionUID = 1508237227329L;
    private cn.jcloud.srm.client.oa.bpm.BPMServiceStub.ServiceExceptionE faultMessage;

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
        cn.jcloud.srm.client.oa.bpm.BPMServiceStub.ServiceExceptionE msg) {
        faultMessage = msg;
    }

    public cn.jcloud.srm.client.oa.bpm.BPMServiceStub.ServiceExceptionE getFaultMessage() {
        return faultMessage;
    }
}
