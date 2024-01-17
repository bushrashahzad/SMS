public class Thread2 extends Thread {
    int orderID;
    Controller controller = new Controller();
    public void run() {
        controller.addNewOrderItem(orderID);
    }
}
