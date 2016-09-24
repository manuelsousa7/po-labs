//Manuel Sousa - 84740 - IST LEIC
#include "PenWithInk.h"

Pen newPen(char * brand, char * colour, int capacity){
	Pen caneta = (Pen)malloc(sizeof(struct Pen));
	caneta->brand = strdup(brand);
	caneta->colour = strdup(colour);
	caneta->capacity = capacity;
	return caneta;
}

void print(Pen caneta){
	if (caneta==NULL)
		return;
	printf("!PEN!\n");
	printf("BRAND: %s && COLOUR: %s && CAPACITY:%d\n",get_brand(caneta),get_colour(caneta),get_capacity(caneta));
}

//Viola Abstracao
void reduce_capacity(Pen caneta){
	caneta->capacity-=1;
}

//Viola Abstracao
int get_capacity(Pen caneta){
	return caneta->capacity;
}

//Viola Abstracao
char* get_colour(Pen caneta){
	return caneta->colour;
}

//Viola Abstracao
char* get_brand(Pen caneta){
	return caneta->brand;
}

//Viola Abstracao
Pen recharge(Pen caneta,int new_recharge){
	if (caneta==NULL)
		return NULL;
	if(caneta->capacity+new_recharge>=MAXTINTA)
		caneta->capacity=MAXTINTA;
	else if(new_recharge >= 0)
		caneta->capacity+=new_recharge;
	return caneta;
}

void how_much(Pen caneta){
	if (caneta==NULL)
		return;
	printf("The pen with BRAND: %s && COLOUR: %s has CAPACITY of %d units\n",get_brand(caneta),get_colour(caneta),get_capacity(caneta));
}

void write(Pen caneta,char * word){
	if (caneta==NULL)
		return;
	if(get_capacity(caneta)>=1){
		printf("Caneta de cor %s da marca %s escreve %s\n",get_colour(caneta),get_brand(caneta),word);
		reduce_capacity(caneta);
	}
}

int equals(Pen caneta1 , Pen caneta2){
	if (caneta1==NULL || caneta2 == NULL)
		return 0;
	return (strcmp(get_colour(caneta1),get_colour(caneta2))==0 && strcmp(get_brand(caneta1),get_brand(caneta2))==0 && get_capacity(caneta1)==get_capacity(caneta2));
}

//Viola Abstracao
void deletePen(Pen caneta){
	if(caneta){
		free(caneta->brand);
		free(caneta->colour);
		free(caneta);
	}
}