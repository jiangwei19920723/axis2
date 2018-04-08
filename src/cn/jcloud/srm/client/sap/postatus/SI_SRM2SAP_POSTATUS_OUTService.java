

/**
 * SI_SRM2SAP_POSTATUS_OUTService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */

    package cn.jcloud.srm.client.sap.postatus;

    /*
     *  SI_SRM2SAP_POSTATUS_OUTService java interface
     */

    public interface SI_SRM2SAP_POSTATUS_OUTService {
          

        /**
          * Auto generated method signature
          * 
                    * @param mT_POSTATUS_REQ0
                
         */

         
                     public cn.jcloud.srm.client.sap.postatus.MT_POSTATUS_RES sI_SRM2SAP_POSTATUS_OUT(

                        cn.jcloud.srm.client.sap.postatus.MT_POSTATUS_REQ mT_POSTATUS_REQ0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param mT_POSTATUS_REQ0
            
          */
        public void startsI_SRM2SAP_POSTATUS_OUT(

            cn.jcloud.srm.client.sap.postatus.MT_POSTATUS_REQ mT_POSTATUS_REQ0,

            final cn.jcloud.srm.client.sap.postatus.SI_SRM2SAP_POSTATUS_OUTServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    