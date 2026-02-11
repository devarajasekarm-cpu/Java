package Payment;

public interface PaymentGateway {

    //constant
    public static final double tax = 2.35;

    //abstract method
    public void payment(double amount);

    //default method
    public default void GenerateReceipt(double amount){
        double pay = amount + calculateTax(amount);
    }

    //private method
    private double calculateTax(double amount){
        return ((amount/100)*10);
    }

    //static method
    public static void welcome(){
        System.out.println("Welcome to very secure payment gateway...");
    }

}
