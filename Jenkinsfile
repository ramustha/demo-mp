pipeline {
    agent any

    stages {

        stage('build-service-a') {
            steps {
                sh 'mvn clean package -DskipTests -f service-a/pom.xml'
            }
        }

        stage('build-service-b') {
            steps {
                sh 'mvn clean package -DskipTests -f service-b/pom.xml'
            }
        }

    }
}