package com.gift;

public class Driver {
public static void main(String args[]) {

	Candy candy=new Candy();
	candy.setInfo("sathwik", "Anu", "Caramel");
	candy.getInfo();
	
	System.out.println();
	
	Sweet sweet=new Sweet();
	sweet.setInfo("sathwik", "saketh", "Laddu");
	sweet.getInfo();
	
	System.out.println();
	Halva halva=new Halva();
	halva.setSweetType("Dessert");
	halva.setInfo("Raam", "basundi", 1000, 1500, 750);
	halva.getInfo();
	
	System.out.println();
	Chocolate choco =new Chocolate();
	choco.setInfo("kit kat", "Nuts", 120, 576, 50);
	choco.setCandyType("Chocolate");
	choco.getInfo();
	
	System.out.println();
	Caramel caramel=new Caramel();
	caramel.setCandyType("Caramel");
	caramel.setInfo("Canva", "hard Caramel", 505, 780, 25);
	caramel.getInfo();
	
	System.out.println();
//Gift -> sweet ->Laddu
	Laddu laddu=new Laddu();
	laddu.setInfo("SweetMagic", "mothichu Laddu", 150, 756, 10);
	laddu.setSweetType("end");
	laddu.getInfo();
	
	
}
}
