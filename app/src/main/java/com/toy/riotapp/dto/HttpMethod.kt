package com.toy.riotapp.dto

data class HTTP_Get(
    var something : String? =null
    // var users : ArrayList<User>? =null
)

data class HTTP_Post(
    var id : String? =null,
    var pwd : String?=null,
    var nick : String? =null
)

data class HTTP_Post_Result(
    var result:String? = null
)