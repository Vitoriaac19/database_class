package Bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BankService {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");

    public void createClient(String name) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Client client = new Client();
        client.setName(name);
        em.persist(client);
        em.getTransaction().commit();
        em.close();
    }

    public void createAccount(Long idClient, Long balance) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Account account = new Account();

        //finding client with the id given
        Client client = em.find(Client.class, idClient);
        account.setClient(client);
        account.setBalance(balance);

        em.persist(account);
        em.getTransaction().commit();
        em.close();

    }

    public void createBank(String name) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Bank bank = new Bank();
        bank.setName(name);
        em.persist(bank);
        em.getTransaction().commit();
        em.close();
    }


    public void withdraw(Long idAccount, Long value) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        //finding account with the id given
        Account account = em.find(Account.class, idAccount);
        account.withdraw(value);

        em.getTransaction().commit();
        em.close();
    }


}
