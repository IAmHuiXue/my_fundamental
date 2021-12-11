package functional_programming.functional_interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "999999999");
        // normal java function
        greetCustomer(maria);
        greetCustomerV2(maria, false);
        // Consumer Functional interface
        greetCustomerConsumer.accept(maria);
        // BiConsumer Functional interface
        greetCustomerConsumerV2.accept(maria, false);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                customer.customerPhoneNumber);
    }

    // Consumer function takes 1 argument and produces nothing (void)
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number " +
            customer.customerPhoneNumber);

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                (showPhoneNumber ? customer.customerPhoneNumber : "*******"));
    }

    // BiConsumer function takes 2 arguments and produces nothing (void)
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber : "*******"));

}
