void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#FA0303);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#18D826);
    rect(176, 103, 12, 32);
    fill(200,200,200);
    if(mousePressed){
    ellipse(90,200,75,75);}
} 