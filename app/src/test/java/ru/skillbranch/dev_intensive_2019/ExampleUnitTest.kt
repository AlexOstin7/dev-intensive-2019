package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.extention.TimeUnits
import ru.skillbranch.devintensive.extention.add
import ru.skillbranch.devintensive.extention.format
import ru.skillbranch.devintensive.models.User
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_factory() {
//        val user = User.makeUser("John Cena")
//        val user2 = User.makeUser("John Wick")
        val user3 = User.makeUser("John Wick")
    }
    @Test
    fun test_copy() {
        val user = User.makeUser("John Wick")
        var user2 = user.copy(lastVisit = Date().add(-2, TimeUnits.SECOND))
        var user3 = user.copy(lastName = "Cena", lastVisit = Date().add(2, TimeUnits.HOUR))

        println("""
            ${user.lastVisit?.format()}
            ${user2.lastVisit?.format()}
            ${user3.lastVisit?.format()}
        """.trimIndent())
    }

    companion object {
        @Test
        fun test_instance() {
            val user = User.makeUser( null )
            val user4 = User.makeUser( " " )
            val user5 = User.makeUser( "" )
            val user6 = User.makeUser( "John" )
    //        val user2 = User("2", "John", "Cena")
            val user2 = User("2", "John", "")
    //        val user3 = User("3", "John", "SilverHand", null, lastVisit = Date(), isOnline = true)
            val user3 = User("3", "", "SilverHand", null, lastVisit = Date(), isOnline = true)
    //        val user4 = User("3", "John", "SilverHand", null, lastVisit = Date(), isOnline = true)
            user.printMe()
            user2.printMe()
            user3.printMe()
            user4.printMe()
            user5.printMe()
            user6.printMe()
    //        user2.printMe()
    //        user3.printMe()
    //        println("$user " )
        }
    }

}
