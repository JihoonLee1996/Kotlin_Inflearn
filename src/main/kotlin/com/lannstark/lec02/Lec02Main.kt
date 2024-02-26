package com.lannstark.lec02

fun main() {
    var str:String? = "ABC"

    //str.length // 불가능
    str?.length // 가능 -> Safe Call
    str?.length ?: 0 // 가능 -> Elvis 연산자
}

fun startWithA(str:String?):Boolean{
    if(str == null){
        return false
    }
    return true
}