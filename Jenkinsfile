pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }

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