package com.company;

public class Main {

    public static void main(String[] args) {
	    Gato cat = new Gato("Tom", "Negro");
	    /*cat.saludar();*/
	    Perro dog= new Perro("Boby", "Cafe","chapi");
	    /*dog.saludar();
	    AnimalDomestico animal=new Perro("Gato1", "blanco");*/
	    Veterinario v1 = new Veterinario(dog);
	    v1.curar();
    }
}
