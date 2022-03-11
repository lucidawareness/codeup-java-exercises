package serverNameGenerator;

public class ServerNameGenerator {
    static String [] adjectives = {"Charming", "Cruel", "Fantastic", "Gentle", "Huge", "Perfect", "Rough", "Sharp"};
    static String [] nouns = {"Tropicana", "Paris", "New York", "Maya", "Jupiter", "Google", "Oreo", "Ferrari"};

    static String random(String[] arr){
        return arr[(int) Math.floor(Math.random() * 8)];
    }

    public static void main(String[] args) {
        System.out.print("Here is your server name: ");
        System.out.printf("%s-%s", random(adjectives), random(nouns));
    }

}
