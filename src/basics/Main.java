package basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        predec(n);
        preascend(n);

    }
    public static void predec(int n){
        if(n==0)
            return;
        System.out.println(n);
        predec(n-1);
    }
    public static void preascend(int n){
        if(n==0)
            return;
        preascend(n-1);
        System.out.println(n);

    }

}
