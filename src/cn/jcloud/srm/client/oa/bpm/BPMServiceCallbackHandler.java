/**
 * BPMServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package cn.jcloud.srm.client.oa.bpm;


/**
 *  BPMServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class BPMServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public BPMServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public BPMServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for receiveThirdpartyForm method
     * override this method for handling normal response from receiveThirdpartyForm operation
     */
    public void receiveResultreceiveThirdpartyForm(
        cn.jcloud.srm.client.oa.bpm.BPMServiceStub.ReceiveThirdpartyFormResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from receiveThirdpartyForm operation
     */
    public void receiveErrorreceiveThirdpartyForm(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for launchHtmlCollaboration method
     * override this method for handling normal response from launchHtmlCollaboration operation
     */
    public void receiveResultlaunchHtmlCollaboration(
        cn.jcloud.srm.client.oa.bpm.BPMServiceStub.LaunchHtmlCollaborationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from launchHtmlCollaboration operation
     */
    public void receiveErrorlaunchHtmlCollaboration(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFormCollIdsByDateTimeRest method
     * override this method for handling normal response from getFormCollIdsByDateTimeRest operation
     */
    public void receiveResultgetFormCollIdsByDateTimeRest(
        cn.jcloud.srm.client.oa.bpm.BPMServiceStub.GetFormCollIdsByDateTimeRestResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFormCollIdsByDateTimeRest operation
     */
    public void receiveErrorgetFormCollIdsByDateTimeRest(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for launchFormCollaboration method
     * override this method for handling normal response from launchFormCollaboration operation
     */
    public void receiveResultlaunchFormCollaboration(
        cn.jcloud.srm.client.oa.bpm.BPMServiceStub.LaunchFormCollaborationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from launchFormCollaboration operation
     */
    public void receiveErrorlaunchFormCollaboration(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getTemplateDefinition method
     * override this method for handling normal response from getTemplateDefinition operation
     */
    public void receiveResultgetTemplateDefinition(
        cn.jcloud.srm.client.oa.bpm.BPMServiceStub.GetTemplateDefinitionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getTemplateDefinition operation
     */
    public void receiveErrorgetTemplateDefinition(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFlowState method
     * override this method for handling normal response from getFlowState operation
     */
    public void receiveResultgetFlowState(
        cn.jcloud.srm.client.oa.bpm.BPMServiceStub.GetFlowStateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFlowState operation
     */
    public void receiveErrorgetFlowState(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFormCollIdsByDateTime method
     * override this method for handling normal response from getFormCollIdsByDateTime operation
     */
    public void receiveResultgetFormCollIdsByDateTime(
        cn.jcloud.srm.client.oa.bpm.BPMServiceStub.GetFormCollIdsByDateTimeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFormCollIdsByDateTime operation
     */
    public void receiveErrorgetFormCollIdsByDateTime(java.lang.Exception e) {
    }
}
