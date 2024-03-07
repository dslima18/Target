import java.util.Scanner;
public class exe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        string = sc.nextLine();

        char[] vetor = string.toCharArray();
        char[] novo_vetor = string.toCharArray();
        int j = vetor.length - 1;
        for(int i = 0; i < vetor.length; i++)
        {
            novo_vetor[i] = vetor[j];
            j--;
        }

        System.out.println(novo_vetor);
    }
}
