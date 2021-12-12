#!/usr/bin/env groovy

def call()
{
    echo "Testing the Application"
    sh "chmod +x gradlew"
    sh "./gradlew test"
}