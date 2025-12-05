import java.io.*;
import java.util.*;

class prgm1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		int count=user.countoccur(s1,s2);
		System.out.println(count);
	}
}

class user{
	public static int countoccur(String s1,String s2){
		int count=0;
		
		int l1=s1.length();
		int l2=s2.length();
		
		if(l1==0 || l2==0){
			return 0;
		}

        int index = s1.indexOf(s2);  

        while (index != -1) {
            count++;

            index = s1.indexOf(s2, index + 1);
        }

        return count;
        
        
        // while(s1.contains(s2)){
        	// count++;
        	// int i=s1.indexOf(s2);
        	// s1=s1.substring(i+l2);
//         	
        // }
        // return count;
		
	}
}