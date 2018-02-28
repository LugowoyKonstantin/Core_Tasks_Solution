package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Crow extends Animal {

    public Crow() {
        super("Caw, caw !");
    }

    @Override
    public String toString() {
        return this.getClass() + super.toString();
    }

    @Override
    public Crow clone() throws CloneNotSupportedException {
        return (Crow) super.clone();
    }

}
