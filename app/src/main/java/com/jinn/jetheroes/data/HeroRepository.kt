package com.jinn.jetheroes.data

import com.jinn.jetheroes.model.Hero
import com.jinn.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}