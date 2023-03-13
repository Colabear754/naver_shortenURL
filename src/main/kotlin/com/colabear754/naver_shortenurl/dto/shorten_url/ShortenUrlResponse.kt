package com.colabear754.naver_shortenurl.dto.shorten_url

data class ShortenUrlResponse(
    val result: ShortenUrlResult?,
    val message: String,
    val code: String
)