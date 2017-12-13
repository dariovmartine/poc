FROM java:8-jre
#https://github.com/docker-library/tomcat

ENV CLOUD_HOME /opt/cloud_home

RUN mkdir -p "$CLOUD_HOME"
WORKDIR $CLOUD_HOME
    
COPY ./deploy.sh /
EXPOSE 8080 
ENTRYPOINT ["/deploy.sh"]
