package com.colabear754.naver_shortenurl.domain

import jakarta.persistence.*
import java.time.LocalDate

@Entity
class ApiLog(
    @Column(length = Int.MAX_VALUE)
    val originUrl: String,
    @Column(length = Int.MAX_VALUE)
    val shortenUrl: String,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val sequence: Long? = null,
    private val callingDate: LocalDate = LocalDate.now()
) {
    override fun toString(): String {
        return "ApiLog(sequence=$sequence, originUrl='$originUrl', shortenUrl='$shortenUrl', callingDate=$callingDate)"
    }
}