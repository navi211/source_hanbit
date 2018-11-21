package lambdasinaction.chap4;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DishDemo {
    public static void main(String[] args) {
        List<Dish> dishes = Dish.menu;

        List<String> dishNames = dishes.stream()
                .filter(dish ->  dish.getCalories() < 400)
                .sorted((o1,o2) -> {
                        return o1.getCalories() - o2.getCalories();
                    }
                ).map(dish -> dish.getName())
                .collect(Collectors.toList());


        System.out.println(dishNames);


    }

}

/*
class Below implements Predicate<Dish> {

    @Override
    public boolean test(Dish dish) {
        return dish.getCalories() < 400;
    }
}
*/
