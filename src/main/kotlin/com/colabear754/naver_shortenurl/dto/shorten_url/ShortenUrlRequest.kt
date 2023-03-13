package com.colabear754.naver_shortenurl.dto.shorten_url

import io.swagger.v3.oas.annotations.media.Schema

data class ShortenUrlRequest(
    @Schema(description = "단축할 URL", example = "https://www.naver.com")
    val url: String
)