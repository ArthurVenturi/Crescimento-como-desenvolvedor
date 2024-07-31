#include <stdio.h>
#define TAM 5


void preenche_vetor(int vetor[TAM]){

    int i;

    printf("Entre com os valores do vetor: \n");

    for(i = 0; i < TAM;i++){

        scanf("%d", &vetor[i]);
    }

}

void imprime_vetor(int vetor[TAM]){

    int i;

    for(i = 0; i<TAM;i++){

        printf("%d ", vetor[i]);
    }
}

void ordena_bolha(int vetor[TAM]){

    int i, j, aux;

    for(i = 0; i < TAM; i ++){
        for(j = 0; j < TAM -1; j++){

            if (vetor[j] > vetor[j+1]){
                aux = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j+1] = aux;
            }
        }
    }
}

void ordena_selecao(int vetor[TAM]){

    int i, j, menor, pos_menor, aux;

        menor = vetor[i];
        pos_menor = i;

    for(i = 0; i < TAM-1; i++){
         for(j = 0; j < TAM; j++){

            if(vetor[j] < menor){

            menor = vetor[j];
            pos_menor = j;
            }
         }

         aux = vetor[i];
         vetor[i] = vetor[pos_menor];
         vetor[pos_menor] = aux;
    }
}

void ordena_insercao(int vetor[TAM]){

    int i, j, x;

    for(i = 1; i < TAM-1; i++){

            x = vetor[i];
            j = i - 1;

            while((j >= 0) && (vetor[j] > x)){

            vetor[j + 1] = vetor[j];
            j--;

            }

            vetor[j+1]= x;
    }

}

void ordena_quickSort(int vetor[],int inicio,int  fim){

    int i, j, pivo, aux;

    i = inicio;
    j = fim;

    pivo = vetor[(inicio + fim ) /2];

    while(vetor[i] < pivo)i++;
    while(vetor[j] > pivo)j--;

    if(i <= j){

        aux= vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
        i++;
        j--;
    }
    if(inicio < j){
        ordena_quickSort(vetor, inicio, j);
    }
    if(i < fim){
         ordena_quickSort(vetor, i, fim);
    }
}

void imprime_menu(){

    printf(" \n 0 - SAIR \n");
    printf("\n 1 - bolha \n");
    printf("\n 2 - Selecao \n");
    printf("\n 3 - Insercao \n");
    printf("\n 4 - QuickSort \n");
    printf("Digite a opcao : ");
}

int main(){

    int vetor[TAM];
    int opcao = 0;

    preenche_vetor(vetor);

    imprime_menu();

    scanf("%d", &opcao);

    switch(opcao){

        case 0:
            break;

            case 1:
                ordena_bolha(vetor);
            break;

            case 2:
                ordena_selecao(vetor);
            break;

            case 3:
                ordena_insercao(vetor);
            break;

            default:
                ordena_quickSort(vetor, 0, TAM - 1);
            break;

        }

        imprime_vetor(vetor);

    return 0;
}
