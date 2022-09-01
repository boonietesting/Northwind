pipeline {
  agent any
  stages {
    stage('Git') {
      steps {
        git(url: 'https://github.com/boonietesting/Northwind', branch: 'main', poll: true)
      }
    }

    stage('Database Masking') {
      steps {
        sh 'curl --location --request GET \'https://partner.testinsights.io/api/apikey/e2Ep6tf9uAnutPyp2kfONK63N/job/137094\''
      }
    }

  }
}