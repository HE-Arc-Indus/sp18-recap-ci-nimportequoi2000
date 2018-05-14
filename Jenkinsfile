pipeline {
    agent any
    tools { 
        maven 'maven_3_5_3_apache' 
        jdk 'JAVA_SE_8_172' 
    }
    stages {
        stage ('Initialisation') {
            steps {
                echo 'initialisation...'
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
            }
        }
        stage ('Construction') {
            steps {
                echo 'construction...'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage ('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}

