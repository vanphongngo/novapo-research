import java.util.*;

class Demo {

    public static List<Integer> mostAppearedDigits(List<Integer> nums) {
        // [25, 2, 3, 57, 38, 41]

        Map<Integer,Integer> maps = new HashMap<>();

        Integer maxApear = 0;

        for (int i =0;i<nums.size();i++) {
            Integer num = nums.get(i);
            while (num > 0) {
                Integer digit = getLastDigit(num);
                num = num / 10;
                if (maps.get(digit) != null) {
                    maps.put(digit, maps.get(digit) +1);
                    if (maps.get(digit) > maxApear) maxApear = maps.get(digit);
                } else {
                    maps.put(digit, 1);
                }
            }
        }

        List<Integer> results = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry : maps.entrySet())   {
            if (entry.getValue().equals(maxApear)) results.add(entry.getKey());
        }

        return results;
    }

    public static int getLastDigit(int number) {
        return number % 10;
    }


    public static void main(String[] args) {
        List<Integer> nums = List.of(25, 2, 3, 57, 38, 41);
        List<Integer> nums2 = List.of(29, 2, 3, 579, 7, 38, 41, 10);
        List<Integer> results= mostAppearedDigits(nums2);
        for (int i =0;i<results.size();i++) {
            System.out.print(results.get(i) + " ");
        }
    }


}