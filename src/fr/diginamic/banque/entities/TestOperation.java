package fr.diginamic.banque.entities;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] arrayOperation = new Operation[4];
        Debit op1 = new Debit("26/01/2000" , 10);
        Debit op2 = new Debit("26/01/2000" , 20);
        Credit op3 = new Credit("26/01/2000" , 10);
        Credit op4 = new Credit("26/01/2000" , 10);
        arrayOperation[0] =op1;
        arrayOperation[1] = op2;
        arrayOperation[2] = op3;
        arrayOperation[3] = op4;
        for(Operation element : arrayOperation){
            System.out.println(element.getDate());
            System.out.println(element.getMontant());
            System.out.println( element.getType());
        }
        System.out.println(op1.calcul(arrayOperation));
    }
}
