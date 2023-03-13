package com.colabear754.naver_shortenurl.domain

import org.springframework.data.jpa.repository.JpaRepository

interface ApiLogRepository : JpaRepository<ApiLog, Long>