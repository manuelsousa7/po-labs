#ifndef _PENWITHINK_
#define _PENWITHINK_


#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAXTINTA 1000
typedef struct Pen
{
	char *brand;
	char *colour; 
	int capacity;
}*Pen;

Pen newPen(char * brand, char * colour,int capacity);
void print(Pen caneta);
void reduce_capacity(Pen caneta);
int get_capacity(Pen caneta);
char* get_colour(Pen caneta);
char* get_brand(Pen caneta);
Pen recharge(Pen caneta,int new_recharge);
void how_much(Pen caneta);
void write(Pen caneta,char * word);
int equals(Pen um , Pen dois);
void deletePen(Pen caneta);

#endif