pipeline {
    agent any
    
    stages {
        
        stage ('Build') {
            steps { 
                sh 'chmod +x ./gradlew'
                sh './gradlew --no-daemon clean jar buildMyAppImage'
            }
        }
    }
}
