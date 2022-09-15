package Lesson16;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();   //конструктор без параметров здесь сработал
        f1.print(); //выводит 0/1

        f1.setNom(1); //вводит числитель 1
        f1.setDenom(2); // вводит числитель 2
        f1.print(); // f1 = 1/2 выводит это

        Fraction f2 = new Fraction(2,5);    //справа можно вызвать любой конструктор
        f2.print(); // f2 = 2/5 выводит это

        Fraction f3 = f1.mul(f2); // в f3 присваивает метод mul(умножение) между f1=1/2 и f2= 2/5
        f3.print(); //выводит f3

        Fraction f4 = f1.del(f2); // в f4 присваивает метод del между f1 и f2
        f4.print(); //выводит f4

        Fraction f5 = f1.summ(f2);
        f5.print();

        Fraction f6 = f1.vichit(f2);
        f6.print();

        Ricar ric = new Ricar ();
        ric.print();

    }
}
