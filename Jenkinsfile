pipeline {
    agent any
    tools { 
        gradle 'Gradle 8.5'  
    }
    stages {
        
        stage ('Build') {
            script {
                def gradleHome = tool 'Gradle 8.5'
                def gradleCmd = "${gradleHome}/bin/gradle"
                sh '${gradleCmd} clean jar buildMyAppImage'
            }
        }

    }
}
