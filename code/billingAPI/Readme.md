
	cd src/test/resources

	wsimport -s . -b CRMSupportAndReadinessService-async.xml CRMSupportAndReadinessService.wsdl
	wsimport -s . -b ManageBillingEventsService-async.xml ManageBillingEventsService.wsdl


Pruebas

	curl -v  localhost:8080/getBill -H "Content-Type: application/json" --data '{ "country" : "AR", "customerKey" : "30206000" , "attributes" : { "Nombre" : "Prueba" , "Apellido" : "Quique" , "Nro Cliente" : "123456789" , "url_link" : "http://www.google.com.ar" } } ' 
