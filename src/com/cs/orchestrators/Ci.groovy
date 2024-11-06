#!groovy
package com.cs.orchestrators

def bootstrap(entryPointParams) {
    def flowType = entryPointParams.type

    switch (flowType) {
        case 'ejercicio1':
            def jobs = new Jobs()
            jobs.ejercicio1(entryPointParams)
            break
        case 'ejercicio2':
            def jobs = new Jobs()
            jobs.ejercicio2(entryPointParams)
            break
        case 'ejercicio3':
        case 'ejercicio6':
            def jobs = new Jobs()
            jobs.ejercicio3(entryPointParams)
            break
        case 'ejercicio41':
            def jobs = new Jobs()
            jobs.ejercicio41(entryPointParams)
            break
        case 'ejercicio42':
            def jobs = new Jobs()
            jobs.ejercicio42(entryPointParams)
            break
        case 'ejercicio51':
            def jobs = new Jobs()
            jobs.ejercicio51(entryPointParams)
            break
        case 'ejercicio52':
            def jobs = new Jobs()
            echo params.nuevo_nombre
            echo entryPointParams.nuevo_nombre
            jobs.ejercicio52(entryPointParams)
            break
        case 'ejercicio7':
            def jobs = new Jobs()
            jobs.ejercicio7(entryPointParams)
            break
        default:
            //NO HACE NADA
            break
    }
}

return this