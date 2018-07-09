PImage rainbow;
PImage unicorn;
void setup() {
  rainbow = loadImage("unicorn art 2.jpg");
  size(1000, 500);
  rainbow.resize(1000, 500);
}
void draw() {
  background(rainbow);
  unicorn = loadImage("unicorn art.png");
  image(unicorn, mouseX, mouseY);
}