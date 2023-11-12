pipeline {
    agent any
    tools { 
        gradle 'Gradle-8'  
    }
    stages {
        stage ('Clone repository') {
            steps {
                git 'https://github.com/boros1701/luminor_task.git' 
            }
        }

        stage ('Build') {
            steps {
                sh 'gradle clean build'
            }
        }
    }
}
