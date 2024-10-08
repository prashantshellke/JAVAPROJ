package chap1;

class Main {
    public static void main(String[] args) {
        // Create SilverCardCustomer object
        SilverCardCustomer silverCustomer = new SilverCardCustomer("John Doe", "1234567890123456");
        silverCustomer.viewCreditAmount();
        silverCustomer.useCard(10000);
        silverCustomer.payCredit(5000);
        silverCustomer.increaseLimit(3000); // Should display that Silver card customers can't increase limit
        silverCustomer.viewCreditAmount();
        
        System.out.println("-----");
        
        // Create GoldCardCustomer object
        GoldCardCustomer goldCustomer = new GoldCardCustomer("Jane Doe", "9876543210987654");
        goldCustomer.viewCreditAmount();
        goldCustomer.useCard(50000);
        goldCustomer.payCredit(20000);
        goldCustomer.increaseLimit(4000); // Should increase limit by 4000
        goldCustomer.increaseLimit(6000); // Should display limit increase failure due to limit
        goldCustomer.increaseLimit(3000); // Should increase limit by 3000
        goldCustomer.increaseLimit(5000); // Should increase limit by 5000
        goldCustomer.increaseLimit(1000); // Should fail as the increase limit count is 3
        goldCustomer.viewCreditAmount();
    }
}