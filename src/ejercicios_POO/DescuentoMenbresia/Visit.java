package ejercicios_POO.DescuentoMenbresia;

import java.util.Date;

public class Visit extends Customer{
    Customer customer;
    Date date;
    double serviceExpense;
    double productExpense;

    public Visit(String name, Date date) {
        super(name);
        this.date = date;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        return serviceExpense + productExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                ", name='" + name + '\'' +
                ", member=" + member +
                ", menberType='" + menberType + '\'' +
                '}';
    }
}
