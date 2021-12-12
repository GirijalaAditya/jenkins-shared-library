#!/usr/bin/env groovy

package com.example

class Docker implements Serializable {
    def script

    Docker(script) {
        this.script = script
    }

    def buildDockerImage(String imageName)
    {
        script.echo "Building the Docker Image"
        script.sh "docker build -t gradle-app ."
        script.sh "docker tag gradle-app $imageName:${env.BUILD_ID}"
    }
}