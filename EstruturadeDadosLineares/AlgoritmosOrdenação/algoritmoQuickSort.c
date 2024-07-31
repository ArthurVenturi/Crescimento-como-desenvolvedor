#include <stdio.h>
#define N 5

void ordena(int vetor[N], int inicio, int fim){

   int i, j, pivo, aux;
    i = inicio;
    j = fim;
  pivo = vetor[(inicio + fim) / 2];
/* Particionamento */
  while (i <= j)
	{
/* Procurando um elemento maior ou igual ao pivC4 a partir do inC-cio */
	  while (vetor[i] < pivo)
		{
		  i++;
		}
/* Procurando um elemento menor ou igual ao pivC4 a partir do fim */
	  while (vetor[j] > pivo)
		{
		  j--;
		}
/* Troca os elementos */
	  if (i <= j)
		{
		  aux = vetor[i];
		  vetor[i] = vetor[j];
		  vetor[j] = aux;
		  i++;
		  j--;
		}
	}
/* Recursao */
  if (inicio < j)
	{
	  ordena(vetor, inicio, j);
	}
  if (i < fim)
	{
	  ordena (vetor, i, fim);
	}

}

int main ()
{

  int vetor[N];
  int i, j, elemento_atual;

  for (i = 0; i < N; i++)
	{
	  scanf ("%d", &vetor[i]);
	}

    vetor.ordena(vetor[N], &i, &j);

  return 0;
}
