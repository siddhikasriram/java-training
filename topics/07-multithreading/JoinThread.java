class JoinThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }

    public static void main(String[] args) {
        JoinThread t1 = new JoinThread();
        JoinThread t2 = new JoinThread();
        t1.start();
        t1.join();  // wwaits for t1 to finish before starting t2
        t2.start();
    }
}
