package com.example.routes

import com.example.repository.CropRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import org.koin.ktor.ext.inject

fun Route.searchCrops() {
    val cropRepository: CropRepository by inject()

    get("/crops/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = cropRepository.searchCrops(name = name)
        call.respond(message = apiResponse, status = HttpStatusCode.OK)
    }
}