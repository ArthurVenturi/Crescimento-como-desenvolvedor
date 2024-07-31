#include <stdio.h>
#define N 10

int main(){

    int vetor[N];
    int i, etapa, troca, aux;

    for (i = 0; i < N ;i++){

        scanf("%d",&vetor[i]);
    }

    troca = 1;
     while(troca == 1){
        troca = 0;

        for(i = 0; i < N -1; i++){
            if (vetor[i] > vetor[i+1]){
                aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;
                troca = 1;
            }
        }
        if(troca == 0){
            break;
        }
    }


    /*for(etapa = 0; etapa < N; etapa++){
        troca = 0;

        for(i = 0; i < N -1; i++){
            if (vetor[i] > vetor[i+1]){
                aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;
                troca = 1;
            }
        }
        if(troca == 0){
                break;
            }

    }*/

    for (i = 0; i < N ;i++){

        printf("%d", vetor[i]);
    }



return 0;
}
