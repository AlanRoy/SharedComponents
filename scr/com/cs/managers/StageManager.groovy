#!groovy
package com.cs.managers

def createStage(nameStage, clousure) {
    stage(nameStage) {
        clousure.call()
    }
}