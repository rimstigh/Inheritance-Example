class Part {
  
private int sku;
private int stock;
private double cost;

Part() {
  sku = 0;
  stock = 0;
  cost = 0.0;
}

Part(int aSku, int aStock, double aCost) {
  sku = aSku;
  stock = aStock;
  cost = aCost;
}

int getSku() {
  return sku;
}

int getStock() {
  return stock;
}

double getCost() {
  return cost;
}

void setSku(int aSku) {
  sku = aSku;
}

void setStock(int aStock) {
  stock = aStock;
}

void setCost(double aCost) {
  cost = aCost;
}

void print() {
  System.out.println("SKU: " + sku);
  System.out.println("Stock: " + stock);
  System.out.println("Cost: " + cost);
}
}