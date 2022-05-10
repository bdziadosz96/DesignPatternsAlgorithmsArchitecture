package DesignPatterns.TemplateMethod;

class Demo {
    public static void main(String[] args) {
        GameAI human = new HumanAI();
        GameAI orc = new OrcsAI();
        human.turn();
        orc.turn();
    }
}
