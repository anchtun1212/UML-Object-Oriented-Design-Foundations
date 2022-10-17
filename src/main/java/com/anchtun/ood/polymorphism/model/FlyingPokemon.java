package com.anchtun.ood.polymorphism.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyingPokemon extends Pokemon {

	public FlyingPokemon(String name) {
		super(name);
	}

	// override the supreclass method
	public void attack() {
		log.info(name + " Attack !!!");
	}
}
