import java.util.Scanner;

public class Elizachart {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to ElizaChats!:" + "My name is Eliza," + "What's your name?");
        String name = input.nextLine();
        System.out.println("Nice to meet you," + name + "How has your day been?");
        String ask = input.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel that It has been a splendid day!" + ask);
        String question = input.nextLine();
        System.out.println("Okay, Well it has been my pleasure to speak with you." + question + "Have a nice day!");
        System.out.println("Here are your responses:" + name + ask + question + "Hannah Snow It has been a splendid day! Yes, I got a job promotion :)");
    }
}
