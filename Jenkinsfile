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
                bat 'mvn clean package -ntp -U -DskipTests'
                echo 'Dandole a las pruebas des esa madre'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Según desplegando todo mockeado je'
            }
        }
    }
}
