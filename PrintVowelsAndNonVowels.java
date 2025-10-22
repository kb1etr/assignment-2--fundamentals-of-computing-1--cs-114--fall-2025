import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {

    String input;
    int vowelA = 0, vowelE = 0, vowelI = 0, vowelO = 0, vowelU = 0;

    Scanner keyboardInput = new Scanner(System.in);

    System.out.println();
    System.out.print("String: ");
    input = keyboardInput.nextLine();
    int nonVowel = input.length();

    for(int i = 0; i < input.length(); i++) {
      switch(input.charAt(i)) {
        case 'a':
          vowelA ++;
          nonVowel --;

        break;

        case 'e':
          vowelE ++;
          nonVowel --;

        break;

        case 'i':
          vowelI ++;
          nonVowel --;

        break;

        case 'o':
          vowelO ++;
          nonVowel --;

        break;

        case 'u':
          vowelU ++;
          nonVowel --;

        break;

      }
    }
  System.out.println();
  System.out.println("String has:");
  System.out.println();
  System.out.println("a - " + vowelA);
  System.out.println("e - " + vowelE);
  System.out.println("i - " + vowelI);
  System.out.println("o - " + vowelO);
  System.out.println("u - " + vowelU);
  System.out.println();
  System.out.println("Non-vowel - " + nonVowel);
  System.out.println();
  }
}
