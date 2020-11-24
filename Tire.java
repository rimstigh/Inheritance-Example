class Tire extends Part {

private int speedRating;
private int weatherRating;

Tire() {
  speedRating = 0;
  weatherRating = 0;
}

Tire(int aSpeed, int aWeather) {
  speedRating = aSpeed;
  weatherRating = aWeather;
}

void print() {
  super.print();  
  System.out.println("Speed rating: " + speedRating);
  System.out.println("Weather rating: " + weatherRating);
}
}
