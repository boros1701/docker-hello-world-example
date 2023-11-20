pipeline {
    agent any
    
    stages {
        
        stage ('Build') {
            steps { 
                sh 'chmod +x ./gradlew'
                sh './gradlew --no-deamon clean jar buildMyAppImage'
            }
        }
    }
}
