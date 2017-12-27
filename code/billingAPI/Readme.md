
	cd src/test/resources

	wsimport -s . -b CRMSupportAndReadinessService-async.xml -p com.directv.afe.billing.customerCRMSupportAndReadinessService.wsdl
	wsimport -s . -b ManageBillingEventsService-async.xml -p com.directv.afe.billing.invoice ManageBillingEventsService.wsdl


Pruebas

	curl -v  localhost:8081/getBill -H "Content-Type: application/json" --data '{ "country" : "AR", "customerKey" : "30206000" , "attributes" : { "Nombre" : "Prueba" , "Apellido" : "Quique" , "Nro Cliente" : "123456789" , "url_link" : "http://www.google.com.ar" } } ' 
