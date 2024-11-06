#!groovy
import com.cs.orchestrators.Ci

def call(body) {
    def orchestrationFlow = new Ci()

    // Evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    // Pipeline
    pipeline {
        agent any

        options {
            buildDiscarder(
                logRotator(
                    numToKeepStr: '5',
                    artifactNumToKeepStr: '5'
                )
            )
        }

        //triggers {
        //    cron('*/10 * * * *')
        //}

        stages {
            stage('Inicialization pipeline') {
                steps {
                    script{
                        orchestrationFlow.bootstrap(config)
                    }
                }
            }
        }
    }
}
