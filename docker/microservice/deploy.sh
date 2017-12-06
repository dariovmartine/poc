#!/bin/bash

URL="http://172.17.201.125:8081/nexus/content/repositories/bootcamp/testApp/com.directv.docker/$RELEASE-RELEASE/com.directv.docker-$RELEASE-RELEASE.war"
FOLDER="$CATALINA_HOME/webapps/"

if [ -n "$RELEASE" ]; then 
    echo "Descargando el war desde $URL a $FOLDER"
    curl -fSL $URL -o $FOLDER/testApp.war
    echo "Finalizado el dowload desde nexus"
    
    $CATALINA_HOME/bin/catalina.sh run
else

    echo "Iniciar el container con el parametro RELEASE"
fi    


