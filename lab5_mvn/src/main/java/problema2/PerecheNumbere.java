package problema2;

public class PerecheNumbere {
    private int x;
    private int y;
    public PerecheNumbere() {}
    public PerecheNumbere(int a, int b) {
        super();
        this.x = a;
        this.y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "PerecheNumbere{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public boolean consec_fibonaci() {
        int temp;
        int fib1 = 0;
        int fib2 = 1;
        if (this.x > this.y) {
            temp = x;
            x = y;
            y = x;
        }
        while (true) {
            temp = fib2;
            fib2 = fib1 + fib2;
            fib1 = temp;
            if (fib1 >= x && fib2 >= y) {
                break;
            }


        }
        return x == fib1 && y == fib2;
    }
    public int cmmmc() {
        int i = 1;
        int max;
        while (true) {
            if (i % x == 0 && i % y == 0) {
                return i;
            }
            i++;
        }

    }
    public boolean suma_cifrelor() {
        int a = 0;
        int b = 0;
        while (x > 0 || y > 0) {
            a += x % 10;
            b += y % 10;
            x = x / 10;
            y = y / 10;
        }
        return a == b;
    }

    public boolean cifre_pare() {
        int a = 0;
        int b = 0;
        while (x > 0) {
            if ((x % 10) % 2 == 0) a++;

            x = x / 10;

        }
        while (y > 0) {
            if ((y % 10) % 2 == 0) b++;

            y = y / 10;

        }
        return a == b;
    }
}
