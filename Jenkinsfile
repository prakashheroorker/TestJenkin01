pipeline {
    agent any
    
   // withCredentials([usernamePassword(credentialsId: 'githubapp-dxc-bat', usernameVariable: 'GITHUB_APP', passwordVariable: 'GITHUB_JWT_TOKEN')]) {
  //  bat '''
 //       echo "Do something with the access token stored in GITHUB_JWT_TOKEN environment variable"
 //   '''
}

    stages {
        stage('Building') {
            steps {
                echo 'Building the Project ORG DXC-BAT'
            }
        }
        stage('Testing') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'VuseCA-QA.git']])
                bat 'mvn test'
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
