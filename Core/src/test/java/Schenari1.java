import BooksShop.core.clients.AnonimUser;
import BooksShop.core.clients.BaseUser;
import BooksShop.core.clients.VipUser;
import BooksShop.core.service.Administrator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Сценарий 1
 */
public class Schenari1 extends Assert {
    @Test
    public void test1() {
        VipUser vipUser = new VipUser("Александр", "Балакирев", 26, 30, true);
        AnonimUser anonimUser = new AnonimUser("Гость");
        Administrator admin = new Administrator();

        assertTrue(anonimUser instanceof BaseUser);

        //клиент создает заказ


    }

}
