package org.apache.ws.axis2;

import org.apache.axiom.om.OMFactory;

public class TestClient {

	
	public static void main(String[] args) {
		try{
		ServiceStub stub = new ServiceStub();
		ServiceStub.Add params = new ServiceStub.Add();
		params.setI(10);
		params.setJ(30);
		org.apache.axiom.soap.SOAPFactory factory;
		/* org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
         emptyEnvelope.getBody().addChild(params.getOMElement(org.apache.ws.axis2.ServiceStub.Add.MY_QNAME,factory));
         */
		
	
		/*System.out.println(params.MY_QNAME.getClass());
		OMFactory.createOMElement("abc", "QName", );
		//(javax.xml.namespace.QName); */
	//	System.out.println(params.getOMElement(org.apache.ws.axis2.ServiceStub.Add.MY_QNAME,factory));
		ServiceStub.AddResponse response =   stub.add(params);
		int result = response.get_return();
		System.out.println("Reuslt from server side service to client is"+ result);
		
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
