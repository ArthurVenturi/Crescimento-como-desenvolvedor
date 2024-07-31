#include <stdio.h>

int acha_maior_menor_q_10();

int main(){

	int maior = 0, menor = 0, num1 = 0, num2 = 0, num3 = 0;
	
	printf("Digite tres numeros : ");
	scanf("%d", &num1);
	
	scanf("%d", &num2);

	scanf("%d", &num3);

	int resultado = acha_maior_menor_q_10(num1, num2, num3, maior, menor);

	if (resultado == 0){
		printf("O maior numero maior que 10 e %d \n.", maior);
		printf("O menor numero menor que 10 e %d \n.", menor);
	}

	if(resultado == 445){
		printf("Nao ha maior numero maior que 10. Codigo de erro -445 \n");
	}
	if (resultado = 556){
		printf("Nao ha menor numero maior que 10. Codigo de erro -556 \n");
	}


	return 0;
}

int acha_maior_menor_q_10(int num1, int num2, int num3, int maior, int menor){
	int tem_maior = 0;
	maior = 0, menor = 0;

	if (num1 > 10){
		tem_maior = 1;
		maior = num1; // 15 5 22
	}

	if (num2 > 10){
		tem_maior = 1;
		if (num2 > maior){
			maior = num2;
		}
	}

	if (num3 > 10){
		tem_maior = 1;
		if (num3 > maior){
			maior = num3;
		}
	}

	if (num1 > 0 && num1 < 10 ){
		menor = num1;
	}

	if (num2 > 0 && num2 < 10){
		if(menor > num2){
			menor = num2;
		}
	}

	if(num3 > 0 && num3 < 10){
		if (menor > num3){
			menor = num3;
		}
	}

	if(num1 < 10 && num2 < 10 && num3 < 10){

		return 445;
	}
	if (tem_maior != 1){

		return 556;
	}

	return 0;
}