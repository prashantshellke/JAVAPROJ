package chap1;
interface CreditCardInterface {
    void viewCreditAmount();
    void useCard(int amount);
    void payCredit(int amount);
    void increaseLimit(int amount);
}

// Step 2: Implement SilverCardCustomer class
class SilverCardCustomer implements CreditCardInterface {
    protected String name;
    protected String cardNumber;
    protected int creditAmount;
    protected int creditLimit;
    
    // Constructor
    public SilverCardCustomer(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.creditAmount = 0; // initialized to 0
        this.creditLimit = 50000; // set to 50,000
    }
    
    // Method to view current credit amount
    @Override
    public void viewCreditAmount() {
        System.out.println(name + " has a current credit amount of: Rs. " + creditAmount);
    }

    // Method to use the card
    @Override
    public void useCard(int amount) {
        if (creditAmount + amount <= creditLimit) {
            creditAmount += amount;
            System.out.println("Transaction successful. Rs. " + amount + " used. Current credit amount: Rs. " + creditAmount);
        } else {
            System.out.println("Transaction failed. Cannot exceed credit limit of Rs. " + creditLimit);
        }
    }

    // Method to pay credit
    @Override
    public void payCredit(int amount) {
        if (amount <= creditAmount) {
            creditAmount -= amount;
            System.out.println("Rs. " + amount + " paid. Remaining credit amount: Rs. " + creditAmount);
        } else {
            System.out.println("Payment failed. You are trying to pay more than your credit amount.");
        }
    }

    // SilverCardCustomer can't increase limit, so this method will not change anything
    @Override
    public void increaseLimit(int amount) {
        System.out.println("Silver card customers cannot increase their credit limit.");
    }
}

// Step 3: Implement GoldCardCustomer class inheriting from SilverCardCustomer
class GoldCardCustomer extends SilverCardCustomer {
    private int increaseLimitCount = 0;
    
    // Constructor
    public GoldCardCustomer(String name, String cardNumber) {
        super(name, cardNumber);
        this.creditLimit = 100000; // set to 1,00,000
    }

    // Overriding the increaseLimit method for GoldCardCustomer
    @Override
    public void increaseLimit(int amount) {
        if (increaseLimitCount < 3 && amount <= 5000) {
            creditLimit += amount;
            increaseLimitCount++;
            System.out.println("Credit limit increased by Rs. " + amount + ". New limit: Rs. " + creditLimit);
        } else if (increaseLimitCount >= 3) {
            System.out.println("Cannot increase credit limit more than 3 times.");
        } else {
            System.out.println("Cannot increase credit limit by more than Rs. 5000 at a time.");
        }
    }
}

// Step 4: Test the functionality
