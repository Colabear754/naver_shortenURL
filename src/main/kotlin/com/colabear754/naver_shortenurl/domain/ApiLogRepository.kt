package com.colabear754.naver_shortenurl.domain

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface ApiLogRepository : JpaRepository<ApiLog, UUID>