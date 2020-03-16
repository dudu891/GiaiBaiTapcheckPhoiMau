package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner scan = new Scanner (System.in).useDelimiter("\n");
        System.out.print("Nhap so luong thanh phan: ");
        int numControls = scan.nextInt();
        ArrayList<Controls> al = new ArrayList<Controls>();

        for (int i = 1; i<=numControls; i++){
            System.out.println("Chon 1:nhap label \nChon 2: nhap button");
            int choice = scan.nextInt();
            while (choice < 1 || choice > 2){
                System.out.println("Input is not valid. Please enter either '1' or '2'");
                choice = scan.nextInt();
            }
            if (choice == 1){
                Label l = new Label(scan);
                l.nhap();
                al.add(l);
            }
            else if (choice == 2){
                Button button = new Button(scan);
                button.nhap();
                al.add(button);
            }
        }

        if (al.get(0).checkDirectColorMatch())
            System.out.println("Thanh phan dau tien co mau text va background phu hop quy tac phoi mau bo tuc truc tiep");
        else
            System.out.println("Thanh phan dau tien co mau text va background khong phu hop quy tac phoi mau bo tuc truc tiep");


        for (int i = 0; i<al.size(); i++){
            System.out.println("Thanh phan " + (i+1) + " theo nguyen tac mau: " + al.get(i).checkColorMatch());


        }
        scan.close();
    }
}
