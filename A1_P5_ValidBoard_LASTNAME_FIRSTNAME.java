public class A1_P5_ValidBoard_LASTNAME_FIRSTNAME {

   public static String name = "LASTNAME_FIRSTNAME";

    public static String validBoard(int n, int [][] grid)   {
        int diagonalRow1 = -1;
        int diagonalRow2 = -1;

        for (int i = 1; i <= n; i++) {
            int rowCount = 0;
            for (int j = 1; j <= n; j++) {
                if (grid[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount == 0) {
                return "Row " + i + " has no 1's.";
            } else if (rowCount >= 2) {
                return "Row " + i + " has two or more 1's.";
            }
        }

        for (int j = 1; j <= n; j++) {
            int colCount = 0;
            for (int i = 1; i <= n; i++) {
                if (grid[i][j] == 1) {
                    colCount++;
                }
            }
            if (colCount == 0) {
                return "Column " + j + " has no 1's.";
            } else if (colCount >= 2) {
                return "Column " + j + " has two or more 1's.";
            }
        }

        boolean ascendingDiagonalIssue = false;
        boolean descendingDiagonalIssue = false;

        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-1; j++) {
                if (grid[i][j] == 1) {
                    // Check ascending diagonal
                    if (i < n && j < n && grid[i + 1][j + 1] == 1) {
                        ascendingDiagonalIssue = true;
                        diagonalRow1 = i;
                        diagonalRow2 = i + 1;
                    }
                    // Check descending diagonal
                    if (i < n && j > 1 && grid[i + 1][j - 1] == 1) {
                        descendingDiagonalIssue = true;
                        diagonalRow1 = i;
                        diagonalRow2 = i + 1;
                    }
                }
            }
        }

        if (ascendingDiagonalIssue && descendingDiagonalIssue) {
            return "Both diagonal issues found.";
        } else if (ascendingDiagonalIssue) {
            return "Ascending diagonal issue found.";
        } else if (descendingDiagonalIssue) {
            return "Descending diagonal issue found.";
        }



        // If no issues are found
        return "VALID BOARD.";
    }










//********************************************************************
// DO NOT CHANGE ANYTHING BELOW THIS LINE!!!
//*********************************************************************


   public static void main(String [] args)
   {
      int i, j, k;
      sopln();
      sopln(name);
      sopln("A1_P5_ValidBoard\n");
      sopln("Determine if 2D array has exactly one 1 in every row");
      sopln("and columns and that no diagonal has more than two 1's");
      sopln("======================================================");

      for (i = 0; i < data.length; i++) {

         sop("\nTest " + (i+1) + ":  ");
         String result = validBoard(data[i].length-1, data[i]);
         sopln(result);

      }
      sopln();
   }



//******************************************************

   public static final int NA = Integer.MIN_VALUE;

   public static int  [][][]  data =
   {

 //test 1
      {
         {},
//            1 2 3 4 5 6 7
/* 1 */  {NA, 0,0,0,0,0,1,0},
/* 2 */  {NA, 0,0,0,1,0,0,0},
/* 3 */  {NA, 0,0,0,0,0,0,1},
/* 4 */  {NA, 1,0,0,0,0,0,0},
/* 5 */  {NA, 0,0,1,0,0,0,0},
/* 6 */  {NA, 0,0,0,0,1,0,0},
/* 7 */  {NA, 0,1,0,0,0,0,0}
      },


// test 2
      {
         {},
 //           1 2 3 4 5 6 7
/* 1 */  {NA, 0,0,0,0,0,1,0},
/* 2 */  {NA, 0,0,0,1,0,0,0},
/* 3 */  {NA, 0,0,0,0,0,0,1},
/* 4 */  {NA, 1,0,0,0,0,0,0},
/* 5 */  {NA, 0,0,1,0,0,0,0},
/* 6 */  {NA, 0,0,0,0,1,0,1},
/* 7 */  {NA, 0,1,0,0,0,0,0}
      },


 //test 3
      {
         {},
//            1 2 3 4 5 6 7
/* 1 */  {NA, 0,0,0,0,0,1,0},
/* 2 */  {NA, 0,0,0,1,0,0,0},
/* 3 */  {NA, 0,0,0,0,0,0,1},
/* 4 */  {NA, 1,0,0,0,0,0,0},
/* 5 */  {NA, 0,0,0,0,0,0,0},
/* 6 */  {NA, 0,0,0,0,1,0,0},
/* 7 */  {NA, 0,1,0,0,0,0,0}
      },


// test 4
      {
         {},
 //           1 2 3 4 5 6 7
/* 1 */  {NA, 0,1,0,0,0,0,0},
/* 2 */  {NA, 0,0,0,1,0,0,0},
/* 3 */  {NA, 0,0,0,0,0,0,1},
/* 4 */  {NA, 1,0,0,0,0,0,0},
/* 5 */  {NA, 0,0,1,0,0,0,0},
/* 6 */  {NA, 0,0,0,0,1,0,0},
/* 7 */  {NA, 0,1,0,0,0,0,0}
      },



// test 5
      {
         {},
 //           1 2 3 4 5 6 7 8
/* 1 */  {NA, 0,0,0,0,0,0,1,0},
/* 2 */  {NA, 1,0,0,0,0,0,0,0},
/* 3 */  {NA, 0,0,0,1,0,0,0,0},
/* 4 */  {NA, 0,0,0,0,0,1,0,0},
/* 5 */  {NA, 0,0,0,0,0,0,0,1},
/* 6 */  {NA, 0,0,1,0,0,0,0,0},
/* 7 */  {NA, 0,0,0,0,1,0,0,0},
/* 8 */  {NA, 0,1,0,0,0,0,0,0}
      },



// test 6
      {
         {},
 //           1 2 3 4 5 6 7 8
/* 1 */  {NA, 0,0,0,0,1,0,0,0},
/* 2 */  {NA, 1,0,0,0,0,0,0,0},
/* 3 */  {NA, 0,0,0,1,0,0,0,0},
/* 4 */  {NA, 0,0,0,0,0,0,1,0},
/* 5 */  {NA, 0,0,1,0,0,0,0,0},
/* 6 */  {NA, 0,0,0,0,0,1,0,0},
/* 7 */  {NA, 0,0,0,0,0,0,0,1},
/* 8 */  {NA, 0,1,0,0,0,0,0,0}
      },



 //test 7
      {
         {},
 //           1 2 3 4 5 6 7 8 9 10
/* 1 */  {NA, 0,0,0,0,1,0,0,0,0,0},
/* 2 */  {NA, 0,0,0,0,0,0,1,0,0,0},
/* 3 */  {NA, 0,0,0,0,0,0,0,0,0,1},
/* 4 */  {NA, 0,0,0,0,0,1,0,0,0,0},
/* 5 */  {NA, 0,0,1,0,0,0,0,0,0,0},
/* 6 */  {NA, 1,0,0,0,0,0,0,0,0,0},
/* 7 */  {NA, 0,0,0,0,0,0,0,1,0,0},
/* 8 */  {NA, 0,0,0,1,0,0,0,0,0,0},
/* 9 */  {NA, 0,1,0,0,0,0,1,0,0,0},
/* 10 */ {NA, 0,0,0,0,0,0,0,0,1,0}
      },



// test 8
      {
         {},
 //           1 2 3 4 5 6 7 8 9 10
/* 1 */  {NA, 0,0,0,0,1,0,0,0,0,0},
/* 2 */  {NA, 0,0,0,0,0,0,1,0,0,0},
/* 3 */  {NA, 0,0,0,0,0,0,0,0,0,1},
/* 4 */  {NA, 0,0,0,0,0,1,0,0,0,0},
/* 5 */  {NA, 0,0,1,0,0,0,0,0,0,0},
/* 6 */  {NA, 1,0,0,0,0,0,0,0,0,0},
/* 7 */  {NA, 0,0,0,0,0,0,0,1,0,0},
/* 8 */  {NA, 0,0,0,1,0,0,0,0,0,0},
/* 9 */  {NA, 0,1,0,0,0,0,0,0,0,0},
/* 10 */ {NA, 0,0,0,0,0,0,0,0,1,0}
      },



// test 9
      {
         {},
//            1 2 3 4 5 6 7 8 9 10
/* 1 */  {NA, 0,0,1,0,0,0,0,0,0,0},
/* 2 */  {NA, 0,0,0,0,0,0,1,0,0,0},
/* 3 */  {NA, 0,0,0,1,0,0,0,0,0,0},
/* 4 */  {NA, 0,1,0,0,0,0,0,0,0,0},
/* 5 */  {NA, 0,0,0,0,0,0,0,1,0,0},
/* 6 */  {NA, 0,0,0,0,0,0,0,0,0,1},
/* 7 */  {NA, 0,0,0,0,1,0,0,0,0,0},
/* 8 */  {NA, 0,0,0,0,0,0,0,0,1,0},
/* 9 */  {NA, 0,0,0,0,0,1,0,0,0,0},
/* 10 */ {NA, 1,0,0,0,0,0,0,0,0,0}
      },



 //test 10
      {
         {},
 //           1 2 3 4 5 6 7 8 9 10
/* 1 */  {NA, 0,0,0,0,1,0,0,0,0,0},
/* 2 */  {NA, 0,0,0,0,0,0,1,0,0,0},
/* 3 */  {NA, 0,0,0,0,0,0,0,0,0,1},
/* 4 */  {NA, 0,0,0,0,0,1,0,0,0,0},
/* 5 */  {NA, 0,0,0,0,0,0,0,0,0,0},
/* 6 */  {NA, 1,0,0,0,0,0,0,0,0,0},
/* 7 */  {NA, 0,0,0,0,0,0,0,1,0,0},
/* 8 */  {NA, 0,0,0,1,0,0,0,0,0,0},
/* 9 */  {NA, 0,1,0,0,0,0,0,0,0,0},
/* 10 */ {NA, 0,0,0,0,0,0,0,0,1,0}
      },



// test 11
      {
         {},
 //           1 2 3 4 5 6 7 8 9 10
/* 1 */  {NA, 0,0,0,0,0,0,1,0,0,0},
/* 2 */  {NA, 0,0,1,0,0,0,0,0,0,0},
/* 3 */  {NA, 0,0,0,0,0,1,0,0,0,0},
/* 4 */  {NA, 0,0,0,0,0,0,0,0,1,0},
/* 5 */  {NA, 0,0,0,0,1,0,0,0,0,0},
/* 6 */  {NA, 1,0,0,0,0,0,0,0,0,0},
/* 7 */  {NA, 0,0,0,1,0,0,0,0,0,0},
/* 8 */  {NA, 0,0,0,0,0,0,0,0,0,1},
/* 9 */  {NA, 0,0,0,0,0,0,0,1,0,0},
/* 10 */ {NA, 0,1,0,0,0,0,0,0,0,0}
      },



 //test 12
      {
         {},
  //          1 2 3 4 5 6 7 8 9 10
/* 1 */  {NA, 0,0,0,0,1,0,0,0,0,0},
/* 2 */  {NA, 0,0,0,0,0,0,1,0,0,0},
/* 3 */  {NA, 0,0,0,0,0,0,0,0,0,1},
/* 4 */  {NA, 0,0,0,0,0,1,0,0,0,0},
/* 5 */  {NA, 0,0,1,0,0,0,0,0,0,0},
/* 6 */  {NA, 1,0,0,0,0,0,0,0,0,0},
/* 7 */  {NA, 0,0,0,0,0,0,0,1,0,0},
/* 8 */  {NA, 0,0,0,1,0,0,0,0,0,0},
/* 9 */  {NA, 0,1,0,0,0,0,0,0,0,0},
/* 10 */ {NA, 0,0,0,0,0,0,1,0,0,0}
      },



 //test 13
      {
         {},
 //           1 2 3 4 5 6 7 8 9 10
/* 1 */  {NA, 0,0,0,1,0,0,0,0,0,0},
/* 2 */  {NA, 0,0,0,0,0,0,1,0,0,0},
/* 3 */  {NA, 0,0,0,0,0,0,0,0,0,1},
/* 4 */  {NA, 0,0,0,0,0,1,0,0,0,0},
/* 5 */  {NA, 0,0,1,0,0,0,0,0,0,0},
/* 6 */  {NA, 0,0,0,0,1,0,0,0,0,0},
/* 7 */  {NA, 0,0,0,0,0,0,0,1,0,0},
/* 8 */  {NA, 1,0,0,0,0,0,0,0,0,0},
/* 9 */  {NA, 0,0,0,0,0,0,0,0,1,0},
/* 10 */ {NA, 0,1,0,0,0,0,0,0,0,0}
      }

   };   //end data



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




