package BooksShop.core;


import BooksShop.core.clients.AnonimUser;
import BooksShop.core.clients.VipUser;
import BooksShop.core.goods.Carrie;
import BooksShop.core.interfase.GoodsInterfase;
import BooksShop.core.interfase.UserInterfase;

public class Start {

    public static void main(String[] args) {


        UserInterfase visitor = new AnonimUser("Гость");
        UserInterfase vipVisitor = new VipUser("Александр", "Балакирев", 26, 30, true);

        GoodsInterfase king = new Carrie("Стивен Кинг", 150);


    }

}
