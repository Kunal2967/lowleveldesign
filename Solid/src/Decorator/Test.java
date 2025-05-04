package Decorator;

public class Test {
    public static void main(String[] args){


        BasePIzza farmHousePizza=new FarmHouse();
       BasePIzza b=new ExtraCheese(farmHousePizza);
        System.out.println(b.getcost());

            BasePIzza delux=new Mushroomtoppings(new ExtraCheese(farmHousePizza));
        System.out.println(delux.getcost());
    }
}
