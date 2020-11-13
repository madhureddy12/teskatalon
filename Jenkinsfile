pipeline {
  agent {
    kubernetes {
      //cloud 'kubernetes'
      yaml """
kind: Pod
metadata:
  name: kaniko
spec:
  containers:
  - name: katalon
    image: katalonstudio/katalon
    imagePullPolicy: Always
    command:
    - cat
    tty: true
"""
    }
  }
  stages {
    stage('Build') {
      steps {
        container('katalon') {
            sh '''
               pwd
               ls
               katalonc -noSplash -runMode=console -projectPath="/home/jenkins/agent/workspace/katalon/sw-testsuite1.prj" -retry=0 -testSuitePath="Test Suites/SW-UI-TestSuite" -executionProfile="default" -browserType="Chrome (headless)" -apiKey="322794a9-309d-42d4-a9b2-ff2a82308828" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true            
               '''
          }
        }
      }
    }
    post {
        always {
            archiveArtifacts artifacts:  /home/jenkins/agent/workspace/katalon/Reports/*/SW-UI-TestSuite/**/*.*, fingerprint: true'
            junit '/home/jenkins/agent/workspace/katalon/Reports/*/SW-UI-TestSuite/**/'
  }
}
