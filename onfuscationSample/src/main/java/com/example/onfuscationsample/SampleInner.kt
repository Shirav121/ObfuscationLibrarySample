package com.example.onfuscationsample

internal class SampleInner() {
    fun openMethod(adType : SampleEnum){
        println("SampleInner: outing-> called [${adType}]")

    }

    fun outing(){
        println("SampleInner: outing-> called")

    }
}