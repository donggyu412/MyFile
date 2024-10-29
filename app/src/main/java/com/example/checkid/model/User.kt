package com.example.checkid.model

class User {
    val id: String = ""
    var pw: String = ""

    var idChild: String = ""
    var ApplicationList: MutableList<String>? = null

    // 애플리케이션 리스트_ 잠굴 리스트 (시간), 알람 리스트 (시간)
}


data class LoginDTO(
    val id: String,
    val pw: String
)

{

}