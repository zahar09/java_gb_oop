public class User {
    private String log;
    private String pass;
    private Basket basket;

    public User(String login, String password, Basket persenBasket){
        this.log = login;
        this.pass = password;
        this.basket = persenBasket;
    }

    public void Buy(Shop shop){
        shop.RemoveProducts(this.basket.GetPurchasedProducts());
        System.out.println("логин: " + log + " пароль: " + pass + " покупка: " + basket.toString());
    }
}
