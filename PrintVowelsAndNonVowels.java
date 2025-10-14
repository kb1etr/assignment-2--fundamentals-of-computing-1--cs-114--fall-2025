import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    String input;
    Scanner keyboardInput = new Scanner(System.in);
    input = keyboardInput.nextLine();
    int nonVow = input.length();
    System.out.println(nonVow);


    for(int i = 0; i < input.length(); i++) {
      switch(input.charAt(i)) {
        case 'a':
          System.out.println("a was found");

          break;
        
        case 'e':
          System.out.println("e was found");

          break;
        case 'i':
          System.out.println("i was found");

          break;
        case 'o':
          System.out.println("o was found");

          break;
        case 'u':
          System.out.println("u was found");

          break;





      }
    }
  }
}
