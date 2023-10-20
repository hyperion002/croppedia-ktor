package com.example.routes

import com.example.model.ApiResponse
import com.example.repository.CropRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import org.koin.ktor.ext.inject

fun Route.getAllCrops() {
    val cropRepository: CropRepository by inject()

    get("/crops") {
        try {
            val apiResponse = cropRepository.getAllCrops()
            call.respond(message = apiResponse, status = HttpStatusCode.OK)
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(success = false, message = "Hashira not found! Exception: $e"),
                status = HttpStatusCode.NotFound
            )
        }
    }
}