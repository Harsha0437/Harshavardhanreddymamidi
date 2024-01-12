package inheritance;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setPrice(5.2);
        System.out.println(product.getPrice());
        System.out.println(product.getPrice(2));
    }
}
