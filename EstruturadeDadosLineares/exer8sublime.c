#include <stdio.h>

int troca_par_impar(int num1, int num2){
	int armazena;

	if (num1%2 == 0 && num2%2 == 0){ // ambos pares
		
		return -666;
	}
	else if (num1%2 == 0 && num2%2 != 0 || num1%2 != 0 && num2%2 == 0){ 
		armazena = num1;
		num1 = num2;
		num2 = armazena;

		return -99;
	}
	else {
		return -666;
	}

}

int main(){

	int soma = 0, num1 = 0, num2 = 0, result;

	printf("Digite o primeiro numero");
	scanf("%d",&num1);

	printf("Digite o segundo numero");
	scanf("%d",&num2);
	
	soma = num1 + num2;

	result = troca_par_impar(num1, num2);

	if(result == -99){
		printf("Foram trocados! \n");
	}
	else if (result == -666){
		printf("Não foram trocados! \n");
	}

	printf("A soma : %d", soma);
	return 0;
}