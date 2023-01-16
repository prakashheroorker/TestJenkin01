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
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.dxc.com/pheroorker2/QA_VUSE_Jenkin_DXC_Github.git']])
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
