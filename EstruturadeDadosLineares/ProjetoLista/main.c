#include <stdio.h>
#include "lista.h"

int main() {

    TLista *lista;

    // criando uma lista
    lista = criar();

    // inserindo elementos (insere no final da lista)
	inserir(lista, 15);
	inserir(lista, 16);
	inserir(lista, 17);
	inserir(lista, 18);
	inserir(lista, 19);

	printf("Imprimindo a lista:\n");
	imprimir(lista);

	// removendo o elemento da posição 3 (vai remover o elemento 18)
	remover(lista, 3);

	printf("\nApos a remocao:\n");
	imprimir(lista);

	// liberando a lista
	liberar(lista);

    return 0;
}
