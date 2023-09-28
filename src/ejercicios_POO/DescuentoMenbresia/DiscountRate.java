package ejercicios_POO.DescuentoMenbresia;

public class DiscountRate {
    public double serviceDiscountPremium(){
        return 0.2;
    }

    public double serviceDiscountGold(){
        return 0.15;
    }

    public double serviceDiscountSilver(){
        return 0.1;
    }

    public double productDiscountPremium(){
        return 0.1;
    }

    public double productDiscountGold(){
        return 0.1;
    }

    public double productDiscountSilver(){
        return 0.1;
    }

    public double getServiceDiscountRate(String type){
        return 1.0; // terminar
    }

    public double getProductDiscountRate(String type){
        return 1.0; // terminar
    }
}
