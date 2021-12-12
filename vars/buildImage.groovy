#!/usr/bin/env groovy

def call(String imageName)
{
    echo "Building the Docker Image"
    sh "docker build -t gradle-app ."
    sh "docker tag gradle-app $imageName:${env.BUILD_ID}"
}