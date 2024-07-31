#include <stdio.h>
#define N 5

int main(){

int vet [N];

for (int i = 0; i < 5; i++){
	printf("Digite o valor do vetor de 5 posições");
	scanf("%d", &vet[i]);

}

	printf("Digite um valor para ser buscado no vetor : ");
	scanf("%d", &busca);

	for (int i = 0; i < N;i++){
		if (busca == vet[i]){

			printf("O valor %d esta na posicao %d do vetor \n", vet[i], i);
		}
		else {
			prinf("O valor %d esta na posicao %d do vetor \n", busca , i);
		}
	}

	return 0;
}
