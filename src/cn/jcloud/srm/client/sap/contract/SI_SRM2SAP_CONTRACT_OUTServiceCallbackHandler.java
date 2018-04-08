
/**
 * SI_SRM2SAP_CONTRACT_OUTServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */

    package cn.jcloud.srm.client.sap.contract;

    /**
     *  SI_SRM2SAP_CONTRACT_OUTServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SI_SRM2SAP_CONTRACT_OUTServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SI_SRM2SAP_CONTRACT_OUTServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SI_SRM2SAP_CONTRACT_OUTServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for sI_SRM2SAP_CONTRACT_OUT method
            * override this method for handling normal response from sI_SRM2SAP_CONTRACT_OUT operation
            */
           public void receiveResultsI_SRM2SAP_CONTRACT_OUT(
                    cn.jcloud.srm.client.sap.contract.MT_CONTRACT_RES result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sI_SRM2SAP_CONTRACT_OUT operation
           */
            public void receiveErrorsI_SRM2SAP_CONTRACT_OUT(java.lang.Exception e) {
            }
                


    }
    