package com.jmp.data.characters.local.model

import com.jmp.common.model.Character
import com.jmp.common.model.Location
import com.jmp.common.model.Origin
import com.jmp.common.model.Status

open class CachedCharacterMapper {

    fun mapToCached(character: Character): CachedCharacter =
        CachedCharacter(
            id = character.id,
            name = character.name,
            status = character.status.mapToCached(),
            gender = character.gender,
            species = character.species,
            image = character.image,
            origin = character.origin.mapToCached(),
            location = character.location.mapToCached()
        )

    fun mapFromCached(cachedCharacter: CachedCharacter): Character =
        Character(
            id = cachedCharacter.id,
            name = cachedCharacter.name,
            status = mapStatusFromCached(cachedCharacter.status),
            gender = cachedCharacter.gender,
            species = cachedCharacter.species,
            image = cachedCharacter.image,
            origin = cachedCharacter.origin.mapFromCached(),
            location = cachedCharacter.location.mapFromCached()
        )

    private fun Status.mapToCached(): String =
        when (this) {
            Status.ALIVE -> ALIVE
            Status.DEAD -> DEAD
            else -> UNKNOWN
        }

    private fun Origin.mapToCached(): CachedOrigin =
        CachedOrigin(
            name = name,
            url = url
        )

    private fun Location.mapToCached(): CachedLocation =
        CachedLocation(
            name = name,
            url = url
        )

    private fun mapStatusFromCached(status: String): Status =
        when (status) {
            ALIVE -> Status.ALIVE
            DEAD -> Status.DEAD
            else -> Status.UNKNOWN
        }

    private fun CachedOrigin.mapFromCached(): Origin =
        Origin(
            name = name,
            url = url
        )

    private fun CachedLocation.mapFromCached(): Location =
        Location(
            name = name,
            url = url
        )

    private companion object {
        const val ALIVE = "Alive"
        const val DEAD = "Dead"
        const val UNKNOWN = "Unknown"
    }
}
