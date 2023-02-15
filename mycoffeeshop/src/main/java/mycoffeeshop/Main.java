package mycoffeeshop;

import mycoffeeshop.controller.Controller;
import mycoffeeshop.state.events.NormalDays;
import mycoffeeshop.state.events.Christmas;
import mycoffeeshop.state.events.TetHoliday;
import mycoffeeshop.state.events.BlackFriday;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new NormalDays(0F));
        controller.order();
    }
}
