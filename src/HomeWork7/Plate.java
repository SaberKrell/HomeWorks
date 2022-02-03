package HomeWork7;

public class Plate {
    private int foodQuantity;

    Plate(int foodQuantity){
        if ( foodQuantity < 0 ) this.foodQuantity = 0;
        else if( foodQuantity > 100) this.foodQuantity = 100;
        else this.foodQuantity = foodQuantity;
    }

    public int getFoodQuantity(int i) {
        return foodQuantity -=i;
    }

    public void setFoodQuantity(int setFoodQuantity) {
        if (setFoodQuantity < 0){
            System.out.println("Значение еды не может быть отрицательным!");
        }else if ( foodQuantity + setFoodQuantity > 100){
            this.foodQuantity = 100;
            System.out.println("Вы положили " + setFoodQuantity + " еды - это слишком много, часть просыпалась");
        } else if (setFoodQuantity <= 100 && setFoodQuantity > 0) foodQuantity += setFoodQuantity;
    }
    public int plateInfo(){
        return foodQuantity;
    }
}
