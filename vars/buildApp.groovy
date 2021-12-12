#!/usr/bin/env groovy

def call()
{
    echo "Building the Application"
    sh "chmod +x gradlew"
    sh "./gradlew build"
}