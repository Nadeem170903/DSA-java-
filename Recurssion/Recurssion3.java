public class Recurssion3{
     // print permutation of String;

     public void permu(String str, String permutation){

        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }


        for(int i = 0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permu(newStr, permutation+currChar);
        }
     }

     public int countPath(int row, int col, int n, int m){
        // base condition;

        if(n == row || m == col){
            return 0;
        }
        if(row == n-1 || col == m-1){
            return 1;
        }
        // move downwords;
        int downPath = countPath(row+1, col, n, m);

        // move right;
        int rightPath = countPath(row, col+1, n, m);
        return downPath + rightPath;
     }

      // total way to place tiles;
     public int placeTiles(int m, int n){
        if(n ==m){
            return 2;
        }
        if(m<n){
            return 1;
        }

        int hPlacements = placeTiles(m-n, n);
        int vPlacements = placeTiles(m-1 , n);
        return vPlacements + hPlacements;
     }

  



    public static void main(String args[]){
        Recurssion3 obj = new Recurssion3();
        // print permutation; 
         System.out.println("print permutation");
         obj.permu("abc", "");

         // print total path;
         int tPath = obj.countPath(0,0 , 3, 3);
         System.out.println("print total path");
         System.out.println(tPath);


         // print total way to placments of tiles;

         int result = obj.placeTiles(4,2);
         System.out.println("total way to placement of titles");
         System.out.println(result);

       
    }
}