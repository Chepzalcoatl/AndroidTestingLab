package com.eduardo.androidtestinglab

import com.google.common.truth.Truth
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty userName returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "",
            password = "123",
            confirmedPassword = "123"
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `valid userName and password repeated correctly returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Juan",
            password = "123",
            confirmedPassword = "123"
        )
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun `userName already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Peter",
            password = "123",
            confirmedPassword = "123"
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Anselmo",
            password = "",
            confirmedPassword = "123"
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `confirmed password not match with password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Pepe",
            password = "123",
            confirmedPassword = "125"
        )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `password with less than 2 chars returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Yan",
            password = "1",
            confirmedPassword = "1"
        )
        Truth.assertThat(result).isFalse()
    }
}