package com.example.geeksfit.data.remote.model

data class PatchX(
    val description: String,
    val operationId: String,
    val responses: ResponsesXXX,
    val tags: List<String>
)