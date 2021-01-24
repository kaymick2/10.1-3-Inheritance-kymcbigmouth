import java.util.*;

class Main {
  public static void main(String[] args) {
    Random rand1 = new Random();
    int random1 = rand1.nextInt(101) + 1;
    Random rand2 = new Random();
    int random2 = rand2.nextInt(101) + 1;
    King bigboyclass = new King();
    System.out.println("\nYour numbers have been assigned to you automatically. We hate you.");
    System.out.println("\nYour numbers are: "+random1+" and "+random2+ ".");
    System.out.print("\nAdd them and you get ");
    bigboyclass.add1(random1, random2);
    System.out.println();
    System.out.print("Subtract them and you get ");
    bigboyclass.sub1(random1, random2);
    System.out.println();
    System.out.print("Multiply them and you get ");
    bigboyclass.mult1(random1, random2);
    System.out.println();
    System.out.print("Divide them and you get ");
    bigboyclass.divide1(random1, random2);

  }
}