#include <stdio.h>
#define N 5

int main(){

    int vetor[N];
    int i, j, elemento_atual;

    for (i = 0; i < N ;i++){

        scanf("%d",&vetor[i]);
    }

    for (i = 1; i < N; i++){
        elemento_atual = vetor[i];

        j = i -1;

        //Abre espaço no vetor enquanto localiza a posiçõa correta
        while(j >= 0 && (elemento_atual < vetor[j])){
            vetor[j + 1] = vetor[j];
            j = j - 1;
        }

        //j+1 é a posição correta
        vetor[j + 1] = elemento_atual;

    }

    for (i = 0; i < N ;i++){

        printf("%d", vetor[i]);
    }

    return 0;
}
