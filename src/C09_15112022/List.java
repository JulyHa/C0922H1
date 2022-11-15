package C09_15112022;


import java.util.ArrayList;

public class List {
    ArrayList<String> list = new ArrayList<>();

    void them(String t){
        list.add(t);
    }

    void show(){
        for(int i =0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
