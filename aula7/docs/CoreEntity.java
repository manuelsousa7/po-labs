/**
 * This class is the single core entity of this small example. It holds a list of int numbers.
 **/

import java.util.List;
import java.util.ArrayList;

public class CoreEntity {
    private List<Integer> _numbers;

    public CoreEntity() {
        _numbers = new ArrayList<>();
    }

    public void addNumber(Integer n) {
        _numbers.add(n);
    }

    public List<Integer> getNumbers() {
        return _numbers;
    }
}
