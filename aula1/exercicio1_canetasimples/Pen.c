#include "Pen.h"


Pen newPen(char * brand, char * colour){
	Pen caneta = (Pen)malloc(sizeof(struct Pen));
	caneta->brand = strdup(brand);
	caneta->colour = strdup(colour);
	return caneta;
}

void print(Pen caneta){
	printf("!PEN!\n");
	printf("BRAND: %s && COLOUR: %s\n",caneta->brand,caneta->colour);
}

void write(Pen caneta,char * word){
	printf("Caneta de cor %s da marca %s escreve %s\n",caneta->colour,caneta->brand,word);
}

int equals(Pen um , Pen dois){
	return (strcmp(um->colour,dois->colour)==0 && strcmp(um->brand,dois->brand)==0);
}

void deletePen(Pen caneta){
	free(caneta->brand);
	free(caneta->colour);
	free(caneta);
}