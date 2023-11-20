pipeline {
    agent any
    environment {
       GRADLE_OPTS= '-Dorg.gradle.jvmargs="-Xmx4g -XX:MaxMetaspaceSize=2g -XX:+HeapDumpOnOutOfMemoryError -Dfile.encoding=UTF-8"'
    }
    
    stages {  
        stage ('Build') {
            steps { 
                sh 'chmod +x ./gradlew'
                sh './gradlew clean jar jibBuildTar'
            }
        }
    }
}
