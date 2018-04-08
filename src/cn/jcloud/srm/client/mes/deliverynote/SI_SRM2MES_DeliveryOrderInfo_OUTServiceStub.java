/**
 * SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package cn.jcloud.srm.client.mes.deliverynote;


/*
 *  SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub java implementation
 */
public class SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub extends org.apache.axis2.client.Stub {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     *Constructor that takes in a configContext
     */
    public SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
    }

    /**
     * Default Constructor
     */
    public SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "http://pidev.zjunma.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_SRM&receiverParty=&receiverService=&interface=SI_SRM2MES_DeliveryOrderInfo_OUT&interfaceNamespace=http%3A%2F%2Fzjunma.com%2FTRAUM%2FSRM%2FMES-XY");
    }

    /**
     * Default Constructor
     */
    public SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub()
        throws org.apache.axis2.AxisFault {
        this(
            "http://pidev.zjunma.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_SRM&receiverParty=&receiverService=&interface=SI_SRM2MES_DeliveryOrderInfo_OUT&interfaceNamespace=http%3A%2F%2Fzjunma.com%2FTRAUM%2FSRM%2FMES-XY");
    }

    /**
     * Constructor taking the target endpoint
     */
    public SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub(
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService(
                "SI_SRM2MES_DeliveryOrderInfo_OUTService" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://zjunma.com/TRAUM/SRM/MES-XY",
                "sI_SRM2MES_DeliveryOrderInfo_OUT"));
        _service.addOperation(__operation);

        _operations[0] = __operation;
    }

    //populates the faults
    private void populateFaults() {
    }

    /**
     * Auto generated method signature
     *
     * @see cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTService#sI_SRM2MES_DeliveryOrderInfo_OUT
     * @param getDeliveryOrderData
     */
    public cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderDataResponse sI_SRM2MES_DeliveryOrderInfo_OUT(
        cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderData getDeliveryOrderData)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://sap.com/xi/WebService/soap1.1");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getDeliveryOrderData,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://zjunma.com/TRAUM/SRM/MES-XY",
                            "sI_SRM2MES_DeliveryOrderInfo_OUT")),
                    new javax.xml.namespace.QName(
                        "http://MEIYANG_MES_SRM_Interface.org/",
                        "GetDeliveryOrderData"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderDataResponse.class);

            return (cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderDataResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(),
                                "SI_SRM2MES_DeliveryOrderInfo_OUT"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "SI_SRM2MES_DeliveryOrderInfo_OUT"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "SI_SRM2MES_DeliveryOrderInfo_OUT"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

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

    private org.apache.axiom.om.OMElement toOM(
        cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderData param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderData.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderDataResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderDataResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderData param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderData.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderData.class.equals(
                        type)) {
                return cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderDataResponse.class.equals(
                        type)) {
                return cn.jcloud.srm.client.mes.deliverynote.SI_SRM2MES_DeliveryOrderInfo_OUTServiceStub.GetDeliveryOrderDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    //http://pidev.zjunma.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BC_SRM&receiverParty=&receiverService=&interface=SI_SRM2MES_DeliveryOrderInfo_OUT&interfaceNamespace=http%3A%2F%2Fzjunma.com%2FTRAUM%2FSRM%2FMES-XY
    public static class GetDeliveryOrderData implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://MEIYANG_MES_SRM_Interface.org/",
                "GetDeliveryOrderData", "ns1");

        /**
         * field for P
         */
        protected DeliveryOrderInfo localP;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPTracker = false;

        public boolean isPSpecified() {
            return localPTracker;
        }

        /**
         * Auto generated getter method
         * @return DeliveryOrderInfo
         */
        public DeliveryOrderInfo getP() {
            return localP;
        }

        /**
         * Auto generated setter method
         * @param param P
         */
        public void setP(DeliveryOrderInfo param) {
            localPTracker = param != null;

            this.localP = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://MEIYANG_MES_SRM_Interface.org/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":GetDeliveryOrderData", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "GetDeliveryOrderData", xmlWriter);
                }
            }

            if (localPTracker) {
                if (localP == null) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "p cannot be null!!");
                }

                localP.serialize(new javax.xml.namespace.QName(
                        "http://MEIYANG_MES_SRM_Interface.org/", "p"), xmlWriter);
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://MEIYANG_MES_SRM_Interface.org/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetDeliveryOrderData parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetDeliveryOrderData object = new GetDeliveryOrderData();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"GetDeliveryOrderData".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetDeliveryOrderData) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/", "p").equals(
                                reader.getName())) ||
                            new javax.xml.namespace.QName("", "p").equals(
                                reader.getName())) {
                        object.setP(DeliveryOrderInfo.Factory.parse(reader));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeliveryOrderInfo implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = DeliveryOrderInfo
           Namespace URI = http://MEIYANG_MES_SRM_Interface.org/
           Namespace Prefix = ns1
         */

        /**
         * field for Header
         */
        protected DeliveryOrder_Head localHeader;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localHeaderTracker = false;

        /**
         * field for StrucList
         */
        protected ArrayOfDeliveryOrderStruct localStrucList;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStrucListTracker = false;

        public boolean isHeaderSpecified() {
            return localHeaderTracker;
        }

        /**
         * Auto generated getter method
         * @return DeliveryOrder_Head
         */
        public DeliveryOrder_Head getHeader() {
            return localHeader;
        }

        /**
         * Auto generated setter method
         * @param param Header
         */
        public void setHeader(DeliveryOrder_Head param) {
            localHeaderTracker = param != null;

            this.localHeader = param;
        }

        public boolean isStrucListSpecified() {
            return localStrucListTracker;
        }

        /**
         * Auto generated getter method
         * @return ArrayOfDeliveryOrderStruct
         */
        public ArrayOfDeliveryOrderStruct getStrucList() {
            return localStrucList;
        }

        /**
         * Auto generated setter method
         * @param param StrucList
         */
        public void setStrucList(ArrayOfDeliveryOrderStruct param) {
            localStrucListTracker = param != null;

            this.localStrucList = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://MEIYANG_MES_SRM_Interface.org/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":DeliveryOrderInfo", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "DeliveryOrderInfo", xmlWriter);
                }
            }

            if (localHeaderTracker) {
                if (localHeader == null) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "header cannot be null!!");
                }

                localHeader.serialize(new javax.xml.namespace.QName(
                        "http://MEIYANG_MES_SRM_Interface.org/", "header"),
                    xmlWriter);
            }

            if (localStrucListTracker) {
                if (localStrucList == null) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "strucList cannot be null!!");
                }

                localStrucList.serialize(new javax.xml.namespace.QName(
                        "http://MEIYANG_MES_SRM_Interface.org/", "strucList"),
                    xmlWriter);
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://MEIYANG_MES_SRM_Interface.org/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeliveryOrderInfo parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeliveryOrderInfo object = new DeliveryOrderInfo();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"DeliveryOrderInfo".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (DeliveryOrderInfo) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "header").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "header").equals(
                                reader.getName())) {
                        object.setHeader(DeliveryOrder_Head.Factory.parse(
                                reader));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "strucList").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "strucList").equals(
                                reader.getName())) {
                        object.setStrucList(ArrayOfDeliveryOrderStruct.Factory.parse(
                                reader));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class ReturnDeliverOrderInfo implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = ReturnDeliverOrderInfo
           Namespace URI = http://MEIYANG_MES_SRM_Interface.org/
           Namespace Prefix = ns1
         */

        /**
         * field for ReDeliveryOrderResultList
         */
        protected ArrayOfReturnDeliveryOrderResult localReDeliveryOrderResultList;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localReDeliveryOrderResultListTracker = false;

        public boolean isReDeliveryOrderResultListSpecified() {
            return localReDeliveryOrderResultListTracker;
        }

        /**
         * Auto generated getter method
         * @return ArrayOfReturnDeliveryOrderResult
         */
        public ArrayOfReturnDeliveryOrderResult getReDeliveryOrderResultList() {
            return localReDeliveryOrderResultList;
        }

        /**
         * Auto generated setter method
         * @param param ReDeliveryOrderResultList
         */
        public void setReDeliveryOrderResultList(
            ArrayOfReturnDeliveryOrderResult param) {
            localReDeliveryOrderResultListTracker = param != null;

            this.localReDeliveryOrderResultList = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://MEIYANG_MES_SRM_Interface.org/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":ReturnDeliverOrderInfo", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "ReturnDeliverOrderInfo", xmlWriter);
                }
            }

            if (localReDeliveryOrderResultListTracker) {
                if (localReDeliveryOrderResultList == null) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "reDeliveryOrderResultList cannot be null!!");
                }

                localReDeliveryOrderResultList.serialize(new javax.xml.namespace.QName(
                        "http://MEIYANG_MES_SRM_Interface.org/",
                        "reDeliveryOrderResultList"), xmlWriter);
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://MEIYANG_MES_SRM_Interface.org/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ReturnDeliverOrderInfo parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                ReturnDeliverOrderInfo object = new ReturnDeliverOrderInfo();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"ReturnDeliverOrderInfo".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (ReturnDeliverOrderInfo) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "reDeliveryOrderResultList").equals(
                                reader.getName())) ||
                            new javax.xml.namespace.QName("",
                                "reDeliveryOrderResultList").equals(
                                reader.getName())) {
                        object.setReDeliveryOrderResultList(ArrayOfReturnDeliveryOrderResult.Factory.parse(
                                reader));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class GetDeliveryOrderDataResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://MEIYANG_MES_SRM_Interface.org/",
                "GetDeliveryOrderDataResponse", "ns1");

        /**
         * field for GetDeliveryOrderDataResult
         */
        protected ReturnDeliverOrderInfo localGetDeliveryOrderDataResult;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localGetDeliveryOrderDataResultTracker = false;

        public boolean isGetDeliveryOrderDataResultSpecified() {
            return localGetDeliveryOrderDataResultTracker;
        }

        /**
         * Auto generated getter method
         * @return ReturnDeliverOrderInfo
         */
        public ReturnDeliverOrderInfo getGetDeliveryOrderDataResult() {
            return localGetDeliveryOrderDataResult;
        }

        /**
         * Auto generated setter method
         * @param param GetDeliveryOrderDataResult
         */
        public void setGetDeliveryOrderDataResult(ReturnDeliverOrderInfo param) {
            localGetDeliveryOrderDataResultTracker = param != null;

            this.localGetDeliveryOrderDataResult = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://MEIYANG_MES_SRM_Interface.org/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":GetDeliveryOrderDataResponse",
                        xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "GetDeliveryOrderDataResponse", xmlWriter);
                }
            }

            if (localGetDeliveryOrderDataResultTracker) {
                if (localGetDeliveryOrderDataResult == null) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "GetDeliveryOrderDataResult cannot be null!!");
                }

                localGetDeliveryOrderDataResult.serialize(new javax.xml.namespace.QName(
                        "http://MEIYANG_MES_SRM_Interface.org/",
                        "GetDeliveryOrderDataResult"), xmlWriter);
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://MEIYANG_MES_SRM_Interface.org/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetDeliveryOrderDataResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetDeliveryOrderDataResponse object = new GetDeliveryOrderDataResponse();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"GetDeliveryOrderDataResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetDeliveryOrderDataResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "GetDeliveryOrderDataResult").equals(
                                reader.getName())) ||
                            new javax.xml.namespace.QName("",
                                "GetDeliveryOrderDataResult").equals(
                                reader.getName())) {
                        object.setGetDeliveryOrderDataResult(ReturnDeliverOrderInfo.Factory.parse(
                                reader));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class ExtensionMapper {
        public static java.lang.Object getTypeObject(
            java.lang.String namespaceURI, java.lang.String typeName,
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            if ("http://MEIYANG_MES_SRM_Interface.org/".equals(namespaceURI) &&
                    "DeliveryOrderInfo".equals(typeName)) {
                return DeliveryOrderInfo.Factory.parse(reader);
            }

            if ("http://MEIYANG_MES_SRM_Interface.org/".equals(namespaceURI) &&
                    "ReturnDeliverOrderInfo".equals(typeName)) {
                return ReturnDeliverOrderInfo.Factory.parse(reader);
            }

            if ("http://MEIYANG_MES_SRM_Interface.org/".equals(namespaceURI) &&
                    "DeliveryOrderItem".equals(typeName)) {
                return DeliveryOrderItem.Factory.parse(reader);
            }

            if ("http://MEIYANG_MES_SRM_Interface.org/".equals(namespaceURI) &&
                    "ArrayOfDeliveryOrderItem".equals(typeName)) {
                return ArrayOfDeliveryOrderItem.Factory.parse(reader);
            }

            if ("http://MEIYANG_MES_SRM_Interface.org/".equals(namespaceURI) &&
                    "ReturnDeliveryOrderResult".equals(typeName)) {
                return ReturnDeliveryOrderResult.Factory.parse(reader);
            }

            if ("http://MEIYANG_MES_SRM_Interface.org/".equals(namespaceURI) &&
                    "ArrayOfReturnDeliveryOrderResult".equals(typeName)) {
                return ArrayOfReturnDeliveryOrderResult.Factory.parse(reader);
            }

            if ("http://MEIYANG_MES_SRM_Interface.org/".equals(namespaceURI) &&
                    "ArrayOfDeliveryOrderStruct".equals(typeName)) {
                return ArrayOfDeliveryOrderStruct.Factory.parse(reader);
            }

            if ("http://MEIYANG_MES_SRM_Interface.org/".equals(namespaceURI) &&
                    "DeliveryOrder_Head".equals(typeName)) {
                return DeliveryOrder_Head.Factory.parse(reader);
            }

            if ("http://MEIYANG_MES_SRM_Interface.org/".equals(namespaceURI) &&
                    "DeliveryOrderStruct".equals(typeName)) {
                return DeliveryOrderStruct.Factory.parse(reader);
            }

            throw new org.apache.axis2.databinding.ADBException(
                "Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class DeliveryOrderItem implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = DeliveryOrderItem
           Namespace URI = http://MEIYANG_MES_SRM_Interface.org/
           Namespace Prefix = ns1
         */

        /**
         * field for MaterialPlan_line
         */
        protected java.lang.String localMaterialPlan_line;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMaterialPlan_lineTracker = false;

        /**
         * field for Mater_code
         */
        protected java.lang.String localMater_code;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMater_codeTracker = false;

        /**
         * field for Mater_name
         */
        protected java.lang.String localMater_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMater_nameTracker = false;

        /**
         * field for Unit
         */
        protected java.lang.String localUnit;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localUnitTracker = false;

        /**
         * field for Need_count
         */
        protected java.lang.String localNeed_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNeed_countTracker = false;

        /**
         * field for Order_this
         */
        protected java.lang.String localOrder_this;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localOrder_thisTracker = false;

        /**
         * field for Vin
         */
        protected java.lang.String localVin;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localVinTracker = false;

        /**
         * field for Car_type
         */
        protected java.lang.String localCar_type;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localCar_typeTracker = false;

        /**
         * field for FREEUSE1
         */
        protected java.lang.String localFREEUSE1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFREEUSE1Tracker = false;

        /**
         * field for FREEUSE2
         */
        protected java.lang.String localFREEUSE2;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFREEUSE2Tracker = false;

        /**
         * field for FREEUSE3
         */
        protected java.lang.String localFREEUSE3;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFREEUSE3Tracker = false;

        /**
         * field for FREEUSE4
         */
        protected java.lang.String localFREEUSE4;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFREEUSE4Tracker = false;

        /**
         * field for FREEUSE5
         */
        protected java.lang.String localFREEUSE5;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFREEUSE5Tracker = false;

        public boolean isMaterialPlan_lineSpecified() {
            return localMaterialPlan_lineTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMaterialPlan_line() {
            return localMaterialPlan_line;
        }

        /**
         * Auto generated setter method
         * @param param MaterialPlan_line
         */
        public void setMaterialPlan_line(java.lang.String param) {
            localMaterialPlan_lineTracker = param != null;

            this.localMaterialPlan_line = param;
        }

        public boolean isMater_codeSpecified() {
            return localMater_codeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMater_code() {
            return localMater_code;
        }

        /**
         * Auto generated setter method
         * @param param Mater_code
         */
        public void setMater_code(java.lang.String param) {
            localMater_codeTracker = param != null;

            this.localMater_code = param;
        }

        public boolean isMater_nameSpecified() {
            return localMater_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMater_name() {
            return localMater_name;
        }

        /**
         * Auto generated setter method
         * @param param Mater_name
         */
        public void setMater_name(java.lang.String param) {
            localMater_nameTracker = param != null;

            this.localMater_name = param;
        }

        public boolean isUnitSpecified() {
            return localUnitTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getUnit() {
            return localUnit;
        }

        /**
         * Auto generated setter method
         * @param param Unit
         */
        public void setUnit(java.lang.String param) {
            localUnitTracker = param != null;

            this.localUnit = param;
        }

        public boolean isNeed_countSpecified() {
            return localNeed_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getNeed_count() {
            return localNeed_count;
        }

        /**
         * Auto generated setter method
         * @param param Need_count
         */
        public void setNeed_count(java.lang.String param) {
            localNeed_countTracker = param != null;

            this.localNeed_count = param;
        }

        public boolean isOrder_thisSpecified() {
            return localOrder_thisTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getOrder_this() {
            return localOrder_this;
        }

        /**
         * Auto generated setter method
         * @param param Order_this
         */
        public void setOrder_this(java.lang.String param) {
            localOrder_thisTracker = param != null;

            this.localOrder_this = param;
        }

        public boolean isVinSpecified() {
            return localVinTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getVin() {
            return localVin;
        }

        /**
         * Auto generated setter method
         * @param param Vin
         */
        public void setVin(java.lang.String param) {
            localVinTracker = param != null;

            this.localVin = param;
        }

        public boolean isCar_typeSpecified() {
            return localCar_typeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getCar_type() {
            return localCar_type;
        }

        /**
         * Auto generated setter method
         * @param param Car_type
         */
        public void setCar_type(java.lang.String param) {
            localCar_typeTracker = param != null;

            this.localCar_type = param;
        }

        public boolean isFREEUSE1Specified() {
            return localFREEUSE1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getFREEUSE1() {
            return localFREEUSE1;
        }

        /**
         * Auto generated setter method
         * @param param FREEUSE1
         */
        public void setFREEUSE1(java.lang.String param) {
            localFREEUSE1Tracker = param != null;

            this.localFREEUSE1 = param;
        }

        public boolean isFREEUSE2Specified() {
            return localFREEUSE2Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getFREEUSE2() {
            return localFREEUSE2;
        }

        /**
         * Auto generated setter method
         * @param param FREEUSE2
         */
        public void setFREEUSE2(java.lang.String param) {
            localFREEUSE2Tracker = param != null;

            this.localFREEUSE2 = param;
        }

        public boolean isFREEUSE3Specified() {
            return localFREEUSE3Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getFREEUSE3() {
            return localFREEUSE3;
        }

        /**
         * Auto generated setter method
         * @param param FREEUSE3
         */
        public void setFREEUSE3(java.lang.String param) {
            localFREEUSE3Tracker = param != null;

            this.localFREEUSE3 = param;
        }

        public boolean isFREEUSE4Specified() {
            return localFREEUSE4Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getFREEUSE4() {
            return localFREEUSE4;
        }

        /**
         * Auto generated setter method
         * @param param FREEUSE4
         */
        public void setFREEUSE4(java.lang.String param) {
            localFREEUSE4Tracker = param != null;

            this.localFREEUSE4 = param;
        }

        public boolean isFREEUSE5Specified() {
            return localFREEUSE5Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getFREEUSE5() {
            return localFREEUSE5;
        }

        /**
         * Auto generated setter method
         * @param param FREEUSE5
         */
        public void setFREEUSE5(java.lang.String param) {
            localFREEUSE5Tracker = param != null;

            this.localFREEUSE5 = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://MEIYANG_MES_SRM_Interface.org/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":DeliveryOrderItem", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "DeliveryOrderItem", xmlWriter);
                }
            }

            if (localMaterialPlan_lineTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "materialPlan_line",
                    xmlWriter);

                if (localMaterialPlan_line == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "materialPlan_line cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMaterialPlan_line);
                }

                xmlWriter.writeEndElement();
            }

            if (localMater_codeTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "mater_code", xmlWriter);

                if (localMater_code == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "mater_code cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMater_code);
                }

                xmlWriter.writeEndElement();
            }

            if (localMater_nameTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "mater_name", xmlWriter);

                if (localMater_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "mater_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMater_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localUnitTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "unit", xmlWriter);

                if (localUnit == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "unit cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localUnit);
                }

                xmlWriter.writeEndElement();
            }

            if (localNeed_countTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "need_count", xmlWriter);

                if (localNeed_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "need_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localNeed_count);
                }

                xmlWriter.writeEndElement();
            }

            if (localOrder_thisTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "order_this", xmlWriter);

                if (localOrder_this == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "order_this cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localOrder_this);
                }

                xmlWriter.writeEndElement();
            }

            if (localVinTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "vin", xmlWriter);

                if (localVin == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "vin cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localVin);
                }

                xmlWriter.writeEndElement();
            }

            if (localCar_typeTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "car_type", xmlWriter);

                if (localCar_type == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "car_type cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localCar_type);
                }

                xmlWriter.writeEndElement();
            }

            if (localFREEUSE1Tracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "FREEUSE1", xmlWriter);

                if (localFREEUSE1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "FREEUSE1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localFREEUSE1);
                }

                xmlWriter.writeEndElement();
            }

            if (localFREEUSE2Tracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "FREEUSE2", xmlWriter);

                if (localFREEUSE2 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "FREEUSE2 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localFREEUSE2);
                }

                xmlWriter.writeEndElement();
            }

            if (localFREEUSE3Tracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "FREEUSE3", xmlWriter);

                if (localFREEUSE3 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "FREEUSE3 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localFREEUSE3);
                }

                xmlWriter.writeEndElement();
            }

            if (localFREEUSE4Tracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "FREEUSE4", xmlWriter);

                if (localFREEUSE4 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "FREEUSE4 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localFREEUSE4);
                }

                xmlWriter.writeEndElement();
            }

            if (localFREEUSE5Tracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "FREEUSE5", xmlWriter);

                if (localFREEUSE5 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "FREEUSE5 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localFREEUSE5);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://MEIYANG_MES_SRM_Interface.org/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeliveryOrderItem parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeliveryOrderItem object = new DeliveryOrderItem();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"DeliveryOrderItem".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (DeliveryOrderItem) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "materialPlan_line").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("",
                                "materialPlan_line").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "materialPlan_line" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMaterialPlan_line(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "mater_code").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "mater_code").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "mater_code" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMater_code(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "mater_name").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "mater_name").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "mater_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMater_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/", "unit").equals(
                                reader.getName())) ||
                            new javax.xml.namespace.QName("", "unit").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "unit" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setUnit(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "need_count").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "need_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "need_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNeed_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "order_this").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "order_this").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "order_this" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setOrder_this(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/", "vin").equals(
                                reader.getName())) ||
                            new javax.xml.namespace.QName("", "vin").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "vin" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setVin(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "car_type").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "car_type").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "car_type" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setCar_type(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "FREEUSE1").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "FREEUSE1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FREEUSE1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFREEUSE1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "FREEUSE2").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "FREEUSE2").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FREEUSE2" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFREEUSE2(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "FREEUSE3").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "FREEUSE3").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FREEUSE3" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFREEUSE3(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "FREEUSE4").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "FREEUSE4").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FREEUSE4" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFREEUSE4(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "FREEUSE5").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "FREEUSE5").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FREEUSE5" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFREEUSE5(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class ArrayOfDeliveryOrderItem implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = ArrayOfDeliveryOrderItem
           Namespace URI = http://MEIYANG_MES_SRM_Interface.org/
           Namespace Prefix = ns1
         */

        /**
         * field for DeliveryOrderItem
         * This was an Array!
         */
        protected DeliveryOrderItem[] localDeliveryOrderItem;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDeliveryOrderItemTracker = false;

        public boolean isDeliveryOrderItemSpecified() {
            return localDeliveryOrderItemTracker;
        }

        /**
         * Auto generated getter method
         * @return DeliveryOrderItem[]
         */
        public DeliveryOrderItem[] getDeliveryOrderItem() {
            return localDeliveryOrderItem;
        }

        /**
         * validate the array for DeliveryOrderItem
         */
        protected void validateDeliveryOrderItem(DeliveryOrderItem[] param) {
        }

        /**
         * Auto generated setter method
         * @param param DeliveryOrderItem
         */
        public void setDeliveryOrderItem(DeliveryOrderItem[] param) {
            validateDeliveryOrderItem(param);

            localDeliveryOrderItemTracker = true;

            this.localDeliveryOrderItem = param;
        }

        /**
         * Auto generated add method for the array for convenience
         * @param param DeliveryOrderItem
         */
        public void addDeliveryOrderItem(DeliveryOrderItem param) {
            if (localDeliveryOrderItem == null) {
                localDeliveryOrderItem = new DeliveryOrderItem[] {  };
            }

            //update the setting tracker
            localDeliveryOrderItemTracker = true;

            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localDeliveryOrderItem);
            list.add(param);
            this.localDeliveryOrderItem = (DeliveryOrderItem[]) list.toArray(new DeliveryOrderItem[list.size()]);
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://MEIYANG_MES_SRM_Interface.org/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":ArrayOfDeliveryOrderItem", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "ArrayOfDeliveryOrderItem", xmlWriter);
                }
            }

            if (localDeliveryOrderItemTracker) {
                if (localDeliveryOrderItem != null) {
                    for (int i = 0; i < localDeliveryOrderItem.length; i++) {
                        if (localDeliveryOrderItem[i] != null) {
                            localDeliveryOrderItem[i].serialize(new javax.xml.namespace.QName(
                                    "http://MEIYANG_MES_SRM_Interface.org/",
                                    "DeliveryOrderItem"), xmlWriter);
                        } else {
                            writeStartElement(null,
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "DeliveryOrderItem", xmlWriter);

                            // write the nil attribute
                            writeAttribute("xsi",
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", "1", xmlWriter);
                            xmlWriter.writeEndElement();
                        }
                    }
                } else {
                    writeStartElement(null,
                        "http://MEIYANG_MES_SRM_Interface.org/",
                        "DeliveryOrderItem", xmlWriter);

                    // write the nil attribute
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                    xmlWriter.writeEndElement();
                }
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://MEIYANG_MES_SRM_Interface.org/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ArrayOfDeliveryOrderItem parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                ArrayOfDeliveryOrderItem object = new ArrayOfDeliveryOrderItem();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"ArrayOfDeliveryOrderItem".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (ArrayOfDeliveryOrderItem) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "DeliveryOrderItem").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("",
                                "DeliveryOrderItem").equals(reader.getName())) {
                        // Process the array and step past its final element's end.
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            list1.add(null);
                            reader.next();
                        } else {
                            list1.add(DeliveryOrderItem.Factory.parse(reader));
                        }

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;

                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();

                            // Step out of this element
                            reader.next();

                            // Step to next element event.
                            while (!reader.isStartElement() &&
                                    !reader.isEndElement())
                                reader.next();

                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName(
                                            "http://MEIYANG_MES_SRM_Interface.org/",
                                            "DeliveryOrderItem").equals(
                                            reader.getName())) {
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                            "nil");

                                    if ("true".equals(nillableValue) ||
                                            "1".equals(nillableValue)) {
                                        list1.add(null);
                                        reader.next();
                                    } else {
                                        list1.add(DeliveryOrderItem.Factory.parse(
                                                reader));
                                    }
                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }

                        // call the converter utility  to convert and set the array
                        object.setDeliveryOrderItem((DeliveryOrderItem[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                DeliveryOrderItem.class, list1));
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class ReturnDeliveryOrderResult implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = ReturnDeliveryOrderResult
           Namespace URI = http://MEIYANG_MES_SRM_Interface.org/
           Namespace Prefix = ns1
         */

        /**
         * field for Asnid
         */
        protected java.lang.String localAsnid;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localAsnidTracker = false;

        /**
         * field for ZTYPE
         */
        protected org.apache.axis2.databinding.types.UnsignedShort localZTYPE;

        /**
         * field for ZMESSAGE
         */
        protected java.lang.String localZMESSAGE;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localZMESSAGETracker = false;

        public boolean isAsnidSpecified() {
            return localAsnidTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getAsnid() {
            return localAsnid;
        }

        /**
         * Auto generated setter method
         * @param param Asnid
         */
        public void setAsnid(java.lang.String param) {
            localAsnidTracker = param != null;

            this.localAsnid = param;
        }

        /**
         * Auto generated getter method
         * @return org.apache.axis2.databinding.types.UnsignedShort
         */
        public org.apache.axis2.databinding.types.UnsignedShort getZTYPE() {
            return localZTYPE;
        }

        /**
         * Auto generated setter method
         * @param param ZTYPE
         */
        public void setZTYPE(
            org.apache.axis2.databinding.types.UnsignedShort param) {
            this.localZTYPE = param;
        }

        public boolean isZMESSAGESpecified() {
            return localZMESSAGETracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getZMESSAGE() {
            return localZMESSAGE;
        }

        /**
         * Auto generated setter method
         * @param param ZMESSAGE
         */
        public void setZMESSAGE(java.lang.String param) {
            localZMESSAGETracker = param != null;

            this.localZMESSAGE = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://MEIYANG_MES_SRM_Interface.org/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":ReturnDeliveryOrderResult",
                        xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "ReturnDeliveryOrderResult", xmlWriter);
                }
            }

            if (localAsnidTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "asnid", xmlWriter);

                if (localAsnid == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "asnid cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localAsnid);
                }

                xmlWriter.writeEndElement();
            }

            namespace = "http://MEIYANG_MES_SRM_Interface.org/";
            writeStartElement(null, namespace, "ZTYPE", xmlWriter);

            if (localZTYPE == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ZTYPE cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localZTYPE));
            }

            xmlWriter.writeEndElement();

            if (localZMESSAGETracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "ZMESSAGE", xmlWriter);

                if (localZMESSAGE == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "ZMESSAGE cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localZMESSAGE);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://MEIYANG_MES_SRM_Interface.org/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ReturnDeliveryOrderResult parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                ReturnDeliveryOrderResult object = new ReturnDeliveryOrderResult();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"ReturnDeliveryOrderResult".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (ReturnDeliveryOrderResult) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/", "asnid").equals(
                                reader.getName())) ||
                            new javax.xml.namespace.QName("", "asnid").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "asnid" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setAsnid(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/", "ZTYPE").equals(
                                reader.getName())) ||
                            new javax.xml.namespace.QName("", "ZTYPE").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "ZTYPE" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setZTYPE(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedShort(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // 1 - A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "ZMESSAGE").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "ZMESSAGE").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "ZMESSAGE" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setZMESSAGE(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class ArrayOfReturnDeliveryOrderResult implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = ArrayOfReturnDeliveryOrderResult
           Namespace URI = http://MEIYANG_MES_SRM_Interface.org/
           Namespace Prefix = ns1
         */

        /**
         * field for ReturnDeliveryOrderResult
         * This was an Array!
         */
        protected ReturnDeliveryOrderResult[] localReturnDeliveryOrderResult;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localReturnDeliveryOrderResultTracker = false;

        public boolean isReturnDeliveryOrderResultSpecified() {
            return localReturnDeliveryOrderResultTracker;
        }

        /**
         * Auto generated getter method
         * @return ReturnDeliveryOrderResult[]
         */
        public ReturnDeliveryOrderResult[] getReturnDeliveryOrderResult() {
            return localReturnDeliveryOrderResult;
        }

        /**
         * validate the array for ReturnDeliveryOrderResult
         */
        protected void validateReturnDeliveryOrderResult(
            ReturnDeliveryOrderResult[] param) {
        }

        /**
         * Auto generated setter method
         * @param param ReturnDeliveryOrderResult
         */
        public void setReturnDeliveryOrderResult(
            ReturnDeliveryOrderResult[] param) {
            validateReturnDeliveryOrderResult(param);

            localReturnDeliveryOrderResultTracker = true;

            this.localReturnDeliveryOrderResult = param;
        }

        /**
         * Auto generated add method for the array for convenience
         * @param param ReturnDeliveryOrderResult
         */
        public void addReturnDeliveryOrderResult(
            ReturnDeliveryOrderResult param) {
            if (localReturnDeliveryOrderResult == null) {
                localReturnDeliveryOrderResult = new ReturnDeliveryOrderResult[] {
                        
                    };
            }

            //update the setting tracker
            localReturnDeliveryOrderResultTracker = true;

            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localReturnDeliveryOrderResult);
            list.add(param);
            this.localReturnDeliveryOrderResult = (ReturnDeliveryOrderResult[]) list.toArray(new ReturnDeliveryOrderResult[list.size()]);
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://MEIYANG_MES_SRM_Interface.org/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":ArrayOfReturnDeliveryOrderResult",
                        xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "ArrayOfReturnDeliveryOrderResult", xmlWriter);
                }
            }

            if (localReturnDeliveryOrderResultTracker) {
                if (localReturnDeliveryOrderResult != null) {
                    for (int i = 0; i < localReturnDeliveryOrderResult.length;
                            i++) {
                        if (localReturnDeliveryOrderResult[i] != null) {
                            localReturnDeliveryOrderResult[i].serialize(new javax.xml.namespace.QName(
                                    "http://MEIYANG_MES_SRM_Interface.org/",
                                    "ReturnDeliveryOrderResult"), xmlWriter);
                        } else {
                            writeStartElement(null,
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "ReturnDeliveryOrderResult", xmlWriter);

                            // write the nil attribute
                            writeAttribute("xsi",
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", "1", xmlWriter);
                            xmlWriter.writeEndElement();
                        }
                    }
                } else {
                    writeStartElement(null,
                        "http://MEIYANG_MES_SRM_Interface.org/",
                        "ReturnDeliveryOrderResult", xmlWriter);

                    // write the nil attribute
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                    xmlWriter.writeEndElement();
                }
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://MEIYANG_MES_SRM_Interface.org/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ArrayOfReturnDeliveryOrderResult parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                ArrayOfReturnDeliveryOrderResult object = new ArrayOfReturnDeliveryOrderResult();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"ArrayOfReturnDeliveryOrderResult".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (ArrayOfReturnDeliveryOrderResult) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "ReturnDeliveryOrderResult").equals(
                                reader.getName())) ||
                            new javax.xml.namespace.QName("",
                                "ReturnDeliveryOrderResult").equals(
                                reader.getName())) {
                        // Process the array and step past its final element's end.
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            list1.add(null);
                            reader.next();
                        } else {
                            list1.add(ReturnDeliveryOrderResult.Factory.parse(
                                    reader));
                        }

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;

                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();

                            // Step out of this element
                            reader.next();

                            // Step to next element event.
                            while (!reader.isStartElement() &&
                                    !reader.isEndElement())
                                reader.next();

                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName(
                                            "http://MEIYANG_MES_SRM_Interface.org/",
                                            "ReturnDeliveryOrderResult").equals(
                                            reader.getName())) {
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                            "nil");

                                    if ("true".equals(nillableValue) ||
                                            "1".equals(nillableValue)) {
                                        list1.add(null);
                                        reader.next();
                                    } else {
                                        list1.add(ReturnDeliveryOrderResult.Factory.parse(
                                                reader));
                                    }
                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }

                        // call the converter utility  to convert and set the array
                        object.setReturnDeliveryOrderResult((ReturnDeliveryOrderResult[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                ReturnDeliveryOrderResult.class, list1));
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class ArrayOfDeliveryOrderStruct implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = ArrayOfDeliveryOrderStruct
           Namespace URI = http://MEIYANG_MES_SRM_Interface.org/
           Namespace Prefix = ns1
         */

        /**
         * field for DeliveryOrderStruct
         * This was an Array!
         */
        protected DeliveryOrderStruct[] localDeliveryOrderStruct;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDeliveryOrderStructTracker = false;

        public boolean isDeliveryOrderStructSpecified() {
            return localDeliveryOrderStructTracker;
        }

        /**
         * Auto generated getter method
         * @return DeliveryOrderStruct[]
         */
        public DeliveryOrderStruct[] getDeliveryOrderStruct() {
            return localDeliveryOrderStruct;
        }

        /**
         * validate the array for DeliveryOrderStruct
         */
        protected void validateDeliveryOrderStruct(DeliveryOrderStruct[] param) {
        }

        /**
         * Auto generated setter method
         * @param param DeliveryOrderStruct
         */
        public void setDeliveryOrderStruct(DeliveryOrderStruct[] param) {
            validateDeliveryOrderStruct(param);

            localDeliveryOrderStructTracker = true;

            this.localDeliveryOrderStruct = param;
        }

        /**
         * Auto generated add method for the array for convenience
         * @param param DeliveryOrderStruct
         */
        public void addDeliveryOrderStruct(DeliveryOrderStruct param) {
            if (localDeliveryOrderStruct == null) {
                localDeliveryOrderStruct = new DeliveryOrderStruct[] {  };
            }

            //update the setting tracker
            localDeliveryOrderStructTracker = true;

            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localDeliveryOrderStruct);
            list.add(param);
            this.localDeliveryOrderStruct = (DeliveryOrderStruct[]) list.toArray(new DeliveryOrderStruct[list.size()]);
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://MEIYANG_MES_SRM_Interface.org/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":ArrayOfDeliveryOrderStruct",
                        xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "ArrayOfDeliveryOrderStruct", xmlWriter);
                }
            }

            if (localDeliveryOrderStructTracker) {
                if (localDeliveryOrderStruct != null) {
                    for (int i = 0; i < localDeliveryOrderStruct.length; i++) {
                        if (localDeliveryOrderStruct[i] != null) {
                            localDeliveryOrderStruct[i].serialize(new javax.xml.namespace.QName(
                                    "http://MEIYANG_MES_SRM_Interface.org/",
                                    "DeliveryOrderStruct"), xmlWriter);
                        } else {
                            writeStartElement(null,
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "DeliveryOrderStruct", xmlWriter);

                            // write the nil attribute
                            writeAttribute("xsi",
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", "1", xmlWriter);
                            xmlWriter.writeEndElement();
                        }
                    }
                } else {
                    writeStartElement(null,
                        "http://MEIYANG_MES_SRM_Interface.org/",
                        "DeliveryOrderStruct", xmlWriter);

                    // write the nil attribute
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                    xmlWriter.writeEndElement();
                }
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://MEIYANG_MES_SRM_Interface.org/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ArrayOfDeliveryOrderStruct parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                ArrayOfDeliveryOrderStruct object = new ArrayOfDeliveryOrderStruct();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"ArrayOfDeliveryOrderStruct".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (ArrayOfDeliveryOrderStruct) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "DeliveryOrderStruct").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("",
                                "DeliveryOrderStruct").equals(reader.getName())) {
                        // Process the array and step past its final element's end.
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            list1.add(null);
                            reader.next();
                        } else {
                            list1.add(DeliveryOrderStruct.Factory.parse(reader));
                        }

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;

                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();

                            // Step out of this element
                            reader.next();

                            // Step to next element event.
                            while (!reader.isStartElement() &&
                                    !reader.isEndElement())
                                reader.next();

                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName(
                                            "http://MEIYANG_MES_SRM_Interface.org/",
                                            "DeliveryOrderStruct").equals(
                                            reader.getName())) {
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                            "nil");

                                    if ("true".equals(nillableValue) ||
                                            "1".equals(nillableValue)) {
                                        list1.add(null);
                                        reader.next();
                                    } else {
                                        list1.add(DeliveryOrderStruct.Factory.parse(
                                                reader));
                                    }
                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }

                        // call the converter utility  to convert and set the array
                        object.setDeliveryOrderStruct((DeliveryOrderStruct[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                DeliveryOrderStruct.class, list1));
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeliveryOrder_Head implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = DeliveryOrder_Head
           Namespace URI = http://MEIYANG_MES_SRM_Interface.org/
           Namespace Prefix = ns1
         */

        /**
         * field for MSGID
         */
        protected java.lang.String localMSGID;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMSGIDTracker = false;

        /**
         * field for BUSID
         */
        protected java.lang.String localBUSID;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBUSIDTracker = false;

        /**
         * field for TLGID
         */
        protected java.lang.String localTLGID;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTLGIDTracker = false;

        /**
         * field for TLGNAME
         */
        protected java.lang.String localTLGNAME;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTLGNAMETracker = false;

        /**
         * field for DTSEND
         */
        protected java.lang.String localDTSEND;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDTSENDTracker = false;

        /**
         * field for SENDER
         */
        protected java.lang.String localSENDER;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSENDERTracker = false;

        /**
         * field for RECEIVER
         */
        protected java.lang.String localRECEIVER;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRECEIVERTracker = false;

        /**
         * field for FREEUSE1
         */
        protected java.lang.String localFREEUSE1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFREEUSE1Tracker = false;

        public boolean isMSGIDSpecified() {
            return localMSGIDTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMSGID() {
            return localMSGID;
        }

        /**
         * Auto generated setter method
         * @param param MSGID
         */
        public void setMSGID(java.lang.String param) {
            localMSGIDTracker = param != null;

            this.localMSGID = param;
        }

        public boolean isBUSIDSpecified() {
            return localBUSIDTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBUSID() {
            return localBUSID;
        }

        /**
         * Auto generated setter method
         * @param param BUSID
         */
        public void setBUSID(java.lang.String param) {
            localBUSIDTracker = param != null;

            this.localBUSID = param;
        }

        public boolean isTLGIDSpecified() {
            return localTLGIDTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTLGID() {
            return localTLGID;
        }

        /**
         * Auto generated setter method
         * @param param TLGID
         */
        public void setTLGID(java.lang.String param) {
            localTLGIDTracker = param != null;

            this.localTLGID = param;
        }

        public boolean isTLGNAMESpecified() {
            return localTLGNAMETracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTLGNAME() {
            return localTLGNAME;
        }

        /**
         * Auto generated setter method
         * @param param TLGNAME
         */
        public void setTLGNAME(java.lang.String param) {
            localTLGNAMETracker = param != null;

            this.localTLGNAME = param;
        }

        public boolean isDTSENDSpecified() {
            return localDTSENDTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDTSEND() {
            return localDTSEND;
        }

        /**
         * Auto generated setter method
         * @param param DTSEND
         */
        public void setDTSEND(java.lang.String param) {
            localDTSENDTracker = param != null;

            this.localDTSEND = param;
        }

        public boolean isSENDERSpecified() {
            return localSENDERTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSENDER() {
            return localSENDER;
        }

        /**
         * Auto generated setter method
         * @param param SENDER
         */
        public void setSENDER(java.lang.String param) {
            localSENDERTracker = param != null;

            this.localSENDER = param;
        }

        public boolean isRECEIVERSpecified() {
            return localRECEIVERTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRECEIVER() {
            return localRECEIVER;
        }

        /**
         * Auto generated setter method
         * @param param RECEIVER
         */
        public void setRECEIVER(java.lang.String param) {
            localRECEIVERTracker = param != null;

            this.localRECEIVER = param;
        }

        public boolean isFREEUSE1Specified() {
            return localFREEUSE1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getFREEUSE1() {
            return localFREEUSE1;
        }

        /**
         * Auto generated setter method
         * @param param FREEUSE1
         */
        public void setFREEUSE1(java.lang.String param) {
            localFREEUSE1Tracker = param != null;

            this.localFREEUSE1 = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://MEIYANG_MES_SRM_Interface.org/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":DeliveryOrder_Head", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "DeliveryOrder_Head", xmlWriter);
                }
            }

            if (localMSGIDTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "MSGID", xmlWriter);

                if (localMSGID == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "MSGID cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMSGID);
                }

                xmlWriter.writeEndElement();
            }

            if (localBUSIDTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "BUSID", xmlWriter);

                if (localBUSID == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "BUSID cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBUSID);
                }

                xmlWriter.writeEndElement();
            }

            if (localTLGIDTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "TLGID", xmlWriter);

                if (localTLGID == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "TLGID cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTLGID);
                }

                xmlWriter.writeEndElement();
            }

            if (localTLGNAMETracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "TLGNAME", xmlWriter);

                if (localTLGNAME == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "TLGNAME cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTLGNAME);
                }

                xmlWriter.writeEndElement();
            }

            if (localDTSENDTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "DTSEND", xmlWriter);

                if (localDTSEND == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "DTSEND cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localDTSEND);
                }

                xmlWriter.writeEndElement();
            }

            if (localSENDERTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "SENDER", xmlWriter);

                if (localSENDER == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "SENDER cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSENDER);
                }

                xmlWriter.writeEndElement();
            }

            if (localRECEIVERTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "RECEIVER", xmlWriter);

                if (localRECEIVER == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "RECEIVER cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRECEIVER);
                }

                xmlWriter.writeEndElement();
            }

            if (localFREEUSE1Tracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "FREEUSE1", xmlWriter);

                if (localFREEUSE1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "FREEUSE1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localFREEUSE1);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://MEIYANG_MES_SRM_Interface.org/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeliveryOrder_Head parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeliveryOrder_Head object = new DeliveryOrder_Head();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"DeliveryOrder_Head".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (DeliveryOrder_Head) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/", "MSGID").equals(
                                reader.getName())) ||
                            new javax.xml.namespace.QName("", "MSGID").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "MSGID" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMSGID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/", "BUSID").equals(
                                reader.getName())) ||
                            new javax.xml.namespace.QName("", "BUSID").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BUSID" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBUSID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/", "TLGID").equals(
                                reader.getName())) ||
                            new javax.xml.namespace.QName("", "TLGID").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "TLGID" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTLGID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "TLGNAME").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "TLGNAME").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "TLGNAME" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTLGNAME(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "DTSEND").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "DTSEND").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "DTSEND" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDTSEND(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "SENDER").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "SENDER").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "SENDER" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSENDER(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "RECEIVER").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "RECEIVER").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "RECEIVER" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRECEIVER(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "FREEUSE1").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "FREEUSE1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FREEUSE1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFREEUSE1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeliveryOrderStruct implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = DeliveryOrderStruct
           Namespace URI = http://MEIYANG_MES_SRM_Interface.org/
           Namespace Prefix = ns1
         */

        /**
         * field for MaterialPlan_code
         */
        protected java.lang.String localMaterialPlan_code;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMaterialPlan_codeTracker = false;

        /**
         * field for Need_time
         */
        protected java.lang.String localNeed_time;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNeed_timeTracker = false;

        /**
         * field for Asnid
         */
        protected java.lang.String localAsnid;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localAsnidTracker = false;

        /**
         * field for Storage_location
         */
        protected java.lang.String localStorage_location;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStorage_locationTracker = false;

        /**
         * field for Supplyer_code
         */
        protected java.lang.String localSupplyer_code;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSupplyer_codeTracker = false;

        /**
         * field for Supplyer_name
         */
        protected java.lang.String localSupplyer_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSupplyer_nameTracker = false;

        /**
         * field for Wh_code
         */
        protected java.lang.String localWh_code;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localWh_codeTracker = false;

        /**
         * field for Wh_name
         */
        protected java.lang.String localWh_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localWh_nameTracker = false;

        /**
         * field for Stocker_code
         */
        protected java.lang.String localStocker_code;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStocker_codeTracker = false;

        /**
         * field for Workshop_code
         */
        protected java.lang.String localWorkshop_code;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localWorkshop_codeTracker = false;

        /**
         * field for Workshop_name
         */
        protected java.lang.String localWorkshop_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localWorkshop_nameTracker = false;

        /**
         * field for Station_code
         */
        protected java.lang.String localStation_code;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStation_codeTracker = false;

        /**
         * field for Station_name
         */
        protected java.lang.String localStation_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStation_nameTracker = false;

        /**
         * field for FREEUSE1
         */
        protected java.lang.String localFREEUSE1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFREEUSE1Tracker = false;

        /**
         * field for FREEUSE2
         */
        protected java.lang.String localFREEUSE2;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFREEUSE2Tracker = false;

        /**
         * field for FREEUSE3
         */
        protected java.lang.String localFREEUSE3;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFREEUSE3Tracker = false;

        /**
         * field for FREEUSE4
         */
        protected java.lang.String localFREEUSE4;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFREEUSE4Tracker = false;

        /**
         * field for FREEUSE5
         */
        protected java.lang.String localFREEUSE5;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localFREEUSE5Tracker = false;

        /**
         * field for ItemList
         */
        protected ArrayOfDeliveryOrderItem localItemList;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localItemListTracker = false;

        public boolean isMaterialPlan_codeSpecified() {
            return localMaterialPlan_codeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMaterialPlan_code() {
            return localMaterialPlan_code;
        }

        /**
         * Auto generated setter method
         * @param param MaterialPlan_code
         */
        public void setMaterialPlan_code(java.lang.String param) {
            localMaterialPlan_codeTracker = param != null;

            this.localMaterialPlan_code = param;
        }

        public boolean isNeed_timeSpecified() {
            return localNeed_timeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getNeed_time() {
            return localNeed_time;
        }

        /**
         * Auto generated setter method
         * @param param Need_time
         */
        public void setNeed_time(java.lang.String param) {
            localNeed_timeTracker = param != null;

            this.localNeed_time = param;
        }

        public boolean isAsnidSpecified() {
            return localAsnidTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getAsnid() {
            return localAsnid;
        }

        /**
         * Auto generated setter method
         * @param param Asnid
         */
        public void setAsnid(java.lang.String param) {
            localAsnidTracker = param != null;

            this.localAsnid = param;
        }

        public boolean isStorage_locationSpecified() {
            return localStorage_locationTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStorage_location() {
            return localStorage_location;
        }

        /**
         * Auto generated setter method
         * @param param Storage_location
         */
        public void setStorage_location(java.lang.String param) {
            localStorage_locationTracker = param != null;

            this.localStorage_location = param;
        }

        public boolean isSupplyer_codeSpecified() {
            return localSupplyer_codeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSupplyer_code() {
            return localSupplyer_code;
        }

        /**
         * Auto generated setter method
         * @param param Supplyer_code
         */
        public void setSupplyer_code(java.lang.String param) {
            localSupplyer_codeTracker = param != null;

            this.localSupplyer_code = param;
        }

        public boolean isSupplyer_nameSpecified() {
            return localSupplyer_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSupplyer_name() {
            return localSupplyer_name;
        }

        /**
         * Auto generated setter method
         * @param param Supplyer_name
         */
        public void setSupplyer_name(java.lang.String param) {
            localSupplyer_nameTracker = param != null;

            this.localSupplyer_name = param;
        }

        public boolean isWh_codeSpecified() {
            return localWh_codeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getWh_code() {
            return localWh_code;
        }

        /**
         * Auto generated setter method
         * @param param Wh_code
         */
        public void setWh_code(java.lang.String param) {
            localWh_codeTracker = param != null;

            this.localWh_code = param;
        }

        public boolean isWh_nameSpecified() {
            return localWh_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getWh_name() {
            return localWh_name;
        }

        /**
         * Auto generated setter method
         * @param param Wh_name
         */
        public void setWh_name(java.lang.String param) {
            localWh_nameTracker = param != null;

            this.localWh_name = param;
        }

        public boolean isStocker_codeSpecified() {
            return localStocker_codeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStocker_code() {
            return localStocker_code;
        }

        /**
         * Auto generated setter method
         * @param param Stocker_code
         */
        public void setStocker_code(java.lang.String param) {
            localStocker_codeTracker = param != null;

            this.localStocker_code = param;
        }

        public boolean isWorkshop_codeSpecified() {
            return localWorkshop_codeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getWorkshop_code() {
            return localWorkshop_code;
        }

        /**
         * Auto generated setter method
         * @param param Workshop_code
         */
        public void setWorkshop_code(java.lang.String param) {
            localWorkshop_codeTracker = param != null;

            this.localWorkshop_code = param;
        }

        public boolean isWorkshop_nameSpecified() {
            return localWorkshop_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getWorkshop_name() {
            return localWorkshop_name;
        }

        /**
         * Auto generated setter method
         * @param param Workshop_name
         */
        public void setWorkshop_name(java.lang.String param) {
            localWorkshop_nameTracker = param != null;

            this.localWorkshop_name = param;
        }

        public boolean isStation_codeSpecified() {
            return localStation_codeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStation_code() {
            return localStation_code;
        }

        /**
         * Auto generated setter method
         * @param param Station_code
         */
        public void setStation_code(java.lang.String param) {
            localStation_codeTracker = param != null;

            this.localStation_code = param;
        }

        public boolean isStation_nameSpecified() {
            return localStation_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStation_name() {
            return localStation_name;
        }

        /**
         * Auto generated setter method
         * @param param Station_name
         */
        public void setStation_name(java.lang.String param) {
            localStation_nameTracker = param != null;

            this.localStation_name = param;
        }

        public boolean isFREEUSE1Specified() {
            return localFREEUSE1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getFREEUSE1() {
            return localFREEUSE1;
        }

        /**
         * Auto generated setter method
         * @param param FREEUSE1
         */
        public void setFREEUSE1(java.lang.String param) {
            localFREEUSE1Tracker = param != null;

            this.localFREEUSE1 = param;
        }

        public boolean isFREEUSE2Specified() {
            return localFREEUSE2Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getFREEUSE2() {
            return localFREEUSE2;
        }

        /**
         * Auto generated setter method
         * @param param FREEUSE2
         */
        public void setFREEUSE2(java.lang.String param) {
            localFREEUSE2Tracker = param != null;

            this.localFREEUSE2 = param;
        }

        public boolean isFREEUSE3Specified() {
            return localFREEUSE3Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getFREEUSE3() {
            return localFREEUSE3;
        }

        /**
         * Auto generated setter method
         * @param param FREEUSE3
         */
        public void setFREEUSE3(java.lang.String param) {
            localFREEUSE3Tracker = param != null;

            this.localFREEUSE3 = param;
        }

        public boolean isFREEUSE4Specified() {
            return localFREEUSE4Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getFREEUSE4() {
            return localFREEUSE4;
        }

        /**
         * Auto generated setter method
         * @param param FREEUSE4
         */
        public void setFREEUSE4(java.lang.String param) {
            localFREEUSE4Tracker = param != null;

            this.localFREEUSE4 = param;
        }

        public boolean isFREEUSE5Specified() {
            return localFREEUSE5Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getFREEUSE5() {
            return localFREEUSE5;
        }

        /**
         * Auto generated setter method
         * @param param FREEUSE5
         */
        public void setFREEUSE5(java.lang.String param) {
            localFREEUSE5Tracker = param != null;

            this.localFREEUSE5 = param;
        }

        public boolean isItemListSpecified() {
            return localItemListTracker;
        }

        /**
         * Auto generated getter method
         * @return ArrayOfDeliveryOrderItem
         */
        public ArrayOfDeliveryOrderItem getItemList() {
            return localItemList;
        }

        /**
         * Auto generated setter method
         * @param param ItemList
         */
        public void setItemList(ArrayOfDeliveryOrderItem param) {
            localItemListTracker = param != null;

            this.localItemList = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://MEIYANG_MES_SRM_Interface.org/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":DeliveryOrderStruct", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "DeliveryOrderStruct", xmlWriter);
                }
            }

            if (localMaterialPlan_codeTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "materialPlan_code",
                    xmlWriter);

                if (localMaterialPlan_code == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "materialPlan_code cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMaterialPlan_code);
                }

                xmlWriter.writeEndElement();
            }

            if (localNeed_timeTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "need_time", xmlWriter);

                if (localNeed_time == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "need_time cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localNeed_time);
                }

                xmlWriter.writeEndElement();
            }

            if (localAsnidTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "asnid", xmlWriter);

                if (localAsnid == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "asnid cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localAsnid);
                }

                xmlWriter.writeEndElement();
            }

            if (localStorage_locationTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "storage_location", xmlWriter);

                if (localStorage_location == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "storage_location cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStorage_location);
                }

                xmlWriter.writeEndElement();
            }

            if (localSupplyer_codeTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "supplyer_code", xmlWriter);

                if (localSupplyer_code == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "supplyer_code cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSupplyer_code);
                }

                xmlWriter.writeEndElement();
            }

            if (localSupplyer_nameTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "supplyer_name", xmlWriter);

                if (localSupplyer_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "supplyer_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSupplyer_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localWh_codeTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "wh_code", xmlWriter);

                if (localWh_code == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "wh_code cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localWh_code);
                }

                xmlWriter.writeEndElement();
            }

            if (localWh_nameTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "wh_name", xmlWriter);

                if (localWh_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "wh_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localWh_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localStocker_codeTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "stocker_code", xmlWriter);

                if (localStocker_code == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "stocker_code cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStocker_code);
                }

                xmlWriter.writeEndElement();
            }

            if (localWorkshop_codeTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "workshop_code", xmlWriter);

                if (localWorkshop_code == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "workshop_code cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localWorkshop_code);
                }

                xmlWriter.writeEndElement();
            }

            if (localWorkshop_nameTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "workshop_name", xmlWriter);

                if (localWorkshop_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "workshop_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localWorkshop_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localStation_codeTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "station_code", xmlWriter);

                if (localStation_code == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "station_code cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStation_code);
                }

                xmlWriter.writeEndElement();
            }

            if (localStation_nameTracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "station_name", xmlWriter);

                if (localStation_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "station_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStation_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localFREEUSE1Tracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "FREEUSE1", xmlWriter);

                if (localFREEUSE1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "FREEUSE1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localFREEUSE1);
                }

                xmlWriter.writeEndElement();
            }

            if (localFREEUSE2Tracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "FREEUSE2", xmlWriter);

                if (localFREEUSE2 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "FREEUSE2 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localFREEUSE2);
                }

                xmlWriter.writeEndElement();
            }

            if (localFREEUSE3Tracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "FREEUSE3", xmlWriter);

                if (localFREEUSE3 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "FREEUSE3 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localFREEUSE3);
                }

                xmlWriter.writeEndElement();
            }

            if (localFREEUSE4Tracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "FREEUSE4", xmlWriter);

                if (localFREEUSE4 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "FREEUSE4 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localFREEUSE4);
                }

                xmlWriter.writeEndElement();
            }

            if (localFREEUSE5Tracker) {
                namespace = "http://MEIYANG_MES_SRM_Interface.org/";
                writeStartElement(null, namespace, "FREEUSE5", xmlWriter);

                if (localFREEUSE5 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "FREEUSE5 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localFREEUSE5);
                }

                xmlWriter.writeEndElement();
            }

            if (localItemListTracker) {
                if (localItemList == null) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "itemList cannot be null!!");
                }

                localItemList.serialize(new javax.xml.namespace.QName(
                        "http://MEIYANG_MES_SRM_Interface.org/", "itemList"),
                    xmlWriter);
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://MEIYANG_MES_SRM_Interface.org/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeliveryOrderStruct parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeliveryOrderStruct object = new DeliveryOrderStruct();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"DeliveryOrderStruct".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (DeliveryOrderStruct) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "materialPlan_code").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("",
                                "materialPlan_code").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "materialPlan_code" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMaterialPlan_code(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "need_time").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "need_time").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "need_time" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNeed_time(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/", "asnid").equals(
                                reader.getName())) ||
                            new javax.xml.namespace.QName("", "asnid").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "asnid" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setAsnid(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "storage_location").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "storage_location").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "storage_location" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStorage_location(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "supplyer_code").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "supplyer_code").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "supplyer_code" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSupplyer_code(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "supplyer_name").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "supplyer_name").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "supplyer_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSupplyer_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "wh_code").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "wh_code").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "wh_code" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setWh_code(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "wh_name").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "wh_name").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "wh_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setWh_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "stocker_code").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "stocker_code").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "stocker_code" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStocker_code(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "workshop_code").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "workshop_code").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "workshop_code" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setWorkshop_code(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "workshop_name").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "workshop_name").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "workshop_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setWorkshop_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "station_code").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "station_code").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "station_code" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStation_code(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "station_name").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "station_name").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "station_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStation_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "FREEUSE1").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "FREEUSE1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FREEUSE1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFREEUSE1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "FREEUSE2").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "FREEUSE2").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FREEUSE2" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFREEUSE2(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "FREEUSE3").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "FREEUSE3").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FREEUSE3" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFREEUSE3(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "FREEUSE4").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "FREEUSE4").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FREEUSE4" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFREEUSE4(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "FREEUSE5").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "FREEUSE5").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "FREEUSE5" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setFREEUSE5(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                "http://MEIYANG_MES_SRM_Interface.org/",
                                "itemList").equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", "itemList").equals(
                                reader.getName())) {
                        object.setItemList(ArrayOfDeliveryOrderItem.Factory.parse(
                                reader));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }
}
