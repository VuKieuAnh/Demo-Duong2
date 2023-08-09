package facade;

public class ShopFacade {
    private AccountService accountService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    private ShopFacade() {
        this.accountService = new AccountService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    private static ShopFacade instance;

    public static ShopFacade getInstance(){
        if (instance== null)
            instance = new ShopFacade();
        return instance;
    }

    public void thanhtoanThevaShipChuan(String email){
        accountService.getAccount(email);
        paymentService.paymentByCash();
        shippingService.standardShip();
        System.out.println("Giam 5%");
    }

    public void thanhToanShopeePayvaShipE(String email){
        accountService.getAccount(email);
        paymentService.paymentByShopeePay();
        shippingService.expressShip();
        System.out.println("Giam 10%");
    }
}
