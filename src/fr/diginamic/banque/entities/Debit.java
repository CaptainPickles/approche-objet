package fr.diginamic.banque.entities;

public class Debit extends Operation{
    public Debit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public double calcul(Operation[] array) {
        double result=0;
        for(Operation element : array){
            if(element.getType() == "DEBIT") {
                result = element.getMontant() - result;
            }else if(element.getType() == "CREDIT"){
                result = element.getMontant() + result;
            }
        }
        return result;
    }

    @Override
    public String getType() {
        return "DEBIT";
    }
}
