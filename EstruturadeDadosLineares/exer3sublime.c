#include <stdio.h>
#define N 3

int main(){

	float vet[N];
	float maior = 0, diferencaSalario;
	int posicao;

	for(int i = 0; i < N; i++){

	printf("Digite o salario dos 10 funcionarios :");
	scanf("%f", &vet[i]);

		if (vet[i] > maior){
			maior = vet[i];
			posicao = i;
		}
	}

	printf("O maior salario e %2.f do funcionario %d", maior, posicao);

	for (int i = 0; i < N; i++){
		if (vet[i] != maior){

			diferençaSalario = vet[i] - maior;
			diferençaSalario = abs(diferencaSalario);
			/* if (difsalario < 0){// cauculo matematico do metodo abs.
            difsalario = disalario * -1;
            }
            */
			
			printf("O funcionario %d tem que ganhar mais %f",i , diferençaSalario);
		}
	}
	return 0;
}