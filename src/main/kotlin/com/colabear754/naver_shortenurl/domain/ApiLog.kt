package com.colabear754.naver_shortenurl.domain

import jakarta.persistence.*
import java.time.LocalDate
import java.util.*

@Entity
class ApiLog(
    @Column(length = Int.MAX_VALUE)
    val originUrl: String,
    @Column(length = Int.MAX_VALUE)
    val shortenUrl: String,
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    private val callingDate: LocalDate = LocalDate.now()
) {
    override fun toString(): String {
        return "ApiLog(id=$id, originUrl='$originUrl', shortenUrl='$shortenUrl', callingDate=$callingDate)"
    }
}