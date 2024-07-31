#include <stdio.h>
#include <stdlib.h>
#include "lista.h"

TLista *criar() {

	TLista *lista;

	// aloca��o din�mica da lista
	lista = (TLista *) malloc(sizeof(TLista));

	// o campo inicio � NULL, pois a lista n�o tem n�s
	lista->inicio = NULL;

	// n�mero de elementos da lista
	lista->n = 0;

	// retornando a lista
	return lista;
}

void liberar(TLista *lista) {

	int i;

	// atual = endere�o do primeiro n�
	TNo *atual = lista->inicio;
	// aux = endere�o do pr�ximo n�
	TNo *aux;

	// percorre a lista (n vezes)
	for (i=0; i<lista->n; i++) {

		// antes de liberar o n� atual, guarda o endere�o do pr�ximo em aux
		aux = atual->proximo;
		// libera a mem�ria do n� atual
		free(atual);
		// atualiza o atual para a pr�xima itera��o
		atual = aux;
	}

    // liberando a mem�ria alocada para a lista
    free(lista);
}

// insere um elemento no final da lista
void inserir(TLista *lista, int elemento) {

	int i;

	// cria um novo n�
	TNo *novo = (TNo *) malloc(sizeof(TNo));

	// insere o elemento no novo
	novo->elemento = elemento;

	// faz o novo apontar para NULL
	novo->proximo = NULL;

	// se a lista est� lista vazia
	if (lista->n == 0) {
		// insere o novo no inicio da lista
		lista->inicio = novo;
	}
	else {
		TNo *atual = lista->inicio;

		// percorre a lista at� o final (n vezes)
		for (i=0; i<lista->n; i++) {

			// se chegou na �ltima posi��o
			if (i == lista->n-1) {
				// o ultimo n� deve apontar para o novo
				atual->proximo = novo;
			}
			else {
				// atualiza o atual para a pr�xima itera��o
				atual = atual->proximo;
			}
		}
	}

	// atualiza o n�mero de elementos da lista
	lista->n++;
}

// remove um elemento da lista, dada uma posi��o
void remover(TLista *lista, int pos) {

	int i;

	TNo *atual = lista->inicio;

	// se a posi��o � inv�lida
	if (pos < 0 || pos >= lista->n) {
		printf("Posicao invalida");
		return;
	}

	// se pos = 0 (primeiro n�)
	if (pos == 0) {
		// remove o primeiro n�
		lista->inicio = atual->proximo;
		free(atual);

		// atualiza o n�mero de elementos da lista
		lista->n--;

		return;
	}

	// percorre a lista (pos itera��es)
	for (i=0; i<pos; i++) {

		// se chegou no n� anterior ao pos
		if (i == pos-1) {

			TNo *aux = atual->proximo; // vai ser removido
			atual->proximo = aux->proximo;
			free(aux);
		}
		else {
			// atualiza o atual para a pr�xima itera��o
			atual = atual->proximo;
		}
	}

	// atualiza o n�mero de elementos da lista
	lista->n--;
}

// imprime todos os elementos da lista
void imprimir(TLista *lista) {

	int i;

	// atual = endere�o do primeiro n�
	TNo *atual = lista->inicio;

	// percorre a lista (n itera��es)
	for (i=0; i<lista->n; i++) {

		// imprime o elemento do atual
		printf("Elemento %d: %d\n", i, atual->elemento);

		// atualiza o atual para a pr�xima itera��o
		atual = atual->proximo;
	}
}
