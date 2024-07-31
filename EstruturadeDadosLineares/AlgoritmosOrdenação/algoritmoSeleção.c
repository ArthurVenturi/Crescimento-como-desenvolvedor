#include <stdio.h>
#define N 10

int main(){

    int vetor[N];
    int i, etapa, aux, pos_atual, pos_menor, menor;

    for (i = 0; i < N ;i++){

        scanf("%d",&vetor[i]);
    }

    for(pos_atual = 0; pos_atual < N-1; pos_atual++){

        menor = pos_atual;

        //Acha o menor e a posição atual do menor valor
        for(i = pos_atual; i < N; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
                pos_menor = i;

            }
        }
        //Subtitui o valor menor pela posição atual do vetor.
        aux = vetor[pos_atual];
        vetor[pos_atual] = vetor[pos_menor];
        vetor[pos_menor] = aux;
    }


    for (i = 0; i < N ;i++){

        printf("%d", vetor[i]);
    }

    return 0;
}
