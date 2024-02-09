package java_day_11_practice;

public class Pizza {

   public String size;
   public int numberOfCheeseTopping;
   public int numberOfPepperoniTopping;

    public void pizzaInfo(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){

        if(size.equalsIgnoreCase("small")){
            double totalCost = 10 +(2 * numberOfPepperoniTopping) + (2 * numberOfCheeseTopping);
            return totalCost;
        }else if(size.equalsIgnoreCase("medium")){
            double totalCost = 12 + (2 * numberOfPepperoniTopping) + (2 * numberOfCheeseTopping);
            return totalCost;
        }else if(size.equalsIgnoreCase("large")){
            double totalCost = 14 + (2 * numberOfPepperoniTopping) + (2 * numberOfCheeseTopping);
            return totalCost;
        }

        return 0;

    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalCost=" + calcCost() +
                '}';
    }
}

