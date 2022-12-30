
/**
 * Represents the Bank Account class.
 * @author Alejandra Guadir 
 */

public class BankAccount {

    /**
     *Represents the account number.
     */
    private int accountNumber;
    /**
     *  Represents the statement of account
     */
    protected boolean activated;
    /**
     * Returns the account statement in boolean format.
     * @return  boolean representing activated
     * 
     */
        public boolean isActivated() {
        return activated;
    }
    /**
     * Set a new statement from a boolean.
     * @param activated
     * Boolean representing activated.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }



    
}
