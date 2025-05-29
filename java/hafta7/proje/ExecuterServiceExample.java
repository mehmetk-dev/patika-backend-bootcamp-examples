package hafta7.proje;

public class ExecuterServiceExample implements Runnable {

    private String name;
    private int taskId;

    public ExecuterServiceExample(String name, int taskId) {
        this.name = name;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Worker " + name + " " + taskId + ".started work");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Worker " + name + " " + taskId + ".finished work");

    }
}
