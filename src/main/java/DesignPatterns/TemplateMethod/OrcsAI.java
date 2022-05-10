package DesignPatterns.TemplateMethod;

import java.util.Random;

class OrcsAI extends GameAI{
    Random random = new Random();
    @Override
    void attack() {
        System.out.println("Orc attack!");
    }

    @Override
    void buildUnits() {
        System.out.println("Orc build " + random.nextInt(10) + " warriors!");
    }

    @Override
    void buildStructures() {
        System.out.println("Orc build " + random.nextInt(10) + " structures!");
    }

    @Override
    void collectResources() {
        System.out.println("Orc collect " + random.nextInt(10) + " resources!");
    }

    @Override
    void turn() {
        super.turn();
        System.out.println("Orc finish tour");
    }
}
