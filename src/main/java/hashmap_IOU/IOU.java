package hashmap_IOU;

import java.util.Collection;
import java.util.HashMap;

/**
 * Hashmaps: Exercise 5
 */

public class IOU {

    private HashMap<String,Double> hashmap;

    public IOU() {
        this.hashmap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        hashmap.put(toWhom, amount);
    }

    public Collection<String> getListOfPeopleOwed() {
        return hashmap.keySet();
    }

    public double howMuchDoIOweTo(String toWhom) {
        return hashmap.get(toWhom);
    }

}
