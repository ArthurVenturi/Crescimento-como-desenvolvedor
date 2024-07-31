#include <stdio.h>
#include <stdlib.h>
#include "pilha.h"

TPilha *criar() {

	TPilha *pilha;

	// alocação dinâmica da pilha
	pilha = (TPilha *) malloc(sizeof(TPilha));

	// o campo topo é NULL, pois a pilha está vazia
	pilha->topo = NULL;

	// número de elementos da pilha
	pilha->n = 0;

	// retornando a pilha
	return pilha;
}

void liberar(TPilha *pilha) {

	int i;

	// atual = endereço do nó que está no topo
	TNo *atual = pilha->topo;
	// aux = endereço do próximo nó
	TNo *aux;

	// percorre a pilha (n vezes)
	for (i=0; i<pilha->n; i++) {

		// antes de liberar o nó atual, guarda o endereço do próximo em aux
		aux = atual->proximo;
		// libera a memória do nó atual
		free(atual);
		// atualiza o atual para a próxima iteração
		atual = aux;
	}

    // liberando a memória alocada
    free(pilha);
}

// insere um elemento no topo da pilha
void push(TPilha *pilha, int elemento) {

	// cria um novo nó
	TNo *novo = (TNo *) malloc(sizeof(TNo));

	// insere o elemento no novo
	novo->elemento = elemento;

	// se a pilha está vazia
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

	// atualiza o número de elementos da pilha
	pilha->n++;
}

// retira um elemento do topo da pilha
int pop(TPilha *pilha) {

	int elemento;

	// se a pilha está vazia
	if (pilha->n == 0) {
		printf("pilha vazia\n");
		return 0;
	}

	// atual = endereço do nó que está no topo
	TNo *atual = pilha->topo;

	// pega o elemento
	elemento = atual->elemento;

	// remove o nó do topo
	pilha->topo = atual->proximo;
	free(atual);

	// atualiza o número de elementos da pilha
	pilha->n--;

	// retorna o elemento
	return elemento;
}

