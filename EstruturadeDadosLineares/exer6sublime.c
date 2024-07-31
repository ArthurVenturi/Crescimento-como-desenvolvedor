#include <stdio.h>
#include <math.h>

float CalculadoraCientifica(float num, int opcao){

	if (opcao == 1){
		float result;
 		result = num * num;

		return result;
	}
	else if (opcao == 2){
		float result;
		result = sqrt(num); // sqrt serve para calcular a raiz quadrada

		return result;
	}
	else if (opcao == 3){
		float result;
		result = cbrt(num); // cbrt serve para calcular a raiz cubica

		return result;
	}
}


/*float CalcularNumeroElevado(float num){
 	float num, result;
 	result = num * num;
	return result
}

float CalcularRaizQuadrada(float num){
	float num, result;
	result = pow(2,num);
	return result
}

float CalcularRaizCubica(float num){
	float num, result;
	result = pow(3,num);
	return result
}*/

int main(){

	int opcao = 0;
	float result, num;

	printf("Bem vindo a calculadora Cientifica! \n");
	printf("Digite um numero \n");
	scanf("%f", &num);
	printf("Digite 1 para calcular o numero elevado ao quadrado \n");
	printf("Digite 2 para calcular a raiz quadrada \n");
	printf("Digite 3 para caucular a raiz cubica \n");
	printf("Qual opcao voce deseja : ");
	scanf("%d", &opcao);

	result = CalculadoraCientifica(num, opcao);
	printf("O resultado e %.2f ", result);

	return 0;
}
