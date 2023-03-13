package com.colabear754.naver_shortenurl.services

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
class ShortenUrlServiceTest @Autowired constructor(private val shortenUrlService: ShortenUrlService) {
    @Test
    fun shortenUrl() {
        // given
        val originUrl = "https://www.naver.com"
        // when
        val result = shortenUrlService.shortenUrl(originUrl)
        // then
        assertThat(result.originUrl).isEqualTo("https://www.naver.com")
        assertThat(result.shortenUrl).isNotNull
    }
}