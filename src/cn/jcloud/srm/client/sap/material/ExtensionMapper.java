
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:58 BST)
 */

        
            package cn.jcloud.srm.client.sap.material;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://zjunma.com/TRAUM/ALL/ECC".equals(namespaceURI) &&
                  "DT_HEADER".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.material.DT_HEADER.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/ALL/ECC".equals(namespaceURI) &&
                  "MATERIAL_REQ_type0".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.material.MATERIAL_REQ_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/ALL/ECC".equals(namespaceURI) &&
                  "DT_MATERIAL_REQUEST".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.material.DT_MATERIAL_REQUEST.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    