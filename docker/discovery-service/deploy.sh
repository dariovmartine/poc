#!/bin/bash

if [ -n "$RELEASE" ]; then

    declare -a arr=("discoveryService")
    
    for artifact in "${arr[@]}"
    do
        URL="http://172.17.201.125:8081/nexus/content/repositories/bootcamp/build/$artifact/$RELEASE/$artifact-$RELEASE.jar"
    
        echo "Descargando $artifact desde $URL a $CLOUD_HOME"
        curl -fSL $URL -o $CLOUD_HOME/$artifact.war
        echo "Finalizado el dowload de $artifact desde nexus"
        echo "Iniciando $artifact:"
        java -jar $CLOUD_HOME/$artifact.war 
    done
fi

if [ -n "$RELEASE_LOCAL" ]; then

    echo "Iniciar el container usando el folder local"
    java -jar "$CLOUD_HOME/discoveryService-$RELEASE_LOCAL.jar" &> $CLOUD_HOME/logs/discovery-service.log
fi
