import java.util.Scanner;
public class exe2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int a = 0, b = 1,aux,controle=0;
        num = sc.nextInt();
        while(b <= num)
        {   
            aux = b;
            b = a + b;
            a = aux;
            if(b==num)
            {
                System.out.println("Número está na sequência");
                controle=1;
            }
        }
        if(controle==0)
        {
            System.out.println("Número não está na sequência");
        }
        sc.close();
    }   
}
