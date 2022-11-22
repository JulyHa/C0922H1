package C09_22112022;

import C09_15112022.Bai3;
import C09_22112022.Model.Account;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Account> accounts = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký");
            System.out.println("0. Thoát");
            int choice;
            do {
                try {
                    System.out.print("Mời nhập lựa chọn: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (InputMismatchException | NumberFormatException e) {
                    System.out.println("Phải nhập số!");
                }
            }while (true);

            switch (choice) {
                case 1:
                    Account account = dangNhap(scanner);
                    if (checkDangNhap(account)) {
                        System.out.println("Đăng nhập thành công!");
                    } else {
                        System.out.println("Đăng nhập thất bại!");
                    }
                    break;
                case 2:
                    dangKy(scanner);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có chức năng này!");
            }
        }

    }

    private static void dangKy(Scanner scanner) {
        String username;
        do {
            System.out.print("Nhập tên tài khoản: ");
            username = scanner.nextLine();
            boolean flag = false;
            for(Account a : accounts){
                if(a.getUserName().equals(username)){
                    System.out.println("Tài khoản đã tồn tại!");
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }while (true);
        String password;
        do {
            System.out.print("Nhập mật khẩu: ");
            password = scanner.nextLine();
            if (password.length() < 6) {
                System.out.println("Mật khẩu không đủ độ dài!");
            } else {
                break;
            }
        } while (true);
        accounts.add(new Account(username, password));
        System.out.println("Đăng ký thành công!");
    }

    private static Account dangNhap(Scanner scanner) {
        System.out.print("Nhập tên tài khoản: ");
        String username = scanner.nextLine();
        String password;
        System.out.print("Nhập mật khẩu: ");
        password = scanner.nextLine();
        Account account = new Account(username, password);
        return account;
    }
    private static boolean checkDangNhap(Account account){
        boolean flag = false;
        for (Account a : accounts){
            if(a.getUserName().equals(account.getUserName()) && a.getPassword().equals(account.getPassword())){
                flag = true;
            }
        }
        return flag;
    }
}
