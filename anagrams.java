import java.util.*;
public class Anagram
{
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
String s,s1;
System.out.println("Enter the string");
s=sc.next();
String str=s.toUpperCase();
System.out.println("Enter the string");
s1=sc.next();

String str1=s1.toUpperCase();

char ch[]=str.toCharArray();
char ch1[]=str1.toCharArray();

Arrays.sort(ch);
Arrays.sort(ch1);

String string=String.valueOf(ch);
String string2=String.valueOf(ch1);

if(string.equals(string2))
{
   System.out.println("Anagrams");
}
else
{
System.out.println("Not Anagrams");
}