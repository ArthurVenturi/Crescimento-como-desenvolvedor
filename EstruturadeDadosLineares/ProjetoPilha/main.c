#include<stdio.h>
#include"pilha.h"

int main(){

    int elemento;
    TPilha *pilha;

    pilha = criar();

    push(pilha, 1);
    push(pilha, 2);
    push(pilha, 3);

    elemento = pop(pilha);
    printf("Elemento removido %d \n", elemento);

    push(pilha, 4);
    push(pilha, 5);

    elemento = pop(pilha);
    printf("Elemento removido %d \n", elemento);

    return 0;
}
