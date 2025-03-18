package com.back.standard.extensions

import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

@OptIn(ExperimentalEncodingApi::class)
// String 확장 함수: Base64 인코딩
fun String.base64Encode(): String {
    return Base64.encode(this.toByteArray())
}

@OptIn(ExperimentalEncodingApi::class)
// String 확장 함수: Base64 디코딩
fun String.base64Decode(): String {
    return Base64.decode(this).decodeToString()
}