pipeline {
    agent any

    stages {
        stage('Build') {
            
            
            steps {
                echo 'Construyendo esta madre'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn clean install -DskipTests'
                echo 'Dandole a las pruebas des esa madre'
            }
        }
        stage('Deploy') {
            steps {
                withAWS(credentials: 'alejandroAws', region: 'us-east-1') {
                    bat 'serverless deploy --verbose'
                }
            }
        }
    }
}
