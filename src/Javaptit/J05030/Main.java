package Javaptit.J05030;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            float d1 = sc.nextFloat();
            float d2 = sc.nextFloat();
            float d3 = sc.nextFloat();
            sc.nextLine();
            arr.add(new SinhVien(ma,ten,lop,d1,d2,d3));
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });

        for(int i = 0;i<arr.size();i++){
            System.out.println((i + 1 + " ")+ arr.get(i));
        }
    }
}

