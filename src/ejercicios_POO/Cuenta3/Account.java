package ejercicios_POO.Cuenta3;

public class Account {
    String id;
    String name;
    int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        // Verifica que la cantidad sea positiva antes de realizar la operación
        if (amount < 0) {
            System.out.println("La cantidad no puede ser negativa.");
            return 0; // O devuelve otro valor apropiado en tu caso
        }

        balance += amount;

        return balance;
    }

    public int debit(int amount){

        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Amount exceeded balance");
        }

        return balance;
    }

    public int transferTo(Account another, int amount){
        if(amount <= balance){
            another.balance += amount;
        }else {
            System.out.println("Amount exceeded balance");
        }
        return another.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
