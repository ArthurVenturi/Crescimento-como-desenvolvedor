#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define MAX 256
#define preencher_Turma 1
#define impremir_Turma 2
#define pesquisa_Aluno 3




struct Pessoa {

    char cpf[MAX];
    char nome[MAX];
    int idade;

};

typedef struct Pessoa TPessoa;


void preencher_Turma(TPessoa turma[TAM]){

    int i;

    for(i = 0; i < TAM; i++){

        printf("Digite o seu cpf: ");
        fgets(turma[i].cpf, MAX-1, stdin);

        printf("Digite o seu nome: ");
        fgets(turma[i].nome, MAX -1, stdin);

    }
}

void impremir_Turma(TPessoa turma[]){

    int i;

    for (i = 0; i < TAM; i++){

        printf("\n Alunos cadadtrados : \n");

        printf("Cpf: %s \n Nome: %s" , turma[i].cpf, turma[i].nome);
    }
}

void pesquisa_Aluno(TPessoa turma[]){

    char procurado[MAX];
    int i, rest, achou = 0;

    printf("Digite o cpf que deseja pesquisar: ");
    fgets(procurado, MAX -1, stdin);

    for(i = 0; i < TAM; i++){

        rest = strcmp(turma[i].cpf, procurado);

        if (rest == 0){
            achou = 1;
            printf("Cpf: %s \n Nome: %s" , turma[i].cpf, turma[i].nome);
            break;
        }
        if(achou == 0){

             printf("Aluno não encontrado");
        }
    }
}

void turma_menu(){

    printf("Selecione a opcao que deseja: \n");
    printf("\n 0 - SAIR \n");
    printf("\n 1 - Preencher Turma \n");
    printf("\n 2 - Impremir Turma \n");
    printf("\n 3 - Pesquisar Turma \n");
    printf("\n Digite a opcao: ");

}

int main(){

    /* Primeiro jeito:

     TPessoa pArthur;

    pArthur.idade = 19;
    strcpy(pArthur.nome, "Arthur Venturi");

    printf("nome : %s\n", pArthur.nome);
    printf("Idade : %d\n", pArthur.idade);

    -----------------------------------------------------

    segundo jeito:
    printf("Digite o seu nome: ");
    fgets(pArthur.nome, MAX -1, stdin);

    printf("Digite sua idade: ");
    scanf("%d", &pArthur.idade);

    printf("nome : %s", pArthur.nome);
    printf("Idade : %d", pArthur.idade);

    */

    int op, n = 0;

    TPessoa *turma;


    do{
        turma_menu();

        scanf("%d", &op);
        getchar();

        switch(op) {

            case preencher_Turma:

                n++;

                if(n == 1){

                    TPessoa turma = (TPessoa *) malloc(sizeof(TPessoa));
                }
                else {
                    TPessoa *turma = (TPessoa *) realloc(n * sizeof(TPessoa));
                }

                preencher_Turma(turma);
                break;

            case impremir_Turma:

                break;

            case pesquisa_Aluno:

                break;

            default:
                printf("\nOperador invalido\n");
                break;
        }

        if(op == 1){
            preencher_Turma(turma);
        }
        else if(op == 2){
            impremir_Turma(turma);
        }
        else if(op == 3){
            pesquisa_Aluno(turma);

        }
        else if (op == 0){
            break;
        }
        else {

        }
    }
    while(op!=0);





    return 0;
}
