pipeline {
    agent any
    tools { 
        gradle 'Gradle 8.5'  
    }
    stages {
        
        stage ('Build') {
            steps { 
            withGradle {
                sh 'gradle clean jar buildMyAppImage'
            }
        }
        }
    }
}
