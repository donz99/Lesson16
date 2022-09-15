package Lesson16;

public class Ricar {
    private int ricHP;
    public void setHP (int fricHP){
        ricHP=fricHP;
    }
}

public class Fraction {
    private int nom;
    private int denom;
    //метод set - записать значение в свойство (поле) класса
    public void setNom(int fNom){
        nom = fNom;
    }
    /*
    public void setNom(int nom){
        this nom = nom;
    }
     */
    public void setDenom(int fDenom){
        if (fDenom <= 0){
            denom = 1;
        }
        else {
            denom = fDenom;
        }
    }
    public Fraction (){  //конструктор
        nom = 0;
        denom = 1;
    }
    public Fraction(int fNom, int fDenom) {
        nom = fNom;
        denom = fDenom;
    }
    //Метод:
    public void print(){
        System.out.println(nom+"/"+denom);
    }



    public Fraction mul(Fraction f2) { //третья дробь это объект  //1 параметр класса Fraсtion
        Fraction res = new Fraction();  //создаём объект в методе
        res.nom = this.nom * f2.nom;
        res.denom = this.denom * f2.denom;
        return res;
    }

    public Fraction del(Fraction f2) {
        Fraction res = new Fraction();
        res.nom = this.nom * f2.denom;
        res.denom = this.denom * f2.nom;
        return res;
    }

    private Fraction reverse(){
        Fraction res = new Fraction();
        res.nom = this.denom;
        res.denom = this.nom;
        return res;
    }
    public Fraction div2(Fraction f2){
        Fraction res = this.mul(f2.reverse());
        return res;
    }

    public Fraction summ (Fraction f2) {
        Fraction res = new Fraction();
        res.nom = this.nom*f2.denom + f2.nom*this.denom;
        res.denom = this.denom * f2.denom;
        return res;
    }

    public Fraction vichit (Fraction f5) {
        Fraction res = new Fraction();
        res.nom = this.nom*f5.denom - f5.nom*this.denom;
        res.denom = this.denom * f5.denom;
        return res;
    }

    public
}
