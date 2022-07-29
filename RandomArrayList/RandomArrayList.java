package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    public Object getRandomElement(){
        Random random = new Random();
        int index = random.nextInt(super.size());
        Object element = super.get(index);
        super.remove(index);
        return element;
    }
}
