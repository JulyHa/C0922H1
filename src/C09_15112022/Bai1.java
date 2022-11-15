package C09_15112022;

import java.util.*;
import java.util.List;

public class Bai1 {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhập số lượng phần tử: ");
//        int n = scanner.nextInt();
//
//        for(int i = 0; i < n; i++){
//            list.add(scanner.nextInt());
//        }
//
//        // tính
//        Set<Integer> set = new HashSet<>();
//        for(int value : list){
//            set.add(value);
//        }
//        for (int value : set){
//            int count = 0;
//            for(int valueList : list){
//                if(value == valueList){
//                    count++;
//                }
//            }
//            System.out.println(value + " xuất hiện " + count +" lần");
//        }
//
//    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }

        // Map
        Map<Integer, Integer> map = new HashMap<>();
        for(int key : list){
            if(map.get(key) == null){
                map.put(key, 1);
            }
            else {
                map.put(key, map.get(key)+1);
            }
        }
        for (int key : map.keySet()){  // keySet() : lấy ra tất cả key của map
            System.out.println(key + " xuất hiện " + map.get(key) + " lần");
        }

    }
}
