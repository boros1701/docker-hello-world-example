pipeline {
    agent any
    stages {
        
        stage ('Build') {
            steps {
                sh 'gradlew clean build docker'
            }
        }

        stage ('Test') {
            steps {
                sh 'gradle test'
            }
        }
    }
}
