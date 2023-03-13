package com.colabear754.naver_shortenurl.controllers

import com.colabear754.naver_shortenurl.dto.shorten_url.ShortenUrlRequest
import com.colabear754.naver_shortenurl.services.ShortenUrlService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ShortenUrlController(private val shortenUrlService: ShortenUrlService) {
    @GetMapping("/api-log")
    fun getApiLog() = ResponseEntity.ok(shortenUrlService.getApiLog())

    @PostMapping("/shorten")
    fun shortenUrl(@RequestBody request: ShortenUrlRequest) = ResponseEntity.ok(shortenUrlService.shortenUrl(request.url))
}