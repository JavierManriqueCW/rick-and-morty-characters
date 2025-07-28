package com.jmp.data.characters.remote

import com.jmp.common.model.Character
import com.jmp.common.model.Location
import com.jmp.common.model.Origin
import com.jmp.common.model.Status
import com.jmp.data.remote.model.CharacterResponse
import com.jmp.data.remote.model.CharacterWrapperResponse
import com.jmp.data.remote.model.LocationResponse
import com.jmp.data.remote.model.OriginResponse

open class CharactersRemoteMapper {

    fun mapFromRemote(remote: CharacterWrapperResponse): List<Character> =
        mapResultsFromRemote(remote.results)

    private fun mapResultsFromRemote(results: List<CharacterResponse>) : List<Character> =
        results.map { characterResponse ->
            Character(
                id = characterResponse.id,
                name = characterResponse.name,
                status = mapStatusFromRemote(characterResponse.status),
                gender = characterResponse.gender,
                species = characterResponse.species,
                image = characterResponse.image,
                origin = characterResponse.origin.mapFromRemote(),
                location = characterResponse.location.mapFromRemote()
            )
        }

    private fun OriginResponse.mapFromRemote() : Origin =
        Origin(
            name = name,
            url = url
        )

    private fun LocationResponse.mapFromRemote(): Location =
        Location(
            name = name,
            url = url
        )

    private fun mapStatusFromRemote(status: String): Status =
        when (status) {
            ALIVE -> Status.ALIVE
            DEAD -> Status.DEAD
            else -> Status.UNKNOWN
        }

    private companion object {
        const val ALIVE = "Alive"
        const val DEAD = "Dead"
    }
}
