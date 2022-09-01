pipeline {
  agent any
  stages {
    stage('Git') {
      steps {
        git(url: 'https://github.com/boonietesting/Northwind', branch: 'main', poll: true)
      }
    }

    stage('Setting the variables values') {
      steps {
         sh '''#!/bin/bash
                 echo "hello world" 
         '''
      }
    }

  }
}