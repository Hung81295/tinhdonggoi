package Temperature;

public class Temperature {
    private double celsius;

    Temperature(double celsius) {
        if (celsius < -273.15) {
            System.out.println("Không có nhiệt độ thấp hơn độ 0 tuyệt đối!");
            this.celsius = 0;
        } else {
            this.celsius = celsius;
        }
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius < -273.15) {
            System.out.println("Không có nhiệt độ thấp hơn độ 0 tuyệt đối!");
            this.celsius = 0;
        } else {
            this.celsius = celsius;
        }
    }

    public double toFahrenheit() {
        return celsius * 9.0 / 5 + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        Temperature t = new Temperature(40);
        System.out.println("Khi nhiệt độ là " + t.getCelsius() + " độ C, thì sẽ là " + t.toFahrenheit() + " độ F và " + t.toKelvin() + " độ K");
        t.setCelsius(-300);
    }
}

