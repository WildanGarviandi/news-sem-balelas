package com.sem.balelas

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform