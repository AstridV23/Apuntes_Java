package vector;

public class vector {

    private int x;
    private int y;
    private int z;

    public vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //public vector.vector mult(int k){
    //vector.vector vectorn=new vector.vector(x*k, y*k,z*k);
    //return  vectorn;
    //}
    @Override
    public String toString() {
        return "{" + x + "," + y + "," + z + '}';
    }

    public int mult(int k,vector v2){
        v2.x = this.x * k;
        v2.y = this.y * k;
        v2.z = this.z * k;
        System.out.println(v2.toString());
        return 1;
    }

    public int  sumar(vector v){
        if ((v.x==0 && this.x==0)&&(v.y==0 && this.y==0)&&(v.z==0 && this.z==0)){
            System.out.println("error.No tienen la misma cantidad de elementos");
            System.out.println(v.toString());

        }else{
            vector c=new vector(this.x+v.x,this.y+v.y,this.z+v.z);
            System.out.println(c.toString());
        }
        return 1;
    }
}