/* TAD Pilha */

struct No {
	int elemento;
	struct No *proximo;
};
typedef struct No TNo;

struct Pilha {
	TNo *topo;
	int n;
};
typedef struct Pilha TPilha;

// cria a pilha
TPilha *criar();

// libera a pilha
void liberar(TPilha *pilha);

// insere um elemento no topo da pilha
void push(TPilha *pilha, int elemento);

// retira um elemento do topo da pilha
int pop(TPilha *pilha);

