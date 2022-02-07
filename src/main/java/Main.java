import Enums.Brand;
import Enums.Category;
import Model.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("welcome");
        Store store = new Store();
        Cart cart = new Cart();
        Admin Johnny = new Admin("Johnny",01);
        Customer Loveth = new Customer("Loveth",02,5_000.00);
        Product phone1 = new Product("Note 10",03, Brand.SAMSUNG, Category.ELECTRONICS,300_000.00,10);
        Product chair1 = new Product ("Gucci Chair",04, Brand.GUCCI, Category.FURNITURE,50_000,10);
        Product chair2 = new Product ("Gucci Chair 2",05, Brand.GUCCI, Category.FURNITURE,50_000,10);
        Product watch1 = new Product ("Swatch watch",06, Brand.SWATCH, Category.ACCESSORIES,10_000,10);
        Johnny.addProductToStore(phone1,store);
        //System.out.println(store.getProductList());
        Johnny.addProductToStore(chair1,store);
        Johnny.addProductToStore(watch1,store);
        //System.out.println(store.getProductList());
        //Johnny.removeProductFromStore(04,store);
        // System.out.println(store.getProductList());
        //Johnny.removeProductFromStore(07,store);
        //System.out.println(store.getProductList());
        //Johnny.viewProductInStore(05,store);
        Loveth.addProductToCart(watch1,store,cart);
        System.out.println(cart.getCartItemsList());
        Loveth.addProductToCart(chair2,store,cart);
        System.out.println(cart.getCartItemsList());
        Loveth.removeProductFromCart(watch1,store,cart);
        System.out.println(cart.getCartItemsList());
    }
}
