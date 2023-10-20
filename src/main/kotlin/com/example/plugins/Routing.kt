package com.example.plugins

import com.example.routes.getAllCrops
import com.example.routes.root
import com.example.routes.searchCrops
import io.ktor.server.application.Application
import io.ktor.server.http.content.staticResources
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        root()
        getAllCrops()
        searchCrops()

        staticResources(remotePath = "/images", basePackage = "images")
    }
}
