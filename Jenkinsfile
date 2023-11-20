pipeline {
    agent any
    tools { 
        gradle 'Gradle 8.5'  
    }
    stages {
        
        stage ('Build') {
            steps {
                def gradleHome = tool 'Gradle 8.5'
                def gradleCmd = "${gradleHome}/bin/gradle"
                sh '${gradleCmd} clean jar buildMyAppImage'
            }
        }

    }
}
