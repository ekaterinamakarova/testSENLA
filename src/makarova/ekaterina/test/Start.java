package makarova.ekaterina.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Start {

    public static void main(String[] args){

        System.out.println("Input N");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(n);
        int sum=0;
        for(int i=2; i<=n; i+=2)
        {
            System.out.print(i+" ");
            sum+=i;
        }
        if(sum==0)
        {
            System.out.println("There is no even numbers");
        }
        else
        {
            System.out.println("= "+sum);
        }

    }
    public static void Task1() {
        System.out.println("Input the sentence");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(sentence);
        StringTokenizer stringTokenizer = new StringTokenizer(sentence,", ");
        System.out.println( stringTokenizer.countTokens());
        String[] words = new String[stringTokenizer.countTokens()];
        for(int i=0; i<words.length;i++ )
        {
            words[i] = stringTokenizer.nextToken().toLowerCase();
        }
        Arrays.sort(words);
        for(int i=0; i<words.length;i++ )
        {
            System.out.println(words[i]);
        }
    }
}