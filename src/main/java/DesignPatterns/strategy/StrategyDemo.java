package DesignPatterns.strategy;

class StrategyDemo {
    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is amex valid: " + amexCard.isValid());

        amexCard.setNumber("379185883464284");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is amex valid: " + amexCard.isValid());

        CreditCard pekaoCard = new CreditCard(new PekaoStrategy());

        pekaoCard.setNumber("379185883464283");
        pekaoCard.setDate("04/2020");
        pekaoCard.setCvv("600");

        System.out.println("Is pekao valid: " + pekaoCard.isValid());
    }
}
