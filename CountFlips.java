public class CountFlips {
  public static void main(String[] args) {

    Coin myCoin = new Coin();

    int headsCont = 0, tailsCont = 0;

    for (int i = 0; i < 100; i++) {

      myCoin.flip(); // 1. Flip the coin

     if (myCoin.toString() == "Heads") {
      headsCont ++;
      } else {
      tailsCont ++;
     }
    }

    System.out.println();
    System.out.println("How many times:");
    System.out.println();
    System.out.println(headsCont + " # Heads");
    System.out.println();
    System.out.println(tailsCont + " # Tails");
    System.out.println();

  }
}
