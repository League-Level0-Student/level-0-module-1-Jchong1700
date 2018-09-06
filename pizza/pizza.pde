void setup() {
  size(600,600);
}
void draw() {
  noStroke();
  background(#65EDE0);
  fill(#C4AC35);
  ellipse(300,300,400,400);
  fill(#A00F0A);
  ellipse(300,300,350,350);
  fill(#E0D900);
  ellipse(300,300,325,325);
     PImage goblin = loadImage("goblin.ppm.gif");
  goblin.resize(50,50);
  image(goblin, 300 ,300);
  image(goblin, 300 ,200);
  image(goblin, 175 ,150);
   
  if(mousePressed){
  image(goblin, mouseX,mouseY);
}

}