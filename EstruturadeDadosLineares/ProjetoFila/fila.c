#include <stdio.h>
#include <stdlib.h>
#include "fila.h"

TFila *criar() {

	TFila *fila;

	// aloca��o din�mica da fila
	fila = (TFila *) malloc(sizeof(TFila));

	// NULL, pois a fila n�o tem n�s
	fila->inicio = NULL;
	fila->fim = NULL;

	// n�mero de elementos da pilha
	fila->n = 0;

	// retornando a fila
	return fila;
}

void liberar(TFila *fila) {

	int i;

	// atual = endere�o do n� que est� no inicio
	TNo *atual = fila->inicio;
	// aux = endere�o do pr�ximo n�
	TNo *aux;

	// percorre a fila (n vezes)
	for (i=0; i<fila->n; i++) {

		// antes de liberar o n� atual, guarda o endere�o do pr�ximo em aux
		aux = atual->proximo;
		// libera a mem�ria do n� atual
		free(atual);
		// atualiza o atual para a pr�xima itera��o
		atual = aux;
	}

    // liberando a mem�ria alocada
    free(fila);
}

// insere um elemento no fim da fila
void enfileira(TFila *fila, int elemento) {

	// cria um novo n�
	TNo *novo = (TNo *) malloc(sizeof(TNo));

	// insere o elemento no novo
	novo->elemento = elemento;

	// o novo aponta para NULL
	novo->proximo = NULL;

	// se a fila est� vazia
	if (fila->fim == 0) {
		// atualiza o inicio da fila
		fila->inicio = novo;

		// atualiza o fim da fila
		fila->fim = novo;
	}
	else {
		// o n� que est� no fim da fila deve apontar para o novo
		TNo *fim = fila->fim;
		fim->proximo = novo;

		// atualiza o fim da fila
		fila->fim = novo;
	}

	// atualiza o n�mero de elementos da fila
	fila->n++;
}

// retira um elemento do inicio da fila
int desenfileira(TFila *fila) {

	int elemento;

	// se a fila est� vazia
	if (fila->n == 0) {
		printf("fila vazia\n");
		return 0;
	}

	// atual = endere�o do n� que est� no in�cio
	TNo *atual = fila->inicio;

	// pega o elemento
	elemento = atual->elemento;

	// remove o n� do in�cio
	fila->inicio = atual->proximo;
	free(atual);

	// atualiza o n�mero de elementos da fila
	fila->n--;

	// retorna o elemento
	return elemento;
}

