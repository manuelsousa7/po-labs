#ifndef _PENWITHINK_
#define _PENWITHINK_

#include <stdio.h>
#include <stdlib.h>

typedef struct caneta
{
	int tinta;

}*caneta;

caneta cria_caneta(int inicial);