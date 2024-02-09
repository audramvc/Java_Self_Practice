package java_day_11_practice;

public class Carpet {

   public double width;
   public double length;
   public double unitPrice;
   public boolean isPersian;


    public void carpetInfo(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {
        if (isPersian == true) {
            double totalCost =  ((width * length) * unitPrice) + 200;
            return totalCost;
        } else if (!isPersian) {
            double totalCost = (width * length) * unitPrice;
            return totalCost;
        }
        return 0;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalCost=" + calcCost() +
                '}';
    }
}
