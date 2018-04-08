
/**
 * DT_ACSETTLE_CF_REQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:58 BST)
 */

            
                package cn.jcloud.srm.client.sap.confirm;
            

            /**
            *  DT_ACSETTLE_CF_REQ bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class DT_ACSETTLE_CF_REQ
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = DT_ACSETTLE_CF_REQ
                Namespace URI = http://zjunma.com/TRAUM/SRM/ECC
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for TP_HEADER
                        */

                        
                                    protected cn.jcloud.srm.client.sap.confirm.DT_HEADER localTP_HEADER ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.zjunma.traum.srm.ecc.DT_HEADER
                           */
                           public  cn.jcloud.srm.client.sap.confirm.DT_HEADER getTP_HEADER(){
                               return localTP_HEADER;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TP_HEADER
                               */
                               public void setTP_HEADER(cn.jcloud.srm.client.sap.confirm.DT_HEADER param){
                            
                                            this.localTP_HEADER=param;
                                       

                               }
                            

                        /**
                        * field for ACSETTLE_CONFIRM_REQ
                        * This was an Array!
                        */

                        
                                    protected cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0[] localACSETTLE_CONFIRM_REQ ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.zjunma.traum.srm.ecc.ACSETTLE_CONFIRM_REQ_type0[]
                           */
                           public  cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0[] getACSETTLE_CONFIRM_REQ(){
                               return localACSETTLE_CONFIRM_REQ;
                           }

                           
                        


                               
                              /**
                               * validate the array for ACSETTLE_CONFIRM_REQ
                               */
                              protected void validateACSETTLE_CONFIRM_REQ(cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param ACSETTLE_CONFIRM_REQ
                              */
                              public void setACSETTLE_CONFIRM_REQ(cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0[] param){
                              
                                   validateACSETTLE_CONFIRM_REQ(param);

                               
                                      this.localACSETTLE_CONFIRM_REQ=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.zjunma.traum.srm.ecc.ACSETTLE_CONFIRM_REQ_type0
                             */
                             public void addACSETTLE_CONFIRM_REQ(cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0 param){
                                   if (localACSETTLE_CONFIRM_REQ == null){
                                   localACSETTLE_CONFIRM_REQ = new cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localACSETTLE_CONFIRM_REQ);
                               list.add(param);
                               this.localACSETTLE_CONFIRM_REQ =
                             (cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0[])list.toArray(
                            new cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this,parentQName));
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://zjunma.com/TRAUM/SRM/ECC");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":DT_ACSETTLE_CF_REQ",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "DT_ACSETTLE_CF_REQ",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localTP_HEADER==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TP_HEADER cannot be null!!");
                                            }
                                           localTP_HEADER.serialize(new javax.xml.namespace.QName("","TP_HEADER"),
                                               xmlWriter);
                                        
                                       if (localACSETTLE_CONFIRM_REQ!=null){
                                            for (int i = 0;i < localACSETTLE_CONFIRM_REQ.length;i++){
                                                if (localACSETTLE_CONFIRM_REQ[i] != null){
                                                 localACSETTLE_CONFIRM_REQ[i].serialize(new javax.xml.namespace.QName("","ACSETTLE_CONFIRM_REQ"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                           throw new org.apache.axis2.databinding.ADBException("ACSETTLE_CONFIRM_REQ cannot be null!!");
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("ACSETTLE_CONFIRM_REQ cannot be null!!");
                                        
                                    }
                                 
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://zjunma.com/TRAUM/SRM/ECC")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
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
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace,attName,attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace,attName,attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
                    xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
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
    public static class Factory{
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static DT_ACSETTLE_CF_REQ parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            DT_ACSETTLE_CF_REQ object =
                new DT_ACSETTLE_CF_REQ();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();
                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"DT_ACSETTLE_CF_REQ".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DT_ACSETTLE_CF_REQ)cn.jcloud.srm.client.sap.confirm.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","TP_HEADER").equals(reader.getName()) || new javax.xml.namespace.QName("","TP_HEADER").equals(reader.getName()) ){
                                
                                                object.setTP_HEADER(cn.jcloud.srm.client.sap.confirm.DT_HEADER.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ACSETTLE_CONFIRM_REQ").equals(reader.getName()) || new javax.xml.namespace.QName("","ACSETTLE_CONFIRM_REQ").equals(reader.getName()) ){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                    list2.add(cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","ACSETTLE_CONFIRM_REQ").equals(reader.getName())){
                                                                    list2.add(cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setACSETTLE_CONFIRM_REQ((cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                cn.jcloud.srm.client.sap.confirm.ACSETTLE_CONFIRM_REQ_type0.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // 2 - A start element we are not expecting indicates a trailing invalid property
                                
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    