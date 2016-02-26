package base;

public class MyInteger {
	private int iValue;
    //constructor
    MyInteger(int n){
        iValue = n;
    }
    public int getIValue(){
        return iValue;
    }
    public boolean isEven(){
        return iValue%2==0;
    }
    public boolean isOdd(){
        return !isEven();
    }
    public boolean isPrime(){
        for (int i = 2; i < iValue; i++) {
            if(iValue%i==0)return false;
        }
        return true;
    }
    public static boolean isEven(int n){
        return (n%2==0);
    }
    public static boolean isOdd(int n){
        return !isEven(n);
    }
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean isEven(MyInteger a){
        return isEven(a.getIValue());
    }
    public static boolean isOdd(MyInteger a){
        return isOdd(a.getIValue());
    }
    public static boolean isPrime(MyInteger a){
        return isPrime(a.getIValue());
    }
    public boolean equals(int n){
        return iValue==n;
    }
    public boolean equals(MyInteger a){
        return equals(a.getIValue());
    }
}

