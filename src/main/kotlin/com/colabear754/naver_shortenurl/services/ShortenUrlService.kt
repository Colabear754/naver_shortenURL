package com.colabear754.naver_shortenurl.services

import com.colabear754.naver_shortenurl.common.ExternalApiGroup
import com.colabear754.naver_shortenurl.domain.ApiLog
import com.colabear754.naver_shortenurl.domain.ApiLogRepository
import com.colabear754.naver_shortenurl.dto.api_log.ApiLogResponse
import org.springframework.stereotype.Service

@Service
class ShortenUrlService(private val apiLogRepository: ApiLogRepository) {
    fun shortenUrl(originUrl: String): ApiLogResponse {
        val result = ExternalApiGroup.NAVER_SHORTEN_URL.call(originUrl).result!!
        val shortenUrl = result.url
        val apiLog = apiLogRepository.save(ApiLog(originUrl, shortenUrl))
        return ApiLogResponse(apiLog.sequence, apiLog.originUrl, apiLog.shortenUrl)
    }

    fun getApiLog() = apiLogRepository.findAll().map { ApiLogResponse(it.sequence, it.originUrl, it.shortenUrl) }
}