package DesignPatterns.strategy;

class PekaoStrategy extends ValidationStrategy{
    @Override
    public boolean isValid(final CreditCard creditCard) {
        boolean isValid = true;

        isValid = Integer.parseInt(creditCard.getCvv()) < 500;

        if (isValid) {
            isValid = creditCard.getNumber().length() == 15;
        }

        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }
}
