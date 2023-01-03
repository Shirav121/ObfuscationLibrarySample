package com.example.onfuscationsample

import androidx.annotation.Keep
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
@Keep
class ApiHandler {
    @Keep
    fun createSession() : String? {
        var response : String? = ""
        CoroutineScope(Dispatchers.IO + ErrorHandle().coroutineException()).launch {
            try {
                val resource = NetworkClient().getMethodCall("https://fakestoreapi.com/products")
                when (resource.status) {
                    Status.SUCCESS -> {
                        resource.data.let {
                            response = resource.data
                        }
                    }
                    Status.ERROR -> {

                    }
                }
            } catch (e: Exception) {

            }
        }
        return response
    }

}