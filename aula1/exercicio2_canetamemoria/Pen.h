#ifndef _PEN_
#define _PEN_


#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct Pen
{
	char *brand;
	char *colour; 
}*Pen;

Pen newPen(char * brand, char * colour);
void print(Pen caneta);
void write(Pen caneta,char * word);
int equals(Pen um , Pen dois);
void deletePen(Pen caneta);

#endif