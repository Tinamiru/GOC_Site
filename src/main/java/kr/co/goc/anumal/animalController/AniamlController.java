package kr.co.goc.anumal.animalController;

import kr.co.goc.anumal.animalService.AnimalServiceImpl;

public class AniamlController {
	private AnimalServiceImpl animalService;
	
	public AniamlController() {
		animalService = AnimalServiceImpl.getInstance();
	}
}

