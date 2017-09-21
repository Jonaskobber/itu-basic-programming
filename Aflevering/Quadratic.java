import java.lang.Math;

public class Quadratic
{
    private double a;
    private double b;
    private double c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void show() {
        System.out.println(a + "x^2 + " + b + "x - " + c);
    }
    
    public double compute(double x) {
        return Math.pow(this.a * x, 2) + this.b * x + this.c;
    }
    
    public void solve() {
        double d = Math.pow(this.b, 2) - 4 * this.a * this.c;
        if (d < 0) {
            System.out.println("There is no solution");
        } else if (d == 0) {
            System.out.println("The solution is 0");
        } else {
            System.out.println("There are two solutions");
            System.out.println((-this.b + Math.sqrt(d))/2 * this.a);
            System.out.println((-this.b - Math.sqrt(d))/2 * this.a);
        }
    }
    
    public void superSolve() {
        if (this.a == 0) {
            System.out.println("The solution is: " + (-this.c) / this.b);
        } else {
            this.solve();
        }
    }
    
    public void robustSolve() {
        if (this.a == 0 && this.b == 0) {
            System.out.println("The solution is 0");
        } else if (this.a == 0) {
            System.out.println("The solution is: " + (-this.c) / this.b);
        } else {
            this.solve();
        }
    }
}
