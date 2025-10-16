import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {

    Scanner numberInp = new Scanner(System.in);

    int userInput;

    System.out.print("Times: ");
    userInput = numberInp.nextInt();
    System.out.println();

    for (int i = userInput; i > 0; i--) {
      printVers(i);
      System.out.println();
    }

  }

 static void printVers(int number) {
   System.out.println(number + " bottles of beer on the wall");
   System.out.println(number + " bottles of beer");
   System.out.println("If one of those bottles should happen to fall");
   System.out.println((number - 1) + " bottles of beer on the wall");

 }

}
