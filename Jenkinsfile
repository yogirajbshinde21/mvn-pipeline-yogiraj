pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/yogirajbshinde21/mvn-pipeline-yogiraj.git'
            }
        }
        
        stage('Build') {
            steps {
                bat 'mvn clean compile'  // For Windows, use 'bat', for Linux/macOS use 'sh'
            }
        }

        stage('Run App') {
            steps {
                bat 'mvn exec:java -Dexec.mainClass="com.example.App"'
            }
        }
    }

    post {
        success {
            echo 'Build was successful!'
        }
        failure {
            echo 'Build failed.'
        }
    }
}
