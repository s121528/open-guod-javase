package ch08_strategy.base;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 */
public class CatWeightComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Cat cat1 = (Cat) o1;
        Cat cat2 = (Cat) o2;
        if (cat1.getWeigh() > cat2.getWeigh())
            return -1;
        else if (cat1.getWeigh() < cat2.getWeigh())
            return 1;
        return 0;
    }
}
