package com.example.repository

import com.example.model.ApiResponse
import com.example.model.Crop

interface CropRepository {

    val crops: List<Crop>

    suspend fun getAllCrops() : ApiResponse
    suspend fun searchCrops(name: String?) : ApiResponse
}