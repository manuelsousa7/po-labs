#include <stdio.h>
#include "Pen.h"
 
int main() {
  Pen p1 = newPen("Bic", "green");
  Pen p2 = newPen("Bic", "red");
  Pen p3 = newPen("Bic", "green");
 
  print(p1);
  print(p2);
 
  write(p1, "SCP");
  write(p2, "SLB");

  printf("p1 == p2? %s\n", equals(p1, p2) ? "yes" : "no");
  printf("p1 == p3? %s\n", equals(p1, p3) ? "yes" : "no");
 
  deletePen(p1);
  deletePen(p2);
  deletePen(p3);
 
  return 0;
}
