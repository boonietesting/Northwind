pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            git(url: 'https://github.com/boonietesting/Northwind', branch: 'main', poll: true)
          }
        }

        stage('Build Jar') {
          steps {
            echo 'Build Jar'
          }
        }

      }
    }

    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            sleep 2
          }
        }

        stage('') {
          steps {
            echo 'Northwind DB'
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying'
        sleep 3
        echo 'Deployed'
      }
    }

  }
}