public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("The Twelve Days of Christmas\n");

  for (int i = 1; i < 13; i++){

   System.out.print("On the " + i);

  switch(i){

   default:
     System.out.print("th");

    break;
    
   case 1:
    System.out.print("st");

    break;

   case 2:
    System.out.print("nd");

    break;

    case 3:
     System.out.print("rd");

    break;

    }

    System.out.println(" day of Christmas my true love gave to me");
    System.out.println();

    switch(i){

    case 12:
    System.out.println("  Twelve drummers drumming,");


    case 11:
    System.out.println("  Eleven pipers piping,");


    case 10:
    System.out.println("  Ten lords a-leaping,");


    case 9:
    System.out.println("  Nine ladies dancing,");

    case 8:
    System.out.println("  Eight maids a-milking,");

    
    case 7:
    System.out.println("  Seven swans a-swimming,");

    case 6:
    System.out.println("  Six geese a-laying,");


    case 5:
    System.out.println("  Five golden rings,");

   case 4:
    System.out.println("  Four calling birds,");

   case 3:
    System.out.println("  Three French hens,");

   case 2:
    System.out.println("  Two turtle doves, and");
   
   case 1:
     System.out.println("  A partridge in a pear tree.");
     System.out.println();
   }

  }
  
 }
}
