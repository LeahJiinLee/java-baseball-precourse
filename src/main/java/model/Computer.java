package model;

import java.util.ArrayList;
import nextstep.utils.Randoms;

public class Computer {
    public ArrayList<Integer> computerNumberGenerator(){
        ArrayList<Integer> numbers = new ArrayList<>();
        while (numbers.size()<3){
            int randomNumber = Randoms.pickNumberInRange(1,9);
            if (!numbers.contains(randomNumber)){
                numbers.add(randomNumber);
            }
        }
        System.out.println(numbers);
    return numbers;
    }
}
