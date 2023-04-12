public interface Runnable {

    public abstract void run();

    Runnable r = new Runnable() {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        }
    };


}
