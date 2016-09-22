#include "PenWithInk.h"


caneta cria_caneta(int inicial){
	caneta novo;
	novo.tinta = inicial;
	return novo;
}

caneta escreve(int inicial){
	caneta novo;
	if(inicial > 1000){
		print("Tamanho de tinta invalido");
		return ;
	}
	novo.tinta = inicial;
	return novo;
}

bool canetas_iguais(caneta um,caneta dois){
	return um.tinta == dois.tinta;
}