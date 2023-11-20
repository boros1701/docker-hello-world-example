pipeline {
    agent any
    tools { 
        gradle 'Gradle 8.5'  
    }
    stages {
        
        stage ('Build') {
            steps { 
            withGradle {
                sh './gradlew clean jar buildMyAppImage'
            }
        }
        }
    }
}
