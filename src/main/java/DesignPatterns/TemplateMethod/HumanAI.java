package DesignPatterns.TemplateMethod;

import java.util.Random;

class HumanAI extends GameAI{
    Random random = new Random(10);
    @Override
    void attack() {
        System.out.println("Human attack!");
    }

    @Override
    void buildUnits() {
        System.out.println("Human build " + random.nextInt(10) + " warriors!");
    }

    @Override
    void buildStructures() {
        System.out.println("Human build " + random.nextInt(10) + " structures!");
    }

    @Override
    void collectResources() {
        System.out.println("Human collect " + random.nextInt(10) + " resources!");
    }

    @Override
    void turn() {
        super.turn();
        System.out.println("Human finish turn!");
    }
}
