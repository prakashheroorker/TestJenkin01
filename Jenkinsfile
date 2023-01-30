pipeline {
    agent any
    
   // withCredentials([usernamePassword(credentialsId: 'githubapp-dxc-bat', usernameVariable: 'GITHUB_APP', passwordVariable: 'GITHUB_JWT_TOKEN')]) {
  //  bat '''
 //       echo "Do something with the access token stored in GITHUB_JWT_TOKEN environment variable"
 //   '''
//}

    stages {
        stage('Building') {
            steps {
                echo 'Building the Project ORG DXC-BAT'
            }
        }
        stage('Testing') {
            steps {
        //        checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'VuseCA-QA.git']])
                git branch: '*/main',
               // credentialsId: 'my_cred_id',
                url: 'VuseCA-QA.git'

            sh "ls -lat"
         //       bat 'mvn test'
                sh 'mvn test'
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
