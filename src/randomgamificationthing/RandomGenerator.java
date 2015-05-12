   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomgamificationthing;

import java.util.Random;

/**
 *
 * @author Trevor
 */
public class RandomGenerator {
    
    Random r;
    public RandomGenerator(){
        r = new Random();
    }
    
    public double newRand(){
       
        return r.nextDouble();
    }
}
