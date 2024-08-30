import java.util.Arrays;

import javax.annotation.processing.SupportedOptions;
import javax.swing.text.html.FormSubmitEvent;

public class App {
    public static void main(String[] args) throws Exception {
        //declarando um Array unidimencional
       int[] meu_array = new int[5];
       //inicializando os valores por acesso rápido
       meu_array[0]=10;
       meu_array[1]=20;
       meu_array[2]=30;
       meu_array[3]=40;
       meu_array[4]=50;

        //nomeando as posições dos elementos
        int element0= meu_array[0];
        int element1 = meu_array[1];
        
        //maneira tradicional de mostrar os elementos
        System.out.println(element0);
        System.out.println(element1);

        //maneira direta de mostrar os elementos através do for
        for(int i =0; i <meu_array.length; i++){
            System.out.println("Posição" + i + ": " + meu_array[i]);
        }


        //Array (vetor) do tipo texto/string
        String[] lista_aluno = new String[5];

        //atribuindo valor
        //permite que seja amplianda ou diminuida a quantidade de elementos
        System.out.println("----------------------------");
        lista_aluno[0]="João";
        lista_aluno[1]="Vanessa";
        lista_aluno[2]="Deivs";
        lista_aluno[3]="Yasmin";
        lista_aluno[4]="Artur";

        //exibindo as posições e elementos da lista_aluno
        System.out.println("----------------------------");
        for (int i=0; i <lista_aluno.length; i++){
            System.out.println("Posição " + i + ": " + lista_aluno[i] );
        }

        //maneira direta de declarar os elementos em um vetor
        //não é possível modificar a quantidade, somente adicionar ou remover elementos está é a diferença entre as duas formar de declaração
        String[] lista_cidades = {"Poá", "Itaim Paulista", "Suzano", "Itu"};

        //converter a estrutura Array em texto
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(lista_cidades));

        //Verificando o tamanho da array
        System.out.println("----------------------------");
        System.out.println("O tamanho é: " + lista_aluno.length);
        System.out.println("O tamanho é: " + lista_cidades.length);

        //copiando um vetor
        int [] copia = array.clone();
        String[] copia_cidade = lista_cidades;

        System.out.println("----------------------------");
        System.out.println("Copia: " + Arrays.toString(copia));
        System.out.println("Copia: " + Arrays.toString(copia_cidade));

        //recortando e copiando uma array
        String[] copia_sel = Arrays.copyOf(lista_cidades, 2);

        System.out.println("----------------------------");
        System.out.println("Recorte: " + Arrays.toString(copia_sel));

        //organizando elementos

        int[] nova_array ={5,6,4,2,3,1,0};
        Arrays.sort(nova_array);

        System.out.println("Ordenada em: " + Arrays.toString(nova_array));

        //inserindo um valor igual em todas as posições
        int [] array_vazia = new int[5];
        System.out.println("----------------------------");
        System.out.println("Ordenada em: " + Arrays.toString(array_vazia));;

        Arrays.fill(array_vazia, 10);
        System.out.println("Ordenada em: " + Arrays.toString(array_vazia));

        //funções equals para comparar arrays
        boolean resp= Arrays.equals(copia_cidade, lista_cidades);
        System.out.println("São iguas: " +resp);

        //testando com if
        if(Arrays.equals(lista_cidades, copia_cidade)){
            System.out.println("Elas são iguais");
        }else{
            System.out.println("Elas são diferentes");
        }

        //função binarysearch para pesquisar os elementos no vetor
        int posicao = Arrays.binarySearch(lista_cidades, "Suzano");
        System.out.println("----------------------------");
        System.out.println("Foi localizado na posição: " + posicao);
    }
}
