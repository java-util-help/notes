/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Admin
 */
public class InterestAccount extends BasicAccount{
    
    public InterestAccount(String name,double balance)
    {
        super(name,balance);
        interestPercent = 7;
    }

    @Override
    public void methodTest() {

    }

   @Override
    public void writeType() {
        System.out.println("Interest Account");
    }
}
