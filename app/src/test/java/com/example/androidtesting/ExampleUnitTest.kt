package com.example.androidtesting

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    var calculator = Calculator();

    @Test
    fun addition_isCorrect() {
        assertEquals(4, calculator.addOperation(2,2))
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(2, calculator.subOperation(4,2))
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(4, calculator.mulOperation(2,2))
    }

    @Test
    fun division_isCorrect() {
        assertEquals(1, calculator.divOperation(2,2))
    }


    @Test
    fun text_isCorrect(){
        val textActivity = Text()
        assertNotEquals("Hello Mohan",textActivity.sayHi("Theesan"))
    }


    @Test
    fun object_isCorrect(){
        val fromApi = User("Theesan", 24, "Jaffna")
        val fromDb = User("Mohan", 24, "Jaffna")
        assertNotSame(fromApi,fromDb)
    }
}