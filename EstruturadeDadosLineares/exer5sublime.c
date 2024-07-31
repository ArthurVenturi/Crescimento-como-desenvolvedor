#include <stdio.h>
#define N 3 

int main(){
	
	int mat [N] [N];
	float media = 0, soma = 0;

	for (int i = 0; i < N; i++){
		for(int j = 0; j < N; j++){
			printf("Digite a nota do aluno %d", i + 1);
			scanf("%f", &mat[i][j]);

			soma = soma + mat[i][j];
			
			if (mat[i][j] == mat[i][2]){
				
				media = soma / 2;
				mat[i][j] = media;
			}
		}
	}

	for (int i = 0; i < N; i++){
		for(int j = 0; j < N; j++){

			if (mat[i][j] == mat[i][2]){

			printf("A media do aluno %d e : %f", i, mat[i][j]);
			}
		}
	}
	return 0;
}