#!groovy
package com.cs.orchestrators

def bootstrap(entryPointParams) {
    def flowType = entryPointParams.type

    switch (flowType) {
        case 'ejerciciosCsLibs':
            def jobs = new Jobs()
            jobs.ciFlow(entryPointParams)
            break
        default:
            //NO HACE NADA
            break
    }
}

return this