void setup() {
size(250,300);
PImage cat = loadImage("cat.jpg");
image(cat,0,0);
}
void draw() {
  
  
  fill(102,mouseX,mouseY);
  ellipse(89,130,18,18);
  ellipse(154,129,18,18);
   fill(#000505);
  ellipse(89,130,5,5);
  ellipse(154,129,5,5);
 
}