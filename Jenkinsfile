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
                //bat 'mvn clean install -DskipTests'
                echo 'Dandole a las pruebas des esa madre'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Supuestamente desplegando ...'
                //withAWS() {
                //    bat 'serverless deploy --verbose --stage '+ENV
                //}
            }
        }
        stage('Paso inventado por mi Alejandro') {
            steps {
                sls deploy --stage dev -v
                echo 'Un paso inventado por miguelin'
                //withAWS() {
                //    bat 'serverless deploy --verbose --stage '+ENV
                //}
            }
        }
    }
}
