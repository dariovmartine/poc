FROM java:8-jre
#https://github.com/docker-library/tomcat

ENV CLOUD_HOME /opt/cloud_home

RUN mkdir -p "$CLOUD_HOME"
RUN mkdir -p "$CLOUD_HOME"/logs
WORKDIR $CLOUD_HOME
    
COPY ./deploy.sh /
EXPOSE 8761
ENTRYPOINT ["/deploy.sh"]
