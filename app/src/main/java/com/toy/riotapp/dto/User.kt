package com.toy.riotapp.dto

import java.net.URL

data class User(
    var idx: Int? = null,
    var id: String? = null,
    var nick: String? = null
)

data class MatchResult(
    var date_token : String
)