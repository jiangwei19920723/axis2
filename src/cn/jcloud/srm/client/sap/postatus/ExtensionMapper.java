
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:58 BST)
 */

        
            package cn.jcloud.srm.client.sap.postatus;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://zjunma.com/TRAUM/SRM/ECC".equals(namespaceURI) &&
                  "DT_HEADER".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.postatus.DT_HEADER.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/SRM/ECC".equals(namespaceURI) &&
                  "DT_POSTATUS_REQ".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.postatus.DT_POSTATUS_REQ.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/SRM/ECC".equals(namespaceURI) &&
                  "POSTATUS_RES_type0".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.postatus.POSTATUS_RES_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/SRM/ECC".equals(namespaceURI) &&
                  "POSTATUS_REQ_type0".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.postatus.POSTATUS_REQ_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/SRM/ECC".equals(namespaceURI) &&
                  "DT_POSTATUS_RES".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.postatus.DT_POSTATUS_RES.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    