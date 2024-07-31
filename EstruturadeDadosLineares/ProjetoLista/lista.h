/* TAD Lista Encadeada */

struct No {
	int elemento;
	struct No *proximo;
};
typedef struct No TNo;

struct Lista {
	TNo *inicio;
	int n;
};
typedef struct Lista TLista;

// cria a lista
TLista *criar();

// libera a lista
void liberar(TLista *lista);

// insere um elemento no final da lista
void inserir(TLista *lista, int elemento);

// remove um elemento da lista, dada uma posição
void remover(TLista *lista, int pos);

// imprime todos os elementos da lista
void imprimir(TLista *lista);
