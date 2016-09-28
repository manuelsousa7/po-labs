//Manuel Sousa - 84740 - IST LEIC
#include <stdio.h>
#include "PenWithInk.h"
 
int main() {
  Pen p1 = newPen("Bic", "green",100);
  Pen p2 = newPen("Bic", "green",100);
  Pen p3 = newPen("Bic", "green",50);
 
  print(p1);
  print(p2);
 
  write(p3, "SLB");
  print(p3);
  write(p3, "SLB");
  print(p3);
  write(p3, "SLB");
  print(p3);
  write(p3, "SLB");
  print(p3);
  write(p3, "SLB");
  print(p3);
  write(p3, "SLB");
  print(p3);
  write(p3, "SLB");
  print(p3);
  write(p3, "SLB");
  print(p3);
  write(p3, "SLB");
  print(p3);
  write(p3, "SLB");
  print(p3);
  write(p3, "SLB");
  recharge(p3,100);
  print(p3);
  printf("p1 == p2? %s\n", equals(p1, p2) ? "yes" : "no");
  printf("p1 == p3? %s\n", equals(p1, p3) ? "yes" : "no");
 
  deletePen(p1);
  deletePen(p2);
  deletePen(p3);
 
  return 0;
}
