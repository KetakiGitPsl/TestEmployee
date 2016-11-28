node {
  checkout scm
  env.PATH = "${tool 'Maven'}/bin:${env.PATH}"
  stage('Package') {
    dir('TestEmployee') {
      sh 'mvn clean package -DskipTests'
    }
  }

  stage('Create Docker Image') {
    dir('TestEmployee') {
      docker.build("admin1/myPipelineDock:${env.BUILD_NUMBER}")
    }
  }

  stage ('Run Application') {
    try {
     
      // Run application using Docker image
      
      sh "docker run  admin1/myPipelineDock:${env.BUILD_NUMBER}"

      // Run tests using Maven
      //dir ('TestEmployee') {
      //  sh 'mvn exec:java -DskipTests'
      //}
    } catch (error) {
    } finally {
      // Stop and remove database container here
      //sh 'docker-compose stop db'
      //sh 'docker-compose rm db'
    }
  }

  stage('Run Tests') {
    try {
      dir('TestEmployee') {
        sh "mvn test"
      //  docker.build("admin1/myPipelineDock:${env.BUILD_NUMBER}").push()
      }
    } catch (error) {

    } finally {
      junit '**/target/surefire-reports/*.xml'
    }
  }
}