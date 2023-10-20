package com.example.di

import com.example.repository.CropRepository
import com.example.repository.CropRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<CropRepository> {
        CropRepositoryImpl()
    }
}