package mycoffeeshop.controller;

import mycoffeeshop.controller.console.Console;
import mycoffeeshop.controller.menu.AddOns;
import mycoffeeshop.controller.menu.Drinks;
import mycoffeeshop.factory.BeverageFactory;
import mycoffeeshop.controller.search.MySearch;
import mycoffeeshop.decorator.Beverage;
import mycoffeeshop.observer.socialnetworks.GmailNotification;
import mycoffeeshop.observer.socialnetworks.TelegramNotification;
import mycoffeeshop.observer.socialnetworks.ZaloNotification;
import mycoffeeshop.observer.status.OrderStatus;
import mycoffeeshop.singleton.Cart;
import mycoffeeshop.state.Events;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Events event;
    private Cart cart = Cart.getInstance();

    public Controller(Events event) {
        this.event = event;
    }

    public void order() {
        cart = letCustomersOrder();
        OrderStatus orderStatus = makeOrderStatus();

        System.out.println();
        showReceipt();
        cart.clearCart();

        sendOrderStatus(orderStatus);
    }

    private OrderStatus makeOrderStatus() {
        OrderStatus orderStatus = new OrderStatus();
        orderStatus.addObserver(new ZaloNotification(orderStatus));
        orderStatus.addObserver(new TelegramNotification(orderStatus));
        orderStatus.addObserver(new GmailNotification(orderStatus));
        return orderStatus;
    }

    private void sendOrderStatus(OrderStatus orderStatus) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        orderStatus.setStatus("received");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        orderStatus.setStatus("in process");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        orderStatus.setStatus("done");
    }

    private Cart letCustomersOrder() {
        byte option;
        String continueFlag;
        Beverage beverage;
        byte[] toppingsAvailable;
        List<Byte> toppings = new ArrayList<>();
        do {
            System.out.println();
            showBeverage();
            option = Console.readNumberBeverage("Choose a beverage by entering a number: ", (byte)1, (byte) Drinks.values().length);
            beverage = BeverageFactory.getBeverage(option);
            toppingsAvailable = beverage.getCompatible();
            if (toppingsAvailable.length != 0) {
                do {
                    System.out.println();
                    showToppings(toppingsAvailable);
                    option = Console.readNumberToppings("Choose toppings by entering a number: ", toppingsAvailable);
                    if (option == 0) {
                        break;
                    }
                    toppings.add(option);
                    System.out.print("[yes/no] Would you like to pick another add-on? ");
                    continueFlag = Console.getScanner().next();
                } while (continueFlag.equals("yes"));

                for (byte topping: toppings) {
                    beverage = BeverageFactory.getBeverageWithToppings(topping, beverage);
                }
            }
            cart.addNewBeverage(beverage);
            toppings.clear();

            System.out.println();
            System.out.print("[yes/no] Would you like to order more? ");
            continueFlag = Console.getScanner().next();
        } while (continueFlag.equals("yes"));
        return cart;
    }

    private void showBeverage() {
        System.out.println("************************** Drinks **************************");
        System.out.println("This is " + event.getName());
        System.out.println("No    Name                                    Price");
        for (Drinks drink: Drinks.values()) {
            System.out.printf("%-6d%-40s%-10.2f\n", drink.getNumber(), drink.getName(), event.discount(drink.getPrice()));
        }
        System.out.println("************************************************************");
    }

    private void showToppings(byte[] toppingsAvailable) {
        System.out.println("************************* Toppings *************************");
        System.out.println("This is " + event.getName());
        System.out.println("No    Name                                    Price");
        System.out.println("0     No toppings");
        for (AddOns addOn: AddOns.values()) {
            if (MySearch.search(toppingsAvailable, 0, toppingsAvailable.length - 1, addOn.getNumber())) {
                System.out.printf("%-6d%-40s%-10.2f\n", addOn.getNumber(), addOn.getName(), event.discount(addOn.getPrice()));
            }
        }
        System.out.println("************************************************************");
    }

    private void showReceipt() {
        List<Beverage> beverages = cart.getCart();
        float total = 0F;
        System.out.println("*********************************** Receipt ***********************************");
        System.out.println("This is " + event.getName());
        System.out.println("Name                                                             Price");
        for (Beverage beverage: beverages) {
            System.out.printf("%-65s%-10.2f\n", beverage.getName(), event.discount(beverage.getPrice()));
            total += beverage.getPrice();
        }
        total = event.discount(total);
        System.out.printf("%-65s%-10.2f\n", "Total:", total);
        System.out.println("*******************************************************************************");
    }

    public void setEvent(Events event) {
        this.event = event;
    }

    public Events getEvent() {
        return event;
    }
}
