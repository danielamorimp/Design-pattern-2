/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ranking;

/**
 *
 * @author Administrador
 */
public class Tempo {
    private static Tempo instance;

    private Tempo() {

    }

    public synchronized static Tempo getInstance() {
        if (instance == null) {
            instance = new Tempo();
        }
         System.out.println("Daniel 17min");
         System.out.println("Gabriel 15min");
        return instance;
    }
}
