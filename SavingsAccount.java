public class SavingsAccount extends BankAccount
{
    private double rate = 0.025;
    private int savingsNumber = 0;
    private String accountNumber;

    /**standard constructor
	@param name the owner of the account
	@param amount the beginning balance*/
    public SavingsAccount(String name, double balance)
    {
        super(name, balance);
        accountNumber = super.getAccountNumber();
    }

  /**copy constructor creates another  savings account for the same owner
	@param originalSavingsAccount the original account with information to copy
	@param initialBalance beginning balance of the new account*/
	public SavingsAccount(SavingsAccount originalSavingsAccount, double initialBalance)
	{
		super(originalSavingsAccount, initialBalance);
        accountNumber = super.getAccountNumber();
        savingsNumber = originalSavingsAccount.savingsNumber + 1;
	}

    public void postInterest()
    {
        double monthlyRate = (getBalance() * rate) / 12;
        double savingsBalance = getBalance() + monthlyRate;
        setBalance(savingsBalance);
    }

    @Override
    /**accessor method to account number
	@return the account number*/
	public String getAccountNumber()
	{
		return accountNumber + "-" + savingsNumber;
	}



}
