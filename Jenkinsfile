pipeline {
    agent any
    parameters {
        choice(name: 'ENV', choices: ['dev', 'sandbox', 'production'], description: 'Select environment')
    }
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
                withAWS() {
                    bat 'serverless deploy --verbose --stage ${DEPLOY_ENV}'
                }
            }
        }
    }
}
