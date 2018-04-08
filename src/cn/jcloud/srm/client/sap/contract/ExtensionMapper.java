
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:58 BST)
 */

        
            package cn.jcloud.srm.client.sap.contract;
        
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
                  "CONTRACT_RES_type0".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.contract.CONTRACT_RES_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/SRM/ECC".equals(namespaceURI) &&
                  "CONTRACT_ITEMS_type0".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.contract.CONTRACT_ITEMS_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/SRM/ECC".equals(namespaceURI) &&
                  "DT_HEADER".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.contract.DT_HEADER.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/SRM/ECC".equals(namespaceURI) &&
                  "CONTRACT_HEADER_type0".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.contract.CONTRACT_HEADER_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/SRM/ECC".equals(namespaceURI) &&
                  "DT_CONTRACT_REQ".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.contract.DT_CONTRACT_REQ.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://zjunma.com/TRAUM/SRM/ECC".equals(namespaceURI) &&
                  "DT_CONTRACT_RES".equals(typeName)){
                   
                            return  cn.jcloud.srm.client.sap.contract.DT_CONTRACT_RES.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    