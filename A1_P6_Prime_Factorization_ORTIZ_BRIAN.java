public class A1_P6_Prime_Factorization_ORTIZ_BRIAN {

   public static String name = "ORTIZ_BRIAN";

   public static void printPrimeFactorization(int n) {
      System.out.print(n + " = ");

      for (int i = 2; i <= n; i++) {
         int count = 0;

         while (n % i == 0) {
            n /= i;
            count++;
         }

         if (count > 0) {
            System.out.print(i + "^" + count);

            if (n > 1) {
               System.out.print(" * ");
            }
         }
      }
   }





//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE!!!
//*********************************************************************

   public static void main(String [] args)  {

      sopln("\n" + name);
      sopln("A1_P6_Prime_Factoriation.\n");

      printPrimeFactorization(720);
      sopln("\n");

      for (int n = 2; n <= 20; n++) {
         printPrimeFactorization(n);
         sopln();
      }

      sopln();

      for (int n = 1000; n <= 1020; n++) {
         printPrimeFactorization(n);
         sopln();
      }

   } // end main






   public static void sop(int a)
   {
      System.out.print(a);
   }

   public static void sopln(int a)
   {
      System.out.println(a);
   }

   public static void sop(boolean a)
   {
      System.out.print(a);
   }

   public static void sopln(boolean a)
   {
      System.out.println(a);
   }


   public static void sop(double a)
   {
      System.out.print(a);
   }

   public static void sopln(double a)
   {
      System.out.println(a);
   }

   public static void sop(byte a)
   {
      System.out.print(a);
   }

   public static void sopln(byte a)
   {
      System.out.println(a);
   }

   public static void sop(String s)
   {
      System.out.print(s);
   }
   public static void sopln(String s)
   {
      System.out.println(s);
   }
   public static void sopln()
   {
      System.out.println();
   }


} // end class