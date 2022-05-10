package DesignPatterns.TemplateMethod;

abstract class GameAI {
    void turn() {
        collectResources();
        buildStructures();
        buildUnits();
        attack();
    }

    abstract void attack();

    abstract void buildUnits();

    abstract void buildStructures();

    abstract void collectResources();
}
