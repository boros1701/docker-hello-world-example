pipeline {
    agent any
    tools { 
        gradle 'Gradle 8.5'  
    }
    stages {
        
        stage ('Build') {
            steps { 
            withGradle {
                sh 'chmod +x ./gradlew'
                sh './gradlew clean jar buildMyAppImage'
            }
        }
        }
    }
}
