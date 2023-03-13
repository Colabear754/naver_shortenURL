package com.colabear754.naver_shortenurl.common

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test


class ExternalApiGroupTest {
    @Test
    fun call() {
        // given
        val originUrl = "https://www.naver.com"
        // when
        val result = ExternalApiGroup.NAVER_SHORTEN_URL.call(originUrl)
        // then
        assertThat(result).isNotNull
        println(result)
    }
}