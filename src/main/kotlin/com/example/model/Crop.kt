package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Crop(
    val id: Int,
    val name: String,
    val type: String,
    val image: String,
    val about: String,
    val season: String,
    val climateRequirements: List<String>
)
