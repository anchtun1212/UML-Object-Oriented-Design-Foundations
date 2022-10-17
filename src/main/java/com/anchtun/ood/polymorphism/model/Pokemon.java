package com.anchtun.ood.polymorphism.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@Data
public class Pokemon {

	// properties
	protected String name;

	// behavior/methods
	public void attack() {
		log.info("Pekemon Attack !!!");
	}
}
