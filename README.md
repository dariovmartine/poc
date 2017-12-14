# poc


## Desarrollo 

1) Buildear las apps
	cd code

	gradle clean build -x test 

2) Crear las imagenes

	cd ../docker

	docker build -t discovery-service ./discovery-service && \
	docker build -t cloud-config ./cloud-config && \
	docker build -t api-gateway ./api-gateway && \
	docker build -t client-api ./client-api && \
	docker build -t einvoice-api ./einvoice-api && \
	docker build -t email-api ./email-api && \
	docker build -t invoice-api ./invoice-api

3) Invocacion usando el war local:

	docker run --name discovery-service --rm -p 8761:8761 -d -e "RELEASE_LOCAL=0.1.0"  -v $PWD/../code/discoveryService/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs discovery-service

	docker run --name cloud-config --rm -p 8888:8888 -d -e "RELEASE_LOCAL=0.1.0" -v $PWD/../code/cloudConfig/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs cloud-config

	docker run --name api-gateway  --rm -p 8080:8080 -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`"  -v $PWD/../code/apiGateway/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs api-gateway

	docker run --name client-api  --rm -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`" -e "CONFIG_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" cloud-config`" -v $PWD/../code/clientAPI/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs client-api

	docker run --name email-api  --rm -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`" -e "CONFIG_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" cloud-config`" -v $PWD/../code/emailAPI/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs email-api

	docker run --name invoice-api  --rm -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`" -e "CONFIG_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" cloud-config`" -v $PWD/../code/invoiceAPI/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs invoice-api

	docker run --name einvoice-api  --rm -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`" -e "CONFIG_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" cloud-config`" -v $PWD/../code/eInvoiceAPI/build/libs:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs einvoice-api

Validar instalacion ejecutando:

    curl localhost:8080/einvoice/invoices?clientId=1

Debe responder con HTTP STATUS 200 y un json similar a:

    {"message":"Ok, client: Client [id=1, name=no name], invoice: Invoice [id=1, clientId=1], emailResponse: Response [status=0, message=Email sent]"}[root@centos7-template docker]# 



## Instalacion en QA

    yum install docker
    systemctl start docker
    mkdir -p /opt/cloud_home/jars
    mkdir -p /opt/cloud_home/docker/logs
    cd /opt/cloud_home
    
Copiar a /opt/cloud_home/jars los jars de las apps

    find . -name *.jar -exec scp {} root@172.17.201.205:/opt/cloud_home/jars \;
    
Copiar a /opt/cloud_gome las imagenes docker

    scp -r docker/ root@172.17.201.205:/opt/cloud_home
    
Ejecutar el paso (2) pra builder las imagenes y a continuación:

    docker run --privileged=true --name discovery-service -p 8761:8761 -d -e "RELEASE_LOCAL=0.1.0"  -v $PWD/../jars:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs discovery-service
    
    docker run --privileged=true --name cloud-config -p 8888:8888 -d -e "RELEASE_LOCAL=0.1.0" -v $PWD/../jars:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs cloud-config
    
    docker run --privileged=true  --name api-gateway -p 8080:8080 -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`"  -v $PWD/../jars:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs api-gateway
    
    docker run --privileged=true --name client-api -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`" -e "CONFIG_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" cloud-config`" -v $PWD/../jars:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs client-api
    
    docker run --privileged=true --name email-api -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`" -e "CONFIG_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" cloud-config`" -v $PWD/../jars:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs email-api
    
    docker run --privileged=true --name invoice-api -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`" -e "CONFIG_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" cloud-config`" -v $PWD/../jars:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs invoice-api
    
    docker run --privileged=true --name einvoice-api -d -e "RELEASE_LOCAL=0.1.0" -e "DISCOVERY_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" discovery-service`" -e "CONFIG_SERVICE_IP=`docker inspect -f "{{ .NetworkSettings.IPAddress }}" cloud-config`" -v $PWD/../jars:/opt/cloud_home -v $PWD/logs:/opt/cloud_home/logs einvoice-api
        
Validar instalacion ejecutando:

    curl localhost:8080/einvoice/invoices?clientId=1

Debe responder con HTTP STATUS 200 y un json similar a:

    {"message":"Ok, client: Client [id=1, name=no name], invoice: Invoice [id=1, clientId=1], emailResponse: Response [status=0, message=Email sent]"}[root@centos7-template docker]# 

    
    
    
    
