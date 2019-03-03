/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pl.saltsoft;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws Exception {

    Pizza pizza = new Pizza("Margarita",32.5,2);
    Serializer s = new Serializer();

    String jsonpizza = "{\"name\":\"Serowa\",\"diameter\":32.5,\"menuno\":2}";

    s.doSerialize(pizza);
    Pizza margarita = s.deSerialize(jsonpizza);

    System.out.println(margarita.name);

    }

}
