package BooksShop.core.clients;


import BooksShop.core.interfase.GoodsInterfase;

public class VipUser extends BaseUser {

    private double skidka;

    public VipUser(String name, String lastName, int age, double skidka, boolean skidKarta) {
        super(name, lastName, age);
        this.skidka = skidka;
    }

    private boolean checkSkidka() {
        return skidka > 0;
    }

    @Override
    public void buy(GoodsInterfase goods) {
        if (!checkSkidka()) {
            super.buy(goods);
        } else
            System.out.println("я покупаю товары со скидкой");
    }


}
