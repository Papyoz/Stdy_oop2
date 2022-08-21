package code;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PT pt1 = new PT();
        PT pt2 = new PT(1, 2);
        System.out.println("x = " + pt1.x + "\ny = " + pt1.y + "\ncolor = " + pt1.color);
        System.out.println("x = " + pt2.x + "\ny = " + pt2.y + "\ncolor = " + pt2.color);
    }
}
class PT{
    int x, y;//Именно их можно добыть обращаясь к классу
    byte color;

    //ИНИЦИАЛИЗАТОР
    {
        x = -1; y = -1;
        color = 100; // Вместо PT
    }
    PT(){
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
    }
    PT(int x, int y){//
        this();
        this.x = x; this.y = y;//this выделяет переменную как вне локальную
        // THIS ССЫЛАЕТСЯ НА СЕБЯ ЖЕ, КАК ССЫЛАЛСЯ БЫ НА КЛАСС PT!!!
    }
}
/*
13
14
54
34
x = 13
y = 14
color = 100
x = 1
y = 2
color = 100
 */
