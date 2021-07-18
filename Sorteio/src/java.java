//Mini projeto para sortear números aleatórios.
//Feito por Guilherme Alves Ferreira.
import java.util.Random;

public class java
{

    public static void main(String[] args)
    {
        System.out.println("");//Somente para descer uma linhas.
        System.out.println("SORTEIO INSTAGRAM!");//Impressão de texto do sorteio do instagram.
        System.out.print("Números sorteados:\n");//Impressão com quebra de linha.
        for(int i = 0; i < 2; i++)//Usando for para imprimir 2 ganhadores com numeros de 0 à 35.
        {
            //Gerando os números aleatórios com a função random.
            Random numega = new Random();
            int valor = numega.nextInt(35) + 1;//aqui é definido o parâmetro e a quantidade de números a serem sorteados.
            System.out.print(valor + "\n");
        }
        System.out.print("\n");
    }
}