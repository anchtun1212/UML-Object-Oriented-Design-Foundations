package com.anchtun.ood.polymorphism;

import java.util.ArrayList;
import java.util.List;

import com.anchtun.ood.polymorphism.model.ElectricPokemon;
import com.anchtun.ood.polymorphism.model.FlyingPokemon;
import com.anchtun.ood.polymorphism.model.Pokemon;
import com.anchtun.ood.polymorphism.model.WaterPokemon;

public class Test {

	public static void main(String[] args) {
		Pokemon pok1 = new Pokemon("Pok1");
		ElectricPokemon pok2 = new ElectricPokemon("Pok2");
		FlyingPokemon pok3 = new FlyingPokemon("Pok3");
		WaterPokemon pok4 = new WaterPokemon("Pok4");

		List<Pokemon> listPokemon = new ArrayList<>();
		listPokemon.add(pok1);
		listPokemon.add(pok2);
		listPokemon.add(pok3);
		listPokemon.add(pok4);

		for (Pokemon pokemon : listPokemon) {
			pokemon.attack();
		}
	}
}
