package com.colabear754.naver_shortenurl.dto.api_log

import io.swagger.v3.oas.annotations.media.Schema

data class ApiLogResponse(
    @Schema(description = "원본 URL", example = "https://www.naver.com")
    val originUrl: String,
    @Schema(description = "단축된 URL", example = "https://me2.do/GyvykVAu")
    val shortenUrl: String
)