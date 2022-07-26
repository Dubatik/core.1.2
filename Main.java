public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();

        Worker workerSecond = new Worker(listener, errorListener);
        workerSecond.start();
    }
}