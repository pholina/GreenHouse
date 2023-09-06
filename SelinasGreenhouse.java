//Selina Nguyen
//December 6th, 2021
//SelinasGreenhouse.java
//Purpose: This program lets the user learn more about various flowers 

import java.util.*; //import package 

public class SelinasGreenhouse {

   public static void main (String [] args) { //use of a method
      Scanner console = new Scanner (System.in);
      intro(); //intro method
      String flowersCalled = learnAboutFlowers(console); //takes the user input to run the program 
      int numOfFlowers = flowerCount(flowersCalled); //counts number of flowers in the string 
      outro (flowersCalled, numOfFlowers); //outro method that prints the number of flowers the users learned about and the flower types
   }
   
   //Prints an introduction to the console
   public static void intro(){ //method
      System.out.println("Hello! Welcome to Selina's Greenhouse");
      System.out.println("Feel free to browse around and enter a type of flower.");
      System.out.println("You will then get information about each type of flower: ");
      System.out.println();
      setFlower();
   }
   public static void setFlower(){ //setter
    String[] flowerType = {"Rose", "Tulip", "Peony", "Sunflower", "Daisy"}; //array
    printFlower(flowerType);
   }
   public static String getFlowers(String[] flowerType,int i){ //getter
    return flowerType[i];
   }
   public static void printFlower(String[] flowerType){
    for (int i = 0; i< flowerType.length; i++){
        System.out.println(getFlowers(flowerType,i));
   }
}
        
   //Prints the Rose flower information to the console
      public static String rose (String flowerTotal) { //method
         System.out.println("Flower name: Rose");
         System.out.println("Kingdom: Plantae");
         System.out.println("Used for cooking, perfumes, makeup, decorations");
         System.out.println();
         flowerTotal+= "\nRose"; //adds rose to the string of flowerTotals
         return flowerTotal; //helps keep track of flowerTotal
   }
   
   //Prints the Tulip flower information to the console
   public static String tulip (String flowerTotal) { //method
      System.out.println("Flower name: Tulip");
      System.out.println("Kingdom: Plantae");
      System.out.println("Used for diseases and decorations");
      System.out.println();
      flowerTotal+= "\nTulip"; //adds tulip to the string of flowerTotals
      return flowerTotal; //helps keep track of flowerTotal
   }
   
   //Prints the Peony flower information to the console 
   public static String peony (String flowerTotal) { //method
      System.out.println("Flower name: Peony");
      System.out.println("Kingdom: Plantae");
      System.out.println("Used for makeup, dyes, decorations");
      System.out.println();
      flowerTotal+= "\nPeony"; //adds peony to the string of flowerTotals
      return flowerTotal; //helps keep track of flowerTotal
   }
   
   //Prints the Sunflower flower information to the console
   public static String sunflower (String flowerTotal) { //method
      System.out.println("Flower name: Sunflower");
      System.out.println("Kingdom: Plantae");
      System.out.println("Used for animals, nature, decorations");
      System.out.println();
      flowerTotal+= "\nSunflower"; //adds sunflower to the string of flowerTotals
      return flowerTotal; //helps keep track of flowerTotal
   }
   
   //Prints the Daisy flower information to the console
   public static String daisy (String flowerTotal) { //method
      System.out.println("Flower name: Daisy");
      System.out.println("Kingdom: Plantae");
      System.out.println("Used for edible decorations and perfumes");
      System.out.println();
      flowerTotal+= "\nDaisy"; //adds daisy to the string of flowerTotals
      return flowerTotal; //helps keep track of flowerTotal
   }
   
   //Keeps track of the number of flowers the user has learned about 
   public static int flowerCount(String flowerTotal) { //method
      int flowerCount = 0; //setting flowerCount equal to zero
      for (int i = 0; i < flowerTotal.length();i++) { //keeps track of flowerTotal and gives us a definite value //nestedloop
         if (flowerTotal.charAt(i) == '\n') { //counts how many new lines are in the string, gives us the total number of flowers
            flowerCount++; //increases by one for each flower that the user learns about
         }
      }
      return flowerCount; //gives us the number of flowers in the string
   }
   
   //Repeatedly asks the user for a flower they want to learn
   //about and prints the flowers information to the console until the user
   //types in quit (when asked what they want to do next).
   public static String learnAboutFlowers (Scanner console) {
      System.out.println("Do you want to learn about flowers?");
      String answer = console.nextLine(); //allows the user to answer question
      System.out.println("Please enter a flower name to learn about them: ");
      int flowerCount = 0; //setting flowerCount equal to zero
      String usersFlower = console.nextLine(); //allows user to type which flower they want to learn about
      String flower = ""; //empty place holder
          
      while (usersFlower != "quit") { //lets the user continue to learn about flowers //looping with repitition

        switch(usersFlower){ //branching
        case "Rose":
            flower = rose(flower); //prints info about roses if user types Rose into console
            break;
         
         case "Tulip":
            flower = tulip(flower); //prints info about tulips if user types Tulip into console
            break;
         
            case "Peony":
            flower = peony(flower); //prints info about peonies if user types Peony into console
            break;
         
            case "Sunflower":
            flower = sunflower(flower); //prints info about sunflowers if user types Sunflower into console
            break;
         
            case "Daisy":
            flower = daisy(flower); //prints info about daisies if user types Daisy into console
            break;
            default: 
            System.out.println("Please type the flower in the correct format or choose a different flower.");
            break;
        }
         System.out.println("Please enter flower name to learn about them \nOR type \"quit\" to end your session");
         usersFlower = console.nextLine(); //used when the user wants to learn about more than one flower
             if (usersFlower.equals("quit")) { //ends the info session about flowers
               return flower; 
             }   
       }
       return flower; 
   }
   
   //Prints the outro to the console
   public static void outro(String flowersCalled, int flowerCount) {
      System.out.println("You learned about " + flowerCount + " flowers!"); //tells the user the number of flowers they learned about
      System.out.println("Here are the flowers you learned about: " + flowersCalled); //lists the types of flowers the user learned about
      System.out.println("I hope you had fun, Come again!");
      System.out.println("Your session is now ended with Tina's Greenhouse.");
      System.out.println();
   }
}