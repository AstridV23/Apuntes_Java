package ejercicios_POO.Complex;

public class MyComplex {
    double real = 0.0;
    double imag = 0.0;

    public MyComplex() {}
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        System.out.println(real+imag);
    }

    @Override
    public String toString() {
        return "MyComplex{" +
                "real=" + real +
                ", imag=" + imag +
                '}';
    }

    public boolean isReal(){
        return true;
    }

    public boolean isImaginary(){
        return false;
    }

    // terminar
}
