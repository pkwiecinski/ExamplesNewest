/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pl.saltsoft;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws Exception {
        StartMany quiteALotOfWorkers = new StartMany();
        quiteALotOfWorkers.startManyWorkers(30);
    }

}
