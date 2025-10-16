import java.util.Random;

public class CountFlips {
  public static void main(String[] args) {

  int face = 0;

   for ( int i = 0; i < 10; i++){
    
    face = (int) (Math.random() * 2);
    System.out.println("Face = " + (face));

    face = 0;

   }
    
  }
}
