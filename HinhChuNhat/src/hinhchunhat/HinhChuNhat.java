package hinhchunhat;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        float width, heigh;
        Scanner scanner=new Scanner(System.in);
        width=scanner.nextFloat();
        heigh=scanner.nextFloat();
        float area=width*heigh;
        System.out.println("Dien tich hinh chu nhat: "+area);
    }   
}
