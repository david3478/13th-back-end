package saja02;

import java.util.Scanner;

public class num10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        int v = sc.nextInt(); 
        sc.close();

        int count = 0; 
        
        for (int num : arr) { 
            if (num == v) { 
                count++; 
            }
        }

        System.out.println(count); 
    }
        
        

	}


