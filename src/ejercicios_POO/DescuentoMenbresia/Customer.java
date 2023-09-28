package ejercicios_POO.DescuentoMenbresia;

public class Customer {
    String name;
    boolean member = false;
    String menberType;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember(){
        return true;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMenberType() {
        return menberType;
    }

    public void setMenberType(String menberType) {
        this.menberType = menberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", menberType='" + menberType + '\'' +
                '}';
    }
}
