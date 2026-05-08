pipeline {

    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/YOUR_USERNAME/YOUR_REPO.git'
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
