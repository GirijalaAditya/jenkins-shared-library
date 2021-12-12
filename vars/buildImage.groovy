#!/usr/bin/env groovy

def call()
{
    echo "Building the Docker Image"
    sh "docker build -t gradle-app ."
    sh "docker tag gradle-app adityadevops/gradle-app:${env.BUILD_ID}"
}