package makarova.ekaterina.part1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Start {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        task1();
        task2();
        task3();

    }
    public static void task2(){
        System.out.println("Input N");
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
    public static void task1() {
        System.out.println("Input the sentence");
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
    public static void task3()
    {
        System.out.println("Input numbers");
        int[] numbers= new int[3];
        for(int i=0; i<3; i++){
            numbers[i]= sc.nextInt();
        }


    }
}
