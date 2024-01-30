package lambda.predicateL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class MainTest {

    private static final List<Integer> list = List.of(1, 2, 3, 4, 5, 85, 69, 52, 45);
    FactoryA factoryA = new FactoryA();

    @Test
    @DisplayName("Get values regarding predicate condition")
    public void createObjectByPredicate() {
        List<A> result = factoryA.someFunction(a -> a.getValue() <= 3, list);

        org.assertj.core.api.Assertions.assertThat(result).allSatisfy(res -> {
            org.assertj.core.api.Assertions.assertThat(res.getValue()).isLessThanOrEqualTo(3);
        });
    }
}