package com.example

import com.example.model.ApiResponse
import com.example.repository.CropRepositoryImpl
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.json.Json
import kotlin.test.*

class ApplicationTest {
    @Test
    fun `access root endpoint, assert correct information`() = testApplication {
        val response = client.get("/")
        assertEquals(
            expected = HttpStatusCode.OK,
            actual = response.status
        )
        assertEquals(
            expected = "Welcome to Hashira Handbook API",
            actual = response.bodyAsText()
        )
    }

    @Test
    fun `access all hashiras endpoint, assert correct information`() =
        testApplication {
            val hashiraRepository = CropRepositoryImpl()

            val response = client.get("/hashira-handbook/hashiras")
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = response.status
            )
            val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
            val expected = ApiResponse(
                success = true,
                message = "ok",
                crops = hashiraRepository.crops,
            )
            assertEquals(
                expected = expected,
                actual = actual
            )
        }

    @Test
    fun `access search hashiras endpoint, query hashira name, assert single hero result`() =
        testApplication {
            val response = client.get("/hashira-handbook/hashiras/search?name=gyom")
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = response.status
            )
            val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText()).crops.size
            assertEquals(
                expected = 1,
                actual = actual
            )
        }

    @Test
    fun `access search hashiras endpoint, query hashira name, assert multiple hashira result`() =
        testApplication {
            val response = client.get("/hashira-handbook/hashiras/search?name=to")
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = response.status
            )
            val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText()).crops.size
            assertEquals(
                expected = 2,
                actual = actual
            )
        }

    @Test
    fun `access search hashiras endpoint, query an empty text, assert empty list as a result`() =
        testApplication {
            val response = client.get("/hashira-handbook/hashiras/search?name=")
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = response.status
            )
            val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText()).crops
            assertEquals(
                expected = emptyList(),
                actual = actual
            )
        }

    @Test
    fun `access search hashiras endpoint, query non existing hashira, assert empty list as a result`() =
        testApplication {
            val response = client.get("/hashira-handbook/hashiras/search?name=unknown")
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = response.status
            )
            val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText()).crops
            assertEquals(
                expected = emptyList(),
                actual = actual
            )
        }

    @Test
    fun `access non existing endpoint, assert not found`() = testApplication {
        val response = client.get("/unknown")
        assertEquals(
            expected = HttpStatusCode.NotFound,
            actual = response.status
        )
        assertEquals(
            expected = "Page not Found.",
            actual = response.bodyAsText()
        )
    }
}
