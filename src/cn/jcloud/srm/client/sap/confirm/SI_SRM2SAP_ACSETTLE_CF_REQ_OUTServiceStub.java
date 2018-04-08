
/**
 * SI_SRM2SAP_ACSETTLE_CF_REQ_OUTServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
        package cn.jcloud.srm.client.sap.confirm;

        

        /*
        *  SI_SRM2SAP_ACSETTLE_CF_REQ_OUTServiceStub java implementation
        */

        
        public class SI_SRM2SAP_ACSETTLE_CF_REQ_OUTServiceStub extends org.apache.axis2.client.Stub
        implements SI_SRM2SAP_ACSETTLE_CF_REQ_OUTService{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("SI_SRM2SAP_ACSETTLE_CF_REQ_OUTService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];
        
                    __operation = new org.apache.axis2.description.OutOnlyAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://zjunma.com/TRAUM/SRM/ECC", "sI_SRM2SAP_ACSETTLE_CF_REQ_OUT"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         


    }

    /**
      *Constructor that takes in a configContext
      */

    public SI_SRM2SAP_ACSETTLE_CF_REQ_OUTServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public SI_SRM2SAP_ACSETTLE_CF_REQ_OUTServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public SI_SRM2SAP_ACSETTLE_CF_REQ_OUTServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://pidev.zjunma.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_SRM&receiverParty=&receiverService=&interface=SI_SRM2SAP_ACSETTLE_CF_REQ_OUT&interfaceNamespace=http%3A%2F%2Fzjunma.com%2FTRAUM%2FSRM%2FECC" );
                
    }

    /**
     * Default Constructor
     */
    public SI_SRM2SAP_ACSETTLE_CF_REQ_OUTServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("http://pidev.zjunma.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_SRM&receiverParty=&receiverService=&interface=SI_SRM2SAP_ACSETTLE_CF_REQ_OUT&interfaceNamespace=http%3A%2F%2Fzjunma.com%2FTRAUM%2FSRM%2FECC" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public SI_SRM2SAP_ACSETTLE_CF_REQ_OUTServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



         
                
                /**
                  * Auto generated method signature
                  * 
                  */
                public void  sI_SRM2SAP_ACSETTLE_CF_REQ_OUT(
                 cn.jcloud.srm.client.sap.confirm.MT_ACSETTLE_CF_REQ mT_ACSETTLE_CF_REQ1

                ) throws java.rmi.RemoteException
                
                
                {
                org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                
                org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
                _operationClient.getOptions().setAction("http://sap.com/xi/WebService/soap1.1");
                _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

                
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              
                org.apache.axiom.soap.SOAPEnvelope env = null;

                
                                                    //Style is Doc.
                                                    
                                                                    
                                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                                    mT_ACSETTLE_CF_REQ1,
                                                                    optimizeContent(new javax.xml.namespace.QName("http://zjunma.com/TRAUM/SRM/ECC", "sI_SRM2SAP_ACSETTLE_CF_REQ_OUT")),
                                                                    new javax.xml.namespace.QName("http://zjunma.com/TRAUM/SRM/ECC", "MT_ACSETTLE_CF_REQ"));
                                                                

              //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
                // create message context with that soap envelope

            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

             _operationClient.execute(true);

           
              if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
              }
           
             return;
           }
            
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://pidev.zjunma.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_SRM&receiverParty=&receiverService=&interface=SI_SRM2SAP_ACSETTLE_CF_REQ_OUT&interfaceNamespace=http%3A%2F%2Fzjunma.com%2FTRAUM%2FSRM%2FECC
            private  org.apache.axiom.om.OMElement  toOM(cn.jcloud.srm.client.sap.confirm.MT_ACSETTLE_CF_REQ param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(cn.jcloud.srm.client.sap.confirm.MT_ACSETTLE_CF_REQ.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.jcloud.srm.client.sap.confirm.MT_ACSETTLE_CF_REQ param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(cn.jcloud.srm.client.sap.confirm.MT_ACSETTLE_CF_REQ.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault{

        try {
        
                if (cn.jcloud.srm.client.sap.confirm.MT_ACSETTLE_CF_REQ.class.equals(type)){
                
                        return cn.jcloud.srm.client.sap.confirm.MT_ACSETTLE_CF_REQ.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   