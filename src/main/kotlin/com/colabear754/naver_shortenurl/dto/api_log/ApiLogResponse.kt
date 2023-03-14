package com.colabear754.naver_shortenurl.dto.api_log

import io.swagger.v3.oas.annotations.media.Schema
import java.util.UUID

data class ApiLogResponse(
    @Schema(description = "ID", example = "3fa85f64-5717-4562-b3fc-2c963f66afa6")
    val id: UUID?,
    @Schema(description = "원본 URL", example = "https://www.naver.com")
    val originUrl: String,
    @Schema(description = "단축된 URL", example = "https://me2.do/GyvykVAu")
    val shortenUrl: String
)