import java.util.*;

public class palindronic {
  public static void main(String[] args) {
    int n = 5;
    for (int i =1; i<=n; i++) {

      // spaces //
      for (int j=i; j<=n; j++) {
        System.out.print( " " );
      }

      // first half //
      for (int j=i; j>=1; j--) {
        System.out.print(j);
      }

      // second half //
      for (int j=2; j<=i; j++) {
        System.out.print(j);
      }

      System.out.println();
    }
  }
}

// Output //
//      1
//     212
//    32123
//   4321234
//  543212345