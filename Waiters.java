public class Waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int FoodPrice = 25000;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("======================================================");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Number of Food: " + orderQty);
        System.out.println("Total Price: " + (orderQty * FoodPrice));
        System.out.println("======================================================");
    }

    public void getFood() {
        synchronized (Restaurant.getLock()) {

            System.out.println("Waiter: Food is ready to deliver");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the restaurant to make another food\n");
        }
    }
}