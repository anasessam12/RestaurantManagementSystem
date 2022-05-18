
package Interfaces;

import Repositories.*;

public interface BillingInterface {
    
    public float totalPrice(MealsRepository meal, OrderRepository order, BillingRepository billing);
    
}
