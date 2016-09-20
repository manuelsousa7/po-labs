#include "PenWithInk.h"


caneta cria_caneta(int inicial){
	caneta novo = (caneta)malloc(sizeof(struct caneta));
	novo->tinta = inicial;
	return novo;
}
