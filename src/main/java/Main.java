import com.java.tutorial.dao.impl.AccountDAO;
import com.java.tutorial.entities.Account;
import com.java.tutorial.exceptions.DAOException;
import com.java.tutorial.exceptions.ServiceException;
import com.java.tutorial.service.impl.AccountService;

public class Main {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        Account account = new Account();
        try {
        account.setUserName("taxi1");
        account.setPassword("12345");
        accountService.login(account);
           System.out.println(accountService.login(account));
        } catch (ServiceException e) {
            e.getMessage();
        }

    }
}
