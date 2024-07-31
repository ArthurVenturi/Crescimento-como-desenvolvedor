#include <stdio.h>
#include <stdlib.h>
#include "fila.h"

int main() {

	TFila *fila;
	int i, elemento;

    // criando a fila
    fila = criar();

    enfileira(fila, 1); // início
    enfileira(fila, 2);
    enfileira(fila, 3);
    enfileira(fila, 4);
    enfileira(fila, 5); // fim

	for (i=0; i<5; i++) {
		elemento = desenfileira(fila);
    	printf("Removeu: %d\n", elemento);
    }

    elemento = desenfileira(fila);

    return 0;
}
