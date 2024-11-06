#!groovy
package com.cs.orchestrators

import com.cs.globals.Globals
import com.cs.managers.StageManager

def ciFlow(params) {
    def stageManager = new StageManager()

    stageManager.createStage("Ejercicio 1") {
        echo "Hola Mundo."
    }

    stageManager.createStage("Ejercicio 3") {
        hello "${env.BUILD_USER}"
    }


}

return this