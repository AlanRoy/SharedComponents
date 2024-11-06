#!groovy
package com.cs.orchestrators

import com.cs.globals.Globals
import com.cs.managers.StageManager

def ejercicio1(params) {
    def stageManager = new StageManager()

    stageManager.createStage("Ejercicio 1") {
        echo "Hola Mundo."
    }
}

def ejercicio2(params) {
    def stageManager = new StageManager()

    stageManager.createStage("Ejercicio 2") {
        timeout(time: 30, unit: 'SECONDS') {
            def inputNombre = input(
                id: "userInput",
                submitter: 'administrator,jon,daenerys',
                submitterParameter: 'submitter',
                message: "Escribe tu nombre",
                parameters: [
                    [
                        $class: 'TextParameterDefinition',
                        name: 'nombre',
                        defaultValue: "",
                        description: "Escribe tu nombre"
                    ]
                ]
            )
                        
            echo "Hola ${inputNombre.nombre}"
        }
    }
}

def ejercicio3(params) {
    def stageManager = new StageManager()

    stageManager.createStage("Ejercicio 3") {
        hello "${env.BUILD_USER}"
    }
}

def ejercicio41(params) {
    def stageManager = new StageManager()

    stageManager.createStage("Ejercicio 4 - 1") {
        build job: "Ejercicio_3_SH"
    }
}

def ejercicio7(params) {
    def stageManager = new StageManager()

    stageManager.createStage("Parallel") {
        parallel {
            stageManager.createStage("Hola") {
                sh "echo 'Hola ${env.BUILD_USER}'"
            }

            stageManager.createStage("Adios") {
                sh "echo 'Adios ${env.BUILD_USER}'"
            }
        }
    }
}

return this