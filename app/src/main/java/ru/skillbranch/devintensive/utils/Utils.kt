package ru.skillbranch.devintensive.utils

import ru.skillbranch.devintensive.models.User

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        val firstName =null
        val lastName =null
        //        val firstName = parts?.getOrNull(0)

        if (parts?.getOrNull(0).equals("").or(equals(" "))) {
           val firstName = null
        } else {
            val firstName = parts?.getOrNull(0)
        }
        if (parts?.getOrNull(1).equals("").or(equals(" "))) {
            val lastName = null
        } else {
            val lastName = parts?.getOrNull(0)
        }
//        val lastName = parts?.getOrNull(1)
//        return Pair(firstName, lastName)

        return firstName to lastName
    }
}