package BooksShop.core.clients;


import BooksShop.core.interfase.GoodsInterfase;
import BooksShop.core.interfase.UserInterfase;

public abstract class BaseUser implements UserInterfase {


    private String name, lastName;
    private int age;

    public BaseUser(String name) {
        this.name = name;
    }
    public BaseUser(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public void buy(GoodsInterfase goods) {
        System.out.println("я покупаю товар: " + goods.getName());
    }

    @Override
    public void returnGoods(GoodsInterfase goods) {
        System.out.println("я возвращаю товар: " + goods.getName());
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
