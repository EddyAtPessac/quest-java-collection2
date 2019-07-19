import java.util.Comparator;

public class AgeSorter implements Comparator<Hero> {

    @Override
    public int compare(Hero o1, Hero o2) {
        // this is why the ternal operator isn't recommended
        // because this code isn't very clean !
        int result = o1.getAge() == o2.getAge() ? 0 :
                o1.getAge() < o2.getAge() ? 1 : -1;
        return result;
    }
}
