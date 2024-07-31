#include <stdio.h>
#define N 5


float calcularMedia(float vet[N]);
	

int main(){

	float vet[N];
	float media;

	for (int i = 0; i < N; i++){
		printf("Digite as notas dos 5 alunos : ");
		scanf("%f", &vet[i]);
	}
	printf("A media da turma : %f ", media);

	return 0;
}

float calcularMedia(float vet[N]){
	float media = 0, soma;

	for (int i = 0; i < N; i++){
		soma = soma + vet[i];
	}
	media = soma / N;
	return media;
}