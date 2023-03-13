package com.colabear754.naver_shortenurl.common

import com.colabear754.naver_shortenurl.dto.shorten_url.ShortenUrlResponse
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient

enum class ExternalApiGroup(private val url: String, private val clientId: String, private val clientSecret: String) {
    NAVER_SHORTEN_URL("https://openapi.naver.com/v1/util/shorturl", "{ClientId}", "{ClientSecret}");

    fun call(originUrl: String): ShortenUrlResponse {
        return WebClient.create()
            .get()
            .uri(url) { it.queryParam("url", originUrl).build() }
            .header("X-Naver-Client-Id", clientId)
            .header("X-Naver-Client-Secret", clientSecret)
            .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
            .exchangeToMono { it.bodyToMono(ShortenUrlResponse::class.java) }
            .block() ?: ShortenUrlResponse(null, "error", "error")
    }
}