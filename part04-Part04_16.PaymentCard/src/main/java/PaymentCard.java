public class PaymentCard {
    private double balance;

    //constructor

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() { 
        if(this.balance - 2.60 < 0) {
            return;
        }
        this.balance = this.balance - 2.60;
    }

    public void eatHeartily() { 
        if(this.balance - 4.60 < 0) {
            return;
        }
        this.balance = this.balance - 4.60;
    }


    public void addMoney(double amount) {
        if(amount < 0) {
            return;
        }
        if(amount + this.balance > 150) {
            this.balance = this.balance + (150 - amount);
            return;
        }
        this.balance = this.balance + amount;
    }



}
