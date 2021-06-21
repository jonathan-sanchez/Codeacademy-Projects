import java.util.Scanner;

public class Onyx {
    public static void main(String[] args){
        // System.out.println("Hi my name is Onyx!");
        // System.out.println("AKA The menace!");

        onyxTheMenace();
    }

    public static boolean onyxTheMenace(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Here is a list of commands that onyx will react to.");
        System.out.println("sit, lay down, up, place, treat, outside");

        
        String userInput = sc.nextLine();

        if (userInput.equals("sit")) {
            System.out.print("Onyx raises eyebrows and slowly sits in place.");
        } else if (userInput == "lay down") {
            System.out.println("Onyx calmy lays down waiting for next command.");
        } else if (userInput == "up") {
            System.out.println("Onyx jumps up at your face in a furry of tail spins.");
        } else if (userInput == "place"){
            System.out.println("Onyx looks down as if he is in trouble and quickly finds a place off the ground.");
        } else if (userInput == "treat") {
            System.out.println("The menace reveals his true face, as the excitement rises throughout his body and can no longer contain himself ready to recieve his favorite snack.");
        } else {
            System.out.println("Onyx doesnt understand that command, try again.");
        }
        return onyxTheMenace();
    }
    
}
