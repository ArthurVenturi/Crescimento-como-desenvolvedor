#include <stdio.h>
#include <stdlib.h>
#include "fila.h"

TFila *criar() {

	TFila *fila;

	// alocação dinâmica da fila
	fila = (TFila *) malloc(sizeof(TFila));

	// NULL, pois a fila não tem nós
	fila->inicio = NULL;
	fila->fim = NULL;

	// número de elementos da pilha
	fila->n = 0;

	// retornando a fila
	return fila;
}

void liberar(TFila *fila) {

	int i;

	// atual = endereço do nó que está no inicio
	TNo *atual = fila->inicio;
	// aux = endereço do próximo nó
	TNo *aux;

	// percorre a fila (n vezes)
	for (i=0; i<fila->n; i++) {

		// antes de liberar o nó atual, guarda o endereço do próximo em aux
		aux = atual->proximo;
		// libera a memória do nó atual
		free(atual);
		// atualiza o atual para a próxima iteração
		atual = aux;
	}

    // liberando a memória alocada
    free(fila);
}

// insere um elemento no fim da fila
void enfileira(TFila *fila, int elemento) {

	// cria um novo nó
	TNo *novo = (TNo *) malloc(sizeof(TNo));

	// insere o elemento no novo
	novo->elemento = elemento;

	// o novo aponta para NULL
	novo->proximo = NULL;

	// se a fila está vazia
	if (fila->fim == 0) {
		// atualiza o inicio da fila
		fila->inicio = novo;

		// atualiza o fim da fila
		fila->fim = novo;
	}
	else {
		// o nó que está no fim da fila deve apontar para o novo
		TNo *fim = fila->fim;
		fim->proximo = novo;

		// atualiza o fim da fila
		fila->fim = novo;
	}

	// atualiza o número de elementos da fila
	fila->n++;
}

// retira um elemento do inicio da fila
int desenfileira(TFila *fila) {

	int elemento;

	// se a fila está vazia
	if (fila->n == 0) {
		printf("fila vazia\n");
		return 0;
	}

	// atual = endereço do nó que está no início
	TNo *atual = fila->inicio;

	// pega o elemento
	elemento = atual->elemento;

	// remove o nó do início
	fila->inicio = atual->proximo;
	free(atual);

	// atualiza o número de elementos da fila
	fila->n--;

	// retorna o elemento
	return elemento;
}

