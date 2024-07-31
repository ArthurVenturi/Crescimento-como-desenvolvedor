#include <stdio.h>
#include <stdlib.h>

// Exemplo de utiliza��o das fun��es malloc(), realloc() e free()

int main() {
	
	int *vetor;
	int i, n1, n2;
	
	printf("Entre com o numero de elementos:\n");
	scanf("%d", &n1);
	
	vetor = (int *) malloc(n1 * sizeof(int));
	
	if (vetor == NULL) {
		printf("Erro na alocacao de memoria");
		exit(1);
	}
	
	printf("Entre com os valores:\n");
	for (i=0; i<n1; i++) {
		scanf("%d", &vetor[i]);
	}
	
	printf("Imprimindo o vetor:\n");
	for (i=0; i<n1; i++) {
		printf("%d ", vetor[i]);
	}
	
	printf("\nEntre com o novo numero de elementos:\n");
	scanf("%d", &n2);
	
	vetor = (int *) realloc(vetor, n2 * sizeof(int));
	if (vetor == NULL) {
		printf("Erro na alocacao de memoria");
		exit(1);
	}
	
	printf("Entre com os novos valores:\n");
	for(i=n1; i<n2; i++) {
		scanf("%d", &vetor[i]);
	}
	
	printf("Imprimindo o vetor:\n");
	for (i=0; i<n2; i++) {
		printf("%d ", vetor[i]);
	}
	printf("\n");
	
	free(vetor);
	vetor = NULL;
	
	return 0;
}
