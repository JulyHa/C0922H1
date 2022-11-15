package C09_15112022;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/// 0 1 2 3 4 5
/// 2 3 4 6 5 6
public class Bai2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }

        System.out.print("Nhập vị trí cần thêm vào: ");
        int index = scanner.nextInt();
        System.out.print("Nhập giá trị cần thêm: ");
        int value = scanner.nextInt();
        list.add(1);

        for(int i = n; i >= index; i--){
            list.set(i, list.get(i-1));
        }
        list.set(index, value);
        for (int i:list){
            System.out.println(i);
        }
    }
}
