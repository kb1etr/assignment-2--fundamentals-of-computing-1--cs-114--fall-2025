import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {

    Scanner numberInp = new scanner(System.in);

    int userInput;

    System.out.println("Times : ");
    userInput = input.nextInt();

    for (int = userInput; i > 0; i--) {
      printVers(i);
      System.out.print("   ");
    }

  }

 static void printVers(int number) {
   System.out.println(number + " bottles of beer on the wall");
   System.out.println(number + "bottles of beer");
   System.out.println("If one of those bottles should happen to fall");
   System.out.println((number --)" bottles of beer on the wall");

 }

}
