import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    String input;
    int vowelA = 0, vowelE = 0, vowelI = 0, vowelO = 0, vowelU = 0;
    

    Scanner keyboardInput = new Scanner(System.in);
    input = keyboardInput.nextLine();
    int nonVow = input.length();
    System.out.println(nonVow);


    for(int i = 0; i < input.length(); i++) {
      switch(input.charAt(i)) {
        case 'a':
          System.out.println("a was found");
          vowelA = vowelA + 1;
          nonVow = nonVow - 1;

          break;
        
        case 'e':
          System.out.println("e was found");
          vowelE = vowelE + 1;
          nonVow = nonVow - 1;

          break;

        case 'i':
          System.out.println("i was found");
          vowelI = vowelI + 1;
          nonVow = nonVow - 1;

          break;

        case 'o':
          System.out.println("o was found");
          vowelO = vowelO + 1;
          nonVow = nonVow - 1;

          break;

        case 'u':
          System.out.println("u was found");
          vowelU = vowelU + 1;
          nonVow = nonVow - 1;

          break;

      }
    }
  
  System.out.println("A - " + vowelA);
  System.out.println("E - " + vowelE);
  System.out.println("I - " + vowelI);
  System.out.println("O - " + vowelO);
  System.out.println("U - " + vowelU);
  System.out.println();
  System.out.println("non-vowel" + nonVow);
  
  
  }
}
