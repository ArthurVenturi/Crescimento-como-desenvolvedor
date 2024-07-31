/* TAD Fila */

struct No {
	int elemento;
	struct No *proximo;
};
typedef struct No TNo;

struct Fila {
	TNo *inicio;
	TNo *fim;
	int n;
};
typedef struct Fila TFila;

// cria a fila
TFila *criar();

// libera a fila
void liberar(TFila *fila);

// insere um elemento no fim da fila
void enfileira(TFila *fila, int elemento);

// retira um elemento do inicio da fila
int desenfileira(TFila *fila);
