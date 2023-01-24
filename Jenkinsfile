pipeline {
    agent any

    stages {
        stage('Building') {
            steps {
                echo 'Building the Project ORG DXC-BAT'
            }
        }
        stage('Testing') {
            steps {
    //            checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'VuseCA-QA.git']])
      //          bat 'mvn test'
                echo 'Testing the Project ORG DXC-BAT'
            }
        }
        stage('Deployment') {
            steps {
                echo 'Deploying the Project ORG DXC-BAT'
            }
        }
    }
}
