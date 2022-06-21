import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj długość ciągu Fibonacciego: ");
    int x = scan.nextInt();
    int tab[] = new int[x];
    for(int i=0; i<x; i++)
      {
        if (i==0) tab[i]=0;
        if (i==1) tab[i]=1;
        if(i>1) tab[i]=tab[i-1]+tab[i-2];
        System.out.print(tab[i]+" ");
      }
  }
}