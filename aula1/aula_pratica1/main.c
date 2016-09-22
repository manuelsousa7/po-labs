#include <stdio.h>
#include "PenWithInk.h"

int main(){
	caneta ola = cria_caneta(100);
	printf("%d",ola.tinta);
	return 0;
}