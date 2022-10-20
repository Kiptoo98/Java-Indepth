public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank(){
        accountOne = new CheckingAccount("Ted", 200, "001");
        accountTwo = new CheckingAccount("Lasso", 150, "002");
    }

    public static void main(String[] args) {
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.getBalance());
        bankOfGods.accountOne.setBalance(1000);
        System.out.println(bankOfGods.accountOne.getBalance());

        System.out.println(bankOfGods.accountTwo.getBalance());
        bankOfGods.accountTwo.setBalance(250);
        System.out.println(bankOfGods.accountTwo.getBalance());
    }
}
