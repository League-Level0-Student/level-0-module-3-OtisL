import javax.swing.JOptionPane;

void setup(){
  size (200, 200);
  for (int i=100; i>0; i=i-15){
    if (i%2==0){
      fill(#FF0000);
    }else {
      fill(#FFFFFF);
    }
    ellipse (100, 100, i, i);
  }
}