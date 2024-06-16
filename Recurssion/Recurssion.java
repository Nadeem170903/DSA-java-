class Recurssion{
  // print Number of N
    public  void printNumber(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }



    // print sum of n natural number
    public void printSum(int i , int n, int sum){
        if ( i > n ){
            System.out.println("sum of n number"+" "+sum);
            return;
        }

        sum +=i;
        printSum(i+1, n , sum);
    };



   // first method to calculat factorail of n number
    public void factorial( int n, int fact){
        if(n == 0){
            System.err.println("factorial of n number"+" "+fact);
            return;
        }
        fact *= n;
        factorial(n-1,fact);
    }

    // second method to calculating factorial of n 
    public int calFac (int n){
        if(n ==1 || n ==0){
            return 1;
        }
        int facNm1 = calFac(n-1);
        int facn = n*facNm1;
        return facn;
    }

    // fabaonaci sereis 

    public void fabonaciS(int a , int b, int n){
        if(n < 0){
            return ;
        }
   
        int c = a +b;
        System.out.println(c);
        fabonaciS(b, c, n-1);
    }

    // print power of x 
    public int calcPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x ==0){
            return 0;
        }

        int xPownm1 = calcPower(x, n-1);
        int xPow = x * xPownm1;
        return xPow;
    }


    public static void main(String args[]){

        Recurssion obj = new Recurssion();
        int a = 0;
        int b = 1;
        int n = 10;
    
        // print number
        System.out.println("print Number");
       obj.printNumber(5);

       // print sum
       System.out.println("print sum of n Number");
       obj.printSum(1,5,0);

       // factorial of n number
       System.out.println("factorial of n number");
       obj.factorial(5, 1);


       // method two to print factorial of n number 
       System.out.println("factorial of n number using second method");
       int ans = obj.calFac(5);
       System.out.println(ans);

       System.out.println("print fabonaci series");
       System.out.println(a);
       System.out.println(b);
       obj.fabonaciS(a, b, n-2);

       // print power of x 
       System.out.println("power of x");
        int xpower = obj.calcPower(3, 2);
        System.out.println(xpower);
    }
}