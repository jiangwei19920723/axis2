
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:58 BST)
 */

        
            package cn.jcloud.srm.client.sap.acsettle;
        
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
                   
                            return  cn.jcloud.srm.client.sap.acsettle.DT_HEADER.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/SRM/ECC".equals(namespaceURI) &&
                  "DT_ACSETTLE".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.acsettle.DT_ACSETTLE.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/SRM/ECC".equals(namespaceURI) &&
                  "ACSETTLE_RES_type0".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.acsettle.ACSETTLE_RES_type0.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    