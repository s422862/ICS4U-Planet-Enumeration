// import 
import java.util.Scanner;

/**
 * Planet Enumeration.
 * Asks the user where they want to go
 * and create planet info where
 * it outputs a fact
* @author  John Omage
* @version 1.0
* @since   2020-09-26
*/

public class PlanetEnumaa {
  
  /**
    * Required javadoc.
  */
  
  public enum Planet {
    MERCURY, 
    VENUS, 
    EARTH, 
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE;
  }
  
  /**
    * Required javadoc.
  */
  
  public static void planetInfo(Planet myPlanet) {
    // switch statements and print random info
    switch (myPlanet) {
      case MERCURY:
        System.out.println("Mercury is the smallest planet.");
        break;
        
      case VENUS: 
        System.out.println("Venus is the second brightest object in the sky, besides the moon.");
        break;
        
      case EARTH:
        System.out.println(" is our home, you're already here!");
        break;
        
      case MARS: 
        System.out.println("a year there is twice as long as an earth year.");
        break;
        
      case JUPITER:
        System.out.println("Jupiter is the fastest spinning planet in the solar system.");
        break;
        
      case SATURN:
        System.out.println("Where the rings are made of ice.");
        break;
        
      case URANUS:
        System.out.println("it rotates on its side");
        break;
        
      default:
        System.out.println("The coldest planet in the solar system.");
        break;
    }
  }
  
 
  /**
    * Required javadoc.
  */
  
  public static void main(String[] args) {
    // create scanner
    Scanner userInput = new Scanner(System.in);
    
    // ask user what planet they want to go to
    System.out.println("Which planet do you want to go to? ");
    
    // set user answer to scanner
    String userPlanet = userInput.nextLine();
    
    // put user's input to uppercase since enum
    // are all uppercase
    userPlanet = userPlanet.toUpperCase();
    
    // setting planet to procedure
    Planet myPlanet = Planet.valueOf(userPlanet);
    
    // call planet info procedure
    planetInfo(myPlanet);
  }
}