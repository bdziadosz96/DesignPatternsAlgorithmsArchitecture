package DesignPatterns.strategy;

class CreditCard {
    private String number;
    private String date;
    private String cvv;
    private ValidationStrategy strategy;

    CreditCard(final ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    boolean isValid() {
        return strategy.isValid(this);
    }

    String getNumber() {
        return number;
    }

    void setNumber(final String number) {
        this.number = number;
    }

    String getDate() {
        return date;
    }

    void setDate(final String date) {
        this.date = date;
    }

    String getCvv() {
        return cvv;
    }

    void setCvv(final String cvv) {
        this.cvv = cvv;
    }
}
