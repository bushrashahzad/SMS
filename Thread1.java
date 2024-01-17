class Thread1 extends Thread{
    Controller controller = new Controller();
    public void run() {
        controller.mainLoop();
    }
}