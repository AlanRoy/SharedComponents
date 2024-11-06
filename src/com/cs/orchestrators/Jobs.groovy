#!groovy
package com.cs.orchestrators

import com.cs.globals.Globals
import com.cs.managers.StageManager

def ciFlow(params) {
    def stageManager = new StageManager()

    stageManager.createStage("Ejercicio 1") {
        echo "Hola Mundo."
    }

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

    stageManager.createStage("Ejercicio 3") {
        hello "${env.BUILD_USER}"
    }


}

return this