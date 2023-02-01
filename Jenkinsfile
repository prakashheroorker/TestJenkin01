pipeline {
   ///// agent any
    
   // withCredentials([usernamePassword(credentialsId: 'githubapp-dxc-bat', usernameVariable: 'GITHUB_APP', passwordVariable: 'GITHUB_JWT_TOKEN')]) {
  //  bat '''
 //       echo "Do something with the access token stored in GITHUB_JWT_TOKEN environment variable"
 //   '''
//}
    
   // tools {
     //   maven 'Maven 3.8.6'
       //     }

    agent {
         docker {
            image 'adoptopenjdk/maven-openjdk8'
            args '-v $WORKSPACE:/tmp/sibelgaint -u="root" -w /tmp/sibelgaint'
        }
    
    }
    
    stages {
        stage('Building') {
            steps {
                echo 'Building the Project ORG DXC-BAT'
                sh 'mvn clean compile'
            }
        }
        stage('Testing') {
            steps {
        //        checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'VuseCA-QA.git']])
             ////   checkout scm
           //     git branch: '*/main',
              //       git branch: '/main',
               // credentialsId: 'my_cred_id',
           ////     url: 'VuseCA-QA.git'
              /// url: 'ssh://VuseCA-QA.git'
       //    url: 'https://github.dxc.com/DXC-BAT/VuseCA-QA.git'
          ////////// sh "ls -lat"
         //       bat 'mvn test'
               //// sh "ls -lrt ./target/classes/META-INF/maven/*"
                //////// sh 'mvn test'
               ///  sh "find . -name maven"   
            ///    echo 'Testing the Project ORG DXC-BAT'
                
         ////       git branch: 'main', url: "https://github.dxc.com/DXC-BAT/VuseCA-QA.git"
             ///        withMaven(maven : 'apache-maven-3.6.1') {
                ///     bat'mvn clean compile' }
                
                
                
                sh 'mvn test'
            
                
                
                
                
            }
        }
        stage('Deployment') {
            steps {
                echo 'Deploying the Project ORG DXC-BAT'
            }
        }
    }
}
