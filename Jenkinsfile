#!/usr/bin/env groovy

node {
    stage('checkout') {
        checkout scm
    }

    stage('check java') {
         "java -version"
    }

    stage('clean') {
        "chmod +x gradlew"
        "./gradlew clean --no-daemon"
    }

    stage('npm install') {
        "./gradlew npmInstall -PnodeInstall --no-daemon"
    }

    stage('backend tests') {
        try {
             "./gradlew test -PnodeInstall --no-daemon"
        } catch(err) {
            throw err
        } finally {
            //junit '**/build/**/TEST-*.xml'
        }
    }

    stage('frontend tests') {
        try {
             "./gradlew npm_test -PnodeInstall --no-daemon"
        } catch(err) {
            throw err
        } finally {
            //junit '**/build/test-results/jest/TESTS-*.xml'
        }
    }

    stage('packaging') {
         "./gradlew bootWar -x test -Pprod -PnodeInstall --no-daemon"
        archiveArtifacts artifacts: '/build/libs/*.*.jar', fingerprint: true
    }

   /* stage('deployment') {
        "./gradlew deployHeroku --no-deamon"
   }*/


}
