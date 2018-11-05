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

    public static void task1() {
        System.out.println("Input the sentence");
        String sentence = sc.nextLine();
        System.out.println("Inital sentence: " + sentence);
        StringTokenizer stringTokenizer = new StringTokenizer(sentence,", ");
        System.out.println("Number of words: " + stringTokenizer.countTokens());
        String[] words = new String[stringTokenizer.countTokens()];
        for(int i=0; i<words.length;i++ )
        {
            words[i] = stringTokenizer.nextToken().toLowerCase();
        }
        Arrays.sort(words);
        System.out.println("Sorted sentence: ");
        for(int i=0; i<words.length;i++ )
        {
            System.out.print(words[i]+ " ");
        }
    }
    public static void task2(){
        System.out.println("Input N");
        int n= sc.nextInt();
        System.out.println("All the even numbers and their sum in sequence from 0 till " + n + " is");
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
    public static void task3()
    {

        String[] charNumbers=new String[3];
        for(int i=0; i<3; i++){
            System.out.println("Input number " +(i+1));
            charNumbers[i]= sc.next();
        }
        System.out.println("The result is:");
        for(int i=0; i<charNumbers.length; i++)
        {
            String[] result =new String[3];
            result[0]=charNumbers[i];
            for(int j=1; j<result.length;j++)
            {
                result[j]=charNumbers[0];
            }
            interation(result,1,charNumbers);
        }


    }
    public static void interation(String[] ch, int stage,String[] charNumbers)
    {

        for(int i=0; i<charNumbers.length;i++)
        {
            ch[stage] = charNumbers[i];
            if(stage<ch.length-1)
            {
                interation(ch, stage+1, charNumbers);
            }
            else
            {
                System.out.println(String.join(" ",ch));
            }
        }
    }
}
