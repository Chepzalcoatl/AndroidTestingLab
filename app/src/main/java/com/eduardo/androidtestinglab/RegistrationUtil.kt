package com.eduardo.androidtestinglab

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    /**
     * The input is not valid:
     *  - The userName is empty
     *  - The userName is already taken
     *  - The confirm password is not equal to password
     *  - The password contain less than 2 characters
     */
    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if(userName.isEmpty() || password.isEmpty()){
            return false
        }
        if(userName in existingUsers){
           return false
        }
        if(password.length < 2){
            return false
        }
        if(confirmedPassword != password){
            return false
        }
        return true
    }
}