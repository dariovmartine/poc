#!/bin/bash

if [ -n "$RELEASE" ]; then

    declare -a arr=("invoiceAPI")
    
    for artifact in "${arr[@]}"
    do
        URL="http://172.17.201.125:8081/nexus/content/repositories/bootcamp/build/$artifact/$RELEASE/$artifact-$RELEASE.jar"
    
        echo "Descargando $artifact desde $URL a $CLOUD_HOME"
        curl -fSL $URL -o $CLOUD_HOME/$artifact.jar
        echo "Finalizado el dowload de $artifact desde nexus"
        echo "Iniciando $artifact:"
        java -jar $CLOUD_HOME/$artifact.jar
    done
fi

if [ -n "$RELEASE_LOCAL" ]; then

    echo "Iniciar el container usando el folder local"
    java -DDISCOVERY_SERVICE_IP=$DISCOVERY_SERVICE_IP -jar "$CLOUD_HOME/invoiceAPI-$RELEASE_LOCAL.jar"  &> $CLOUD_HOME/logs/invoiceAPI.log
fi


