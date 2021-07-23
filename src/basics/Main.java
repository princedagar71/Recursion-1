package basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        predec(n);

    }
    public static void predec(int n){
        if(n==0)
            return;
        System.out.println(n);
        predec(n-1);
    }
}
