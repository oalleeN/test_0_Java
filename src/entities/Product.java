package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity; // this: serve para indicar que você estáse referindo ao atributo quantity e não ao parâmetro.
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
        + ", $"
        + String.format("%.2f", price) // formatação do preço
        + ", "
        + quantity
        + " units, Total: " + String.format("%.2f", totalValueInStock());
    }

}
