/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Admin
 */
public class RegularAccount extends MinimumAccount {
    
    public RegularAccount(String name, double balance)
    {
        super(name,balance);
        penaltyLimit = 500.00;
    }

    @Override
    public void methodTest() {

    }

    @Override
    public void writeType() {
        System.out.println("Regular Account");
    }
}
