#include <stdio.h>
#include <stdlib.h>
#include "lista.h"

TLista *criar() {

	TLista *lista;

	// alocação dinâmica da lista
	lista = (TLista *) malloc(sizeof(TLista));

	// o campo inicio é NULL, pois a lista não tem nós
	lista->inicio = NULL;

	// número de elementos da lista
	lista->n = 0;

	// retornando a lista
	return lista;
}

void liberar(TLista *lista) {

	int i;

	// atual = endereço do primeiro nó
	TNo *atual = lista->inicio;
	// aux = endereço do próximo nó
	TNo *aux;

	// percorre a lista (n vezes)
	for (i=0; i<lista->n; i++) {

		// antes de liberar o nó atual, guarda o endereço do próximo em aux
		aux = atual->proximo;
		// libera a memória do nó atual
		free(atual);
		// atualiza o atual para a próxima iteração
		atual = aux;
	}

    // liberando a memória alocada para a lista
    free(lista);
}

// insere um elemento no final da lista
void inserir(TLista *lista, int elemento) {

	int i;

	// cria um novo nó
	TNo *novo = (TNo *) malloc(sizeof(TNo));

	// insere o elemento no novo
	novo->elemento = elemento;

	// faz o novo apontar para NULL
	novo->proximo = NULL;

	// se a lista está lista vazia
	if (lista->n == 0) {
		// insere o novo no inicio da lista
		lista->inicio = novo;
	}
	else {
		TNo *atual = lista->inicio;

		// percorre a lista até o final (n vezes)
		for (i=0; i<lista->n; i++) {

			// se chegou na última posição
			if (i == lista->n-1) {
				// o ultimo nó deve apontar para o novo
				atual->proximo = novo;
			}
			else {
				// atualiza o atual para a próxima iteração
				atual = atual->proximo;
			}
		}
	}

	// atualiza o número de elementos da lista
	lista->n++;
}

// remove um elemento da lista, dada uma posição
void remover(TLista *lista, int pos) {

	int i;

	TNo *atual = lista->inicio;

	// se a posição é inválida
	if (pos < 0 || pos >= lista->n) {
		printf("Posicao invalida");
		return;
	}

	// se pos = 0 (primeiro nó)
	if (pos == 0) {
		// remove o primeiro nó
		lista->inicio = atual->proximo;
		free(atual);

		// atualiza o número de elementos da lista
		lista->n--;

		return;
	}

	// percorre a lista (pos iterações)
	for (i=0; i<pos; i++) {

		// se chegou no nó anterior ao pos
		if (i == pos-1) {

			TNo *aux = atual->proximo; // vai ser removido
			atual->proximo = aux->proximo;
			free(aux);
		}
		else {
			// atualiza o atual para a próxima iteração
			atual = atual->proximo;
		}
	}

	// atualiza o número de elementos da lista
	lista->n--;
}

// imprime todos os elementos da lista
void imprimir(TLista *lista) {

	int i;

	// atual = endereço do primeiro nó
	TNo *atual = lista->inicio;

	// percorre a lista (n iterações)
	for (i=0; i<lista->n; i++) {

		// imprime o elemento do atual
		printf("Elemento %d: %d\n", i, atual->elemento);

		// atualiza o atual para a próxima iteração
		atual = atual->proximo;
	}
}
