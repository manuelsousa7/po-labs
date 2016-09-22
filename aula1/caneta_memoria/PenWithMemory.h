#ifndef __PEN_WITH_MEMORY_H__
#define __PEN_WITH_MEMORY_H__

typedef struct pen_with_memory * PenWithMemory;

PenWithMemory newPenWithMemory(const char *brand, const char *color, int capacity);
void deletePenWithMemory(PenWithMemory pen);

const char *getStringFromMemory(PenWithMemory pen, int idx);

void resetMemory(PenWithMemory pen);

void writePenWithMemory(PenWithMemory pen, const char *msg);

int         equalsPenWithMemory(PenWithMemory pen1, PenWithMemory pen2);
const char *getBrandPenWithMemory(PenWithMemory pen);
const char *getColorPenWithMemory(PenWithMemory pen);
int         getCapacityPenWithMemory(PenWithMemory pen);
void        printPenWithMemory(PenWithMemory pen);

#endif
