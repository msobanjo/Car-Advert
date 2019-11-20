
pipeline {
    agent any

    stages {
        stage('Testing Environment') {
            steps {
                   echo "test"
                }
            }
        stage('Build') {
            steps {
                sh 'mvn package -DskipTests'
                sh 'docker build -t="msobanjo/car-advert:latest" .'
                }
            }
        stage('Deploy') {
            steps {
                sh 'docker push msobanjo/car-advert:latest'
            }
        }
    }
}
