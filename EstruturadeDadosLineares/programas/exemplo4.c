#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define OP_CADASTRAR 1
#define OP_IMPRIMIR 2
#define OP_SAIR 3

#define MAX 100
struct Pessoa {
	char nome[MAX];
	int idade;
};
typedef struct Pessoa TPessoa;

// Exemplo de alocação dinâmica de vetor de struct

void cadastra_pessoa(TPessoa vetor[], int pos) {

	printf("\nNome: ");
	fgets(vetor[pos].nome, MAX-1, stdin);
	printf("Idade: ");
	scanf("%d", &vetor[pos].idade);
}
void imprime_cadastros(TPessoa vetor[], int n) {

	int i;
    printf("\nImprimindo os cadastros:\n");
    for (i=0; i<n; i++) {
        printf("\nNome: %s", vetor[i].nome);
        printf("Idade: %d\n ", vetor[i].idade);
    }
}

int main() {
	TPessoa *vetor;
	int op, n;

	n = 0;

	do {
		printf("\nEscolha a opcao:\n1 - Cadastrar\n2 - Listar\n3 - Sair\n");
		scanf("%d", &op);
		getchar();

	    switch (op) {
	    	case OP_CADASTRAR:

                n++;
                if (n == 1) {
                	vetor = (TPessoa *) malloc(sizeof(TPessoa));
				}
				else {
					vetor = (TPessoa *) realloc(vetor, n * sizeof(TPessoa));
            	}

				if (vetor == NULL) {
					printf("Erro em alocacao de memoria\n");
	                exit(1);
                }

				cadastra_pessoa(vetor, n-1);
                printf("Cadastro realizado\n");
                break;

			case OP_IMPRIMIR:
                imprime_cadastros(vetor, n);
                break;

            case OP_SAIR:
                break;

        }

    } while (op != OP_SAIR);

	free(vetor);
	vetor = NULL;

	return 0;
}

