package com.example.geeksfit.data.remote.model

data class Put(
    val description: String,
    val operationId: String,
    val responses: ResponsesXXX,
    val tags: List<String>
)