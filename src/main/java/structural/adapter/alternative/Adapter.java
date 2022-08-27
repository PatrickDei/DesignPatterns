package structural.adapter.alternative;

import java.util.Set;
import java.util.stream.Collectors;

interface FruitService {
    Set<String> getFruits();
}

class FruitServiceImpl implements FruitService {

    @Override
    public Set<String> getFruits() {
        return Set.of("apple", "banana", "mango");
    }
}

class FruitsToDisplayAdapter {
    private final FruitService fruitService;

    public FruitsToDisplayAdapter(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    public String getFruits() {
        return String.join(", ", this.fruitService
                .getFruits());
    }

    public static void main(String[] args) {
        FruitService fruitService = new FruitServiceImpl();
        FruitsToDisplayAdapter fruitsToDisplayAdapter = new FruitsToDisplayAdapter(fruitService);
        System.out.println(fruitsToDisplayAdapter.getFruits());
    }
}