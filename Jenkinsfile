pipeline {
    agent any

    stages {
        stage('Building') {
            steps {
                echo 'Building the Project'
            }
        }
        stage('Testing') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'VuseCA-QA.git']])
                bat 'mvn test'
            }
        }
        stage('Deployment') {
            steps {
                echo 'Deploying the Project'
            }
        }
    }
}
