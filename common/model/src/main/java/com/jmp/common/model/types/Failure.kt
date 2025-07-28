package com.jmp.common.model.types

sealed class Failure(val message: String) {
    object NoConnectivityException : Exception("No Internet Connection")
    data object NoConnectivityError : Failure("There is no connection")
    data object UnknownError : Failure("An error occurred")
    data object NoCharactersToDisplay : Failure("There are no characters to display! \n\n"  +
            "Perhaps there is a connectivity problem or an internal error occurred")
    data object CharacterNotFound : Failure("There was a problem loading the character")
}


