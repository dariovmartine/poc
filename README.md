# poc


## Desarrollo 


	cd code

	gradle clean build -x test 

	cd ../docker

	docker build -t discovery-service ./discovery-service && \
	docker build -t cloud-config ./cloud-config && \
	docker build -t api-gateway ./api-gateway && \
	docker build -t client-api ./client-api && \
	docker build -t einvoice-api ./einvoice-api && \
	docker build -t email-api ./email-api && \
	docker build -t invoice-api ./invoice-api

Invocacion usando el war local:

	docker run --name discovery-service --rm -p 8761:8761 -d -e "RELEASE_LOCAL=0.1.0"  -v $PWD/../code/discoveryService/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs discovery-service

	docker run --name cloud-config --rm -p 8888:8888 -d -e "RELEASE_LOCAL=0.1.0" -v $PWD/../code/cloudConfig/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs cloud-config

	docker run --name api-gateway  --rm -p 8080:8080 -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`"  -v $PWD/../code/apiGateway/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs api-gateway

	docker run --name client-api  --rm -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`" -e "CONFIG_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" cloud-config`" -v $PWD/../code/clientAPI/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs client-api

	docker run --name email-api  --rm -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`" -e "CONFIG_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" cloud-config`" -v $PWD/../code/emailAPI/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs email-api

	docker run --name invoice-api  --rm -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`" -e "CONFIG_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" cloud-config`" -v $PWD/../code/invoiceAPI/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs invoice-api

	docker run --name einvoice-api  --rm -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`" -e "CONFIG_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" cloud-config`" -v $PWD/../code/eInvoiceAPI/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs einvoice-api


## Instalacion en QA

