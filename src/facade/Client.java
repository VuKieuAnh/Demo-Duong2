package facade;

public class Client {
    public static void main(String[] args) {
        ShopFacade shopFacade = ShopFacade.getInstance();
        shopFacade.thanhToanShopeePayvaShipE("Duong");
    }
}
