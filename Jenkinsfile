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
                bat 'serverless deploy'
                echo 'Según desplegando todo mockeado je'
            }
        }
    }
}
