#!/bin/bash

configure() {
    echo "Configuring Tomcat..."
    mkdir -p .tomcat
    sed -e "s#<project-dir>#$(pwd)/#" etc/tomcat-context.xml > .tomcat/tomcat-context.xml
    sed -e "s#<project-dir>#$(pwd)/#" etc/tomcat-storage.xml > .tomcat/tomcat-storage.xml
    cp etc/tomcat-logging.properties .tomcat/tomcat-logging.properties

    echo "Initializing Storage Directory..."
    mkdir -p .storage
}

run() {
    ./mvnw clean package cargo:run
}


configure
run


