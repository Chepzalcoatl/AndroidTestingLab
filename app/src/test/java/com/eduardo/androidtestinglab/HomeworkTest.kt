package com.eduardo.androidtestinglab

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {

    @Test
    fun `fib(0) returns 0`() {
        val result = Homework.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `fib(1) returns 1`() {
        val result = Homework.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `fib(2) returns 1`() {
        val result = Homework.fib(2)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `fib(3) returns 2`() {
        val result = Homework.fib(3)
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun `fib(4) returns 3`() {
        val result = Homework.fib(4)
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun `fib(5) returns 5`() {
        val result = Homework.fib(5)
        assertThat(result).isEqualTo(5)
    }

    @Test
    fun `fib(6) returns 8`() {
        val result = Homework.fib(6)
        assertThat(result).isEqualTo(8)
    }

    @Test
    fun `string with only ( returns false`() {
        val result = Homework.checkBraces("(Hola(")
        assertThat(result).isFalse()
    }

    @Test
    fun `string with only ) returns false`() {
        val result = Homework.checkBraces(")Hola)")
        assertThat(result).isFalse()
    }

    @Test
    fun `string with one more ( returns false`() {
        val result = Homework.checkBraces("((Hola)")
        assertThat(result).isFalse()
    }

    @Test
    fun `string with one more ) returns false`() {
        val result = Homework.checkBraces("()Hola)")
        assertThat(result).isFalse()
    }

    @Test
    fun `string with equal ( and ) returns true`() {
        val result = Homework.checkBraces("(Hola)")
        assertThat(result).isTrue()
    }
}