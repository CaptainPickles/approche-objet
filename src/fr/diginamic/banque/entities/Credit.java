package fr.diginamic.banque.entities;

public class Credit extends Operation{
    public Credit(String date, double montant) {
        super(date, montant);
    }
    @Override
    public String getType() {
        return "CREDIT";
    }

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
}
