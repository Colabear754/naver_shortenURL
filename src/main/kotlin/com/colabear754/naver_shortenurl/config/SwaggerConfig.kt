package com.colabear754.naver_shortenurl.config

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {
    @Bean
    fun swaggerApi(): OpenAPI = OpenAPI()
        .components(Components())
        .info(
            Info()
            .title("URL 단축")
            .description("네이버 단축 URL을 호출하여 단축 URL을 생성합니다.")
            .version("1.0.0"))
}