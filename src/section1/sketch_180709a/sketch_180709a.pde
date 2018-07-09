
void setup() {
  size(500, 500); 
  fill(#F29621);
  ellipse(100, 10, 100, 100);
  rect(100, 100, 100, 100);
}
void draw() {
  ellipse(mouseX, mouseY, 50, 50);
}