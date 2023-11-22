pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Checkout code from the repository
                    checkout scm
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    // Your build steps go here
                    sh 'echo "Building..."'
                }
            }
        }


        stage('Test') {
            steps {
                script {
                    // Your test steps go here
                    sh 'echo "Testing..."'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Your deployment steps go here
                    'echo "Deploying..."'
                }
            }
        }
    }
}
