//
//public class A1_P3_Permutation_ORTIZ_BRIAN {
//
//   public static String name = "ORTIZ_BRIAN";
//
//
//   public static boolean isPermutation(int n, int[] A) {
//
//      for (int i = 1; i <= n - 1; i++) {
//         boolean swapped = false;
//         for (int j = 1; j <= n - i; j++) {
//            if (A[j] > A[j + 1]) {
//               int temp = A[j];
//               A[j] = A[j + 1];
//               A[j + 1] = temp;
//               swapped = true;
//            }
//         }
//         if (!swapped) {
//            break;
//         }
//      }
//      for (int k = 1; k <= n - 1; k++) {
//         int curVal = A[k];
//         int nextVal = A[k + 1];
//
//         if (nextVal != curVal + 1) {
//            return false;
//         }
//      }
//
//      return true;
//   }
//
//
//
//
//
////********************************************************************
//// DO NOT CHANGE ANYTHING BELOW THIS LINE!!!
////*********************************************************************
//
//
//	public static void main(String[] args)   {
//
//      System.out.println("\n" + name);
//      System.out.println("A1_P3_Permutation_SOLN.");
//      System.out.println("Determine if an array has a permutation of {1, 2, ..., n}.");
//
//      int [] answer;
//
//
//      for (int j = 0; j < data.length; j++) {
//
//         int [] A = data[j];
//         int n = A.length-1;
//
//         sopln("\n===============");
//         System.out.print("Test " + (j+1) + ".  Array:  ");
//         printArray1(n, A);
//         sopln();
//
//         boolean ans = isPermutation(n, A);
//
//         if (ans)
//            sopln("This IS a PERMUTATION.");
//         else
//            sopln("This is NOT a permutation.");
//      }
//   }
//
//
////******************************************************
//
//   public static final int NA = Integer.MIN_VALUE;
//
//   public static int [][] data =
//   {
//
//       {NA, 2, 1},
//
//       {NA, 2, 2},
//
//       {NA, 3, 1, 4, 3},
//
//       {NA, 4, 2, 5, 3, 1},
//
//       {NA, 2, 1, -90, 6, 5, 3},
//
//       {NA, 7, 3, 2, 6, 1, 5, 4},
//
//       {NA, 7, 3, 2, 6, 1, 0, 4},
//
//       {NA, 7, 999, 2, 6, 1, 5, 4},
//
//       {NA, 7, -5, 2, 6, 1, 5, 4},
//
//       {NA, 7, 3, 2, 6, 1, 5, 4},
//
//       {NA, 6, 2, 1, 7, 4, 8, 5, 3},
//
//       {NA, 5, 3, 9, 10, 8, 4, 7, 2, 1, 6},
//
//       {NA, 14, 9, 12, 11, 5, 8, 2, 4, 6, 15, 7, 9, 10, 13, 1},
//
//       {NA, 4, 10, 8, 13, 2, 18, 15, 12, 1, 20, 14, 11, 6, 9, 13, 17, 16, 19, 7, 5},
//
//       {NA, 4, 5, 18, 22, 17, 9, 24, 21, 8, 1, 11, 13, -3, 16, 7, 14, 15, 12, 20, 2, 10, 19, 6, 23, 25},
//
//       {NA, 4, 3, 2, 14, 11, 23, 18, 24, 17, 25, 22, 15, 8, 12, 21, 19, 5, 9, 16, 27, 20, 30, 28, 10, 7, 26, 1, 13, 6, 29},
//
//       {NA, 26, 32, 47, 21, 2, 37, 20, 34, 7, 16, 33, 50, 22, 19, 27, 17, 30, 38, 1, 18, 43, 28, 14, 4, 31, 15, 29, 49, 35, 3, 10, 11, 40, 9, 39, -55, 13, 5, 8, 44, 36, 46, 23, 42, 6, 48, 24, 45, 12, 25},
//
//       {NA, 60, 44, 26, 47, 11, 10, 49, 42, 67, 69, 72, 22, 40, 9, 14, 50, 25, 70, 74, 37, 19, 27, 63, 59, 46, 57, 66, 62, 53, 39, 52, 20, 68, 65, 45, 24, 35, 73, 41, 30, 43, 48, 61, 7, 64, 31, 6, 3, 17, 29, 38, 34, 55, 42, 32, 54, 16, 4, 23, 13, 28, 51, 75, 8, 56, 21, 15, 2, 18, 71, 1, 58, 33, 5, 36},
//
//       {NA, 63, 46, 12, 57, 21, 19, 58, 74, 32, 11, 51, 89, 61, 31, 98, 7, 37, 35, 85, 10, 100, 9, 73, 71, 17, 2, 50, 18, 3, 86, 92, 52, 47, 38, 45, 26, 70, 44, 88, 81, 49, 39, 80, 67, 33, 6, 65, 40, 4, 82, 69, 60, 8, 78, 24, 15, 36, 25, 93, 28, 64, 23, 91, 54, 53, 59, 62, 90, 94, 20, 95, 56, 30, 13, 84, 16, 1, 79, 97, 22, 77, 34, 27, 99, 87, 48, 14, 72, 5, 66, 75, 76, 43, 68, 42, 83, 41, 29, 55, 96},
//
//
//   };
//
//
//   public static void printArray1(int n, int [] A)  {
//
//      sop("[");
//      for (int j = 1; j < n; j++)
//         System.out.print(A[j] + ", ");
//      sop(A[n] + "]\n");
//   }
//
//   public static void sop(int a)
//   {
//      System.out.print(a);
//   }
//
//   public static void sopln(int a)
//   {
//      System.out.println(a);
//   }
//
//   public static void sop(boolean a)
//   {
//      System.out.print(a);
//   }
//
//   public static void sopln(boolean a)
//   {
//      System.out.println(a);
//   }
//
//
//   public static void sop(double a)
//   {
//      System.out.print(a);
//   }
//
//   public static void sopln(double a)
//   {
//      System.out.println(a);
//   }
//
//   public static void sop(byte a)
//   {
//      System.out.print(a);
//   }
//
//   public static void sopln(byte a)
//   {
//      System.out.println(a);
//   }
//
//   public static void sop(String s)
//   {
//      System.out.print(s);
//   }
//   public static void sopln(String s)
//   {
//      System.out.println(s);
//   }
//   public static void sopln()
//   {
//      System.out.println();
//   }
//
//
//} // end class
//
//
