int x1 = 200;
int x2 = 800;
void setup(){
  size (1000, 600); 
}


void draw(){
     background(#B4A9A9);

    for (int i=300; i>0; i=i-15){
      noFill();
      ellipse (x1, 300, i, i);
  }
  x1++;
    for (int i=300; i>0; i=i-15){
       ellipse (x2, 300, i, i);
}
   x2--;
   if (x1>1000){
    x1=200; 
   }
   if (x2<0){
    x2=800; 
   }
}