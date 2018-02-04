package com.company;

public class Veterinario {
    AnimalDomestico animal;

    public Veterinario(AnimalDomestico animal){
        this.animal=animal;
    }
    public void curar(){
        if(this.animal instanceof Gato) {
            System.out.println("Estoy Curando a un Gato");
        }
        else{
            System.out.println("Estoy curando a un Perro");
        }
        this.animal.saludar();
    }
}
