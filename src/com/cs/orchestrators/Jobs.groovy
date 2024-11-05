#!groovy
package com.cs.orchestrators

import com.cs.globals.Globals
import com.cs.managers.StageManager

def ciFlow(params) {
    def stageManager = new StageManager()

    stageManager.createStage("Test") {
        hello "${env.BUILD_USER}"
    }
}

return this