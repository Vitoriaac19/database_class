package Bank;

public class Main {

    public static void main(String[] args) {
        BankService bankService = new BankService();

        bankService.createClient("John Doe");
        bankService.createClient("Anna Mae");
        bankService.createAccount(1L, 2000L);
        bankService.createAccount(2L, 30000L);


        bankService.createBank("Santander");


    }
}
