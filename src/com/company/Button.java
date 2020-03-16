package com.company;

import java.util.Scanner;

public class Button extends Controls{
   public Button (Scanner scanner){super(scanner);
   }
   @Override
   public void nhap(){
      System.out.println("Nhap Button");
      System.out.println("Chon 1: Button image\nChon 2: Button text");
      int choiceButton = scanner.nextInt();
      while (choiceButton < 1 || choiceButton > 2){
         System.out.println("Input is not valid. Please enter either '1' or '2'");
         choiceButton = scanner.nextInt();
      }
      if (choiceButton ==1){
         setColorText(0);
         setColorBackground(0);
         setText("");
         System.out.println("Skip");
      }
      else if (choiceButton == 2){
         super.nhap();
      }
   }
}