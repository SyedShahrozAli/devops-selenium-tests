pipeline {

    agent any

    stages {


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
