package com.company;

import java.io.Console;
import java.util.Scanner;

public class Controls{

   private String text;
   private int colorBackground;
   private int colorText;
   protected Scanner scanner;

   public  Controls(Scanner scanner){
      this.scanner = scanner;
   }
   public int getColorBackground() {
      return colorBackground;
   }
   public int getColorText() {
      return colorText;
   }
   public void setColorBackground(int cB) {
      colorBackground = cB;
   }
   public void setColorText(int cT) {
      colorText = cT;
   }

   public String getText() {
      return text;
   }

   public void setText(String text) {
      this.text = text;
   }


 public boolean checkDirectColorMatch(){
      int smaller = Math.min(colorBackground, colorText);
      int larger = Math.max(colorBackground, colorText);
      if (smaller + 6 == larger)
         return true;
      else
         return false;
   }

   public String checkColorMatch(){
      String res = "";
      if (colorBackground == colorText)
         res = "Don sac";
      else {
         int smaller = Math.min(colorBackground, colorText);
         int larger = Math.max(colorBackground, colorText);
      
         if (smaller + 1 == larger)
            res = "Tuong dong";
         else if (smaller + 6 == larger)
            res = "Truc tiep ";
         else
            res = "Khong phu hop voi bat ki quy tac phoi mau nao";
      }
   
      return res;
   
   
   }
   
  public void nhap(){
     System.out.print("Nhap text: ");
     text = scanner.next();
     System.out.print("Chon mau nen: ");
     colorBackground = nhapColor();
     System.out.print("Chon mau text: ");
     colorText = nhapColor();
  }

  private boolean isValidColorInput(int value){
      return value >= 1 && value <= 12;
  }

  private int nhapColor(){
     System.out.println("Chon mau bang so duoi day: \n 1.Red 2.Orange 3.Yellow 4.Spring Green \n 5.Green 6.Turquoise 7.Cyan 8.Ocean \n 9.Blue 10.Violet 11.Magenta 12. Raspberry");
     System.out.print("Hay chon gia tri mau: ");
     int inputColor = scanner.nextInt();
     while (isValidColorInput(inputColor) == false){
        System.out.println("Invalid value. Please input a number between 1 and 12: ");
        inputColor = scanner.nextInt();
     }
     return inputColor;
  }
/*public String checkTypeMatch (Control c){
{*/

}