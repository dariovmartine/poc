Pasos para generar el codigo java cliente de los wsdl:

	cd src/test/resources

	wsimport -s . -b exactarget-async.xml -p com.directv.email.exacttarget ExactTarget.wsdl 
	wsimport -s . -b computec-async.xml -p com.directv.email.computec WsDirectvIVRService.wsdl 
	find . -name *.class -exec rm {} \;

Pruebas

curl -v  localhost:8080/sendEmail -H "Content-Type: application/json" --data '{ "country" : "AR", "destination" : "dariovmartine@gmail.com" , "template" : "AR-FacturaElectronica-Welcome" , "attributes" : { "Nombre" : "Prueba" , "Apellido" : "Quique" , "Nro Cliente" : "123456789" , "url_link" : "http://www.google.com.ar" } } ' 

