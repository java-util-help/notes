/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Admin
 */
public class Accounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BasicAccount[] array = new BasicAccount[4];

        array[0] = new RegularAccount("Ahmet", 0);
        array[1] = new InterestAccount("Mehmet", 10);
        array[2] = new CheckingAccount("Mustafa", 20);
        array[3] = new CDAccount("Hakan", 30);

        for(int counter=0; counter<array.length; counter++) {
            System.out.println(array[counter].getBalance());

            if(array[counter] instanceof MinimumAccount) {
                System.out.println(((MinimumAccount)array[counter]).penaltyAmount);
            }

            if(array[counter] instanceof IGetType) {
                ((IGetType)array[counter]).writeType();
            }
        }
        
       /* CDAccount obj1 = new CDAccount("ahmet", 1010.0);
        obj1.montlyUpdate();
        System.out.println(obj1.getBalance());//1000
        obj1.withdrow(950);
        System.out.println(obj1.getBalance());//40
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        System.out.println(obj1.getBalance());//36*/
        
        
        // BasicAccount test = new BasicAccount("Bora", 123);
        // şeklinde yapılamaz çünkü abstract tipinde tanımlandı.
    
        // ama değişkeni oluşturulabilir
        BasicAccount test = new CheckingAccount("Hakan", 0); // poli konusu

        MinimumAccount test2 = new RegularAccount("Ayşe", 10);
    
        // test2 = test;
        // böyle bir atama yapılamaz, çünkü test2 minimum türünde ve o alt dal

        // test = test2;
        // yapılabilir.

        // kendinden daha sub olan birşeymiş gibi tanımlamaz, tabloda yukarı doğru gideriz
   
        BasicAccount obj = new CDAccount("Hakan", 0);
        MinimumAccount obj2 = new RegularAccount("Ayse", 5);
        if(obj instanceof RegularAccount)
            ((RegularAccount)obj).montlyUpdate();
    }
}
