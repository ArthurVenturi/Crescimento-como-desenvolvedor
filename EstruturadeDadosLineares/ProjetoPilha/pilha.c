#include <stdio.h>
#include <stdlib.h>
#include "pilha.h"

TPilha *criar() {

	TPilha *pilha;

	// aloca��o din�mica da pilha
	pilha = (TPilha *) malloc(sizeof(TPilha));

	// o campo topo � NULL, pois a pilha est� vazia
	pilha->topo = NULL;

	// n�mero de elementos da pilha
	pilha->n = 0;

	// retornando a pilha
	return pilha;
}

void liberar(TPilha *pilha) {

	int i;

	// atual = endere�o do n� que est� no topo
	TNo *atual = pilha->topo;
	// aux = endere�o do pr�ximo n�
	TNo *aux;

	// percorre a pilha (n vezes)
	for (i=0; i<pilha->n; i++) {

		// antes de liberar o n� atual, guarda o endere�o do pr�ximo em aux
		aux = atual->proximo;
		// libera a mem�ria do n� atual
		free(atual);
		// atualiza o atual para a pr�xima itera��o
		atual = aux;
	}

    // liberando a mem�ria alocada
    free(pilha);
}

// insere um elemento no topo da pilha
void push(TPilha *pilha, int elemento) {

	// cria um novo n�
	TNo *novo = (TNo *) malloc(sizeof(TNo));

	// insere o elemento no novo
	novo->elemento = elemento;

	// se a pilha est� vazia
	if (pilha->n == 0) {
		// o novo aponta para NULL
		novo->proximo = NULL;
	}
	else {
		// o novo aponta para o antigo topo
		novo->proximo = pilha->topo;
	}

	// atualiza o topo da pilha
	pilha->topo = novo;

	// atualiza o n�mero de elementos da pilha
	pilha->n++;
}

// retira um elemento do topo da pilha
int pop(TPilha *pilha) {

	int elemento;

	// se a pilha est� vazia
	if (pilha->n == 0) {
		printf("pilha vazia\n");
		return 0;
	}

	// atual = endere�o do n� que est� no topo
	TNo *atual = pilha->topo;

	// pega o elemento
	elemento = atual->elemento;

	// remove o n� do topo
	pilha->topo = atual->proximo;
	free(atual);

	// atualiza o n�mero de elementos da pilha
	pilha->n--;

	// retorna o elemento
	return elemento;
}

