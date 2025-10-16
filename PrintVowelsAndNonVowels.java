import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    String input;
    int vowelA = 0, vowelE = 0, vowelI = 0, vowelO = 0, vowelU = 0;

    Scanner keyboardInput = new Scanner(System.in);
    System.out.println();
    System.out.print("String: ");
    input = keyboardInput.nextLine();
    int nonVow = input.length();

    for(int i = 0; i < input.length(); i++) {
      switch(input.charAt(i)) {
        case 'a':
          vowelA ++;
          nonVow --;

          break;
        
        case 'e':
          vowelE ++;
          nonVow --;

          break;

        case 'i':
          vowelI ++;
          nonVow --;

          break;

        case 'o':
          vowelO ++;
          nonVow --;

          break;

        case 'u':
          vowelU ++1;
          nonVow --;

          break;

      }
    }
  System.out.println();
  System.out.println("A - " + vowelA);
  System.out.println("E - " + vowelE);
  System.out.println("I - " + vowelI);
  System.out.println("O - " + vowelO);
  System.out.println("U - " + vowelU);
  System.out.println();
  System.out.println("Non-vowel - " + nonVow);
  System.out.println();
  }
}
