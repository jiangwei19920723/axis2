

/**
 * SI_SRM2SAP_CONTRACT_OUTService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */

    package cn.jcloud.srm.client.sap.contract;

    /*
     *  SI_SRM2SAP_CONTRACT_OUTService java interface
     */

    public interface SI_SRM2SAP_CONTRACT_OUTService {
          

        /**
          * Auto generated method signature
          * 
                    * @param mT_CONTRACT_REQ0
                
         */

         
                     public cn.jcloud.srm.client.sap.contract.MT_CONTRACT_RES sI_SRM2SAP_CONTRACT_OUT(

                        cn.jcloud.srm.client.sap.contract.MT_CONTRACT_REQ mT_CONTRACT_REQ0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param mT_CONTRACT_REQ0
            
          */
        public void startsI_SRM2SAP_CONTRACT_OUT(

            cn.jcloud.srm.client.sap.contract.MT_CONTRACT_REQ mT_CONTRACT_REQ0,

            final cn.jcloud.srm.client.sap.contract.SI_SRM2SAP_CONTRACT_OUTServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    