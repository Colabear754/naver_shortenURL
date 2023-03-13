package com.colabear754.naver_shortenurl.dto.shorten_url

data class ShortenUrlResult(
    val url: String,
    val hash: String,
    val orgUrl: String
)