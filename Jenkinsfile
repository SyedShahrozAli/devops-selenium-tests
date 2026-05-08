pipeline {

    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/devops-selenium-tests.git'
            }
        }

        stage('Run Selenium Tests') {

            steps {

                sh '''
                docker run --rm \
                -v $(pwd):/workspace \
                -w /workspace \
                markhobson/maven-chrome \
                mvn test
                '''
            }
        }
    }
}
