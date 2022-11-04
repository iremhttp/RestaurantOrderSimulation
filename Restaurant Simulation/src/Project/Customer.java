package Project;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;

public class Customer {
    public static ArrayList<ArrayList<Double>>AllTheFoodRates=new ArrayList<ArrayList<Double>>();
    //STARTERS
    public static ArrayList<Double> RateOfFriedFries=new ArrayList<Double>();

    public static ArrayList<Double> RateOfMeatBall=new ArrayList<Double>();
    public static ArrayList<Double> RateOfCheeseCrepes=new ArrayList<Double>();
    public static ArrayList<Double> RateOfOnionRings=new ArrayList<Double>();
    public static ArrayList<Double> RateOfBuffaloChickenWings=new ArrayList<Double>();
    //MAIN DISHES
    public static ArrayList<Double> RateOfCheeseburger=new ArrayList<Double>();
    public static ArrayList<Double> RateOfChickenMeatBurger=new ArrayList<Double>();
    public static ArrayList<Double> RateOfBeefMeatBurger=new ArrayList<Double>();
    public static ArrayList<Double> RateOfVeganBurger=new ArrayList<Double>();
    public static ArrayList<Double> RateOfBeefSteak=new ArrayList<Double>();
    public static ArrayList<Double> RateOfChickenCordonBleu=new ArrayList<Double>();
    public static ArrayList<Double> RateOfChickenNoodle=new ArrayList<Double>();
    public static ArrayList<Double> RateOfSalmon=new ArrayList<Double>();
    public static ArrayList<Double> RateOfDonerKebab=new ArrayList<Double>();
    public static ArrayList<Double> RateOfAdanaKebab=new ArrayList<Double>();
    public static ArrayList<Double> RateOfPizzaMargherita=new ArrayList<Double>();
    public static ArrayList<Double> RateOfPizzawithbeef=new ArrayList<Double>();
    //SOUPS
    public static ArrayList<Double> RateOfTomatoSoup=new ArrayList<Double>();
    public static ArrayList<Double> RateOfChickenSoup=new ArrayList<Double>();
    public static ArrayList<Double> RateOfChhesyPotatoSoup=new ArrayList<Double>();
    public static ArrayList<Double> RateOfSmokyHamandSplitPeaSoup=new ArrayList<Double>();
    //DESSERTS
    public static ArrayList<Double> RateOfBananaChocolate=new ArrayList<Double>();
    public static ArrayList<Double> RateOfButteryRaspberryCrumbleBars=new ArrayList<Double>();
    public static ArrayList<Double> RateOfUltimateGooeyBrownies=new ArrayList<Double>();
    public static ArrayList<Double> RateOfSaltedCaramelChocolateTart=new ArrayList<Double>();
    //DRINKS
    public static ArrayList<Double> RateOfAyran=new ArrayList<Double>();
    public static ArrayList<Double> RateOfCoffee=new ArrayList<Double>();
    public static ArrayList<Double> RateOfSoftDrinks=new ArrayList<Double>();
    public static ArrayList<Double> RateOfTea=new ArrayList<Double>();
    public static ArrayList<Double> RateOfWine=new ArrayList<Double>();
    public static ArrayList<Double> RateOfLemonade=new ArrayList<Double>();
    //SALADS
    public static ArrayList<Double> RateOfTunaSalad=new ArrayList<Double>();
    public static ArrayList<Double> RateOfChickenSalad=new ArrayList<Double>();
    public static ArrayList<Double> RateOfCaesarSalad=new ArrayList<Double>();


    public static double totalFriedFries=0;
    public static double totalMeatBall=0;
    public static double totalCheeseCrepes=0;
    public static double totalOnionRings=0;
    public static double totalBuffaloChickenWings=0;

    public static double totalCheeseburger=0;
    public static double totalChickenMeatBurger=0;
    public static double totalBeefMeatBurger=0;
    public static double totalVeganBurger=0;
    public static double totalBeefSteak=0;
    public static double totalChickenCordonBleu=0;
    public static double totalChickenNoodle=0;
    public static double totalSalmon=0;
    public static double totalDonerKebab=0;
    public static double totalAdanaKebab=0;
    public static double totalPizzaMargherita=0;
    public static double totalPizzawithbeef=0;

    public static double totalTomatoSoup=0;
    public static double totalChickenSoup=0;
    public static double totalChhesyPotatoSoup=0;
    public static double totalSmokyHamandSplitPeaSoup=0;

    public static double totalBananaChocolate=0;
    public static double totalButteryRaspberryCrumbleBars=0;
    public static double totalUltimateGooeyBrownies=0;
    public static double totalSaltedCaramelChocolateTart=0;

    public static double totalAyran=0;
    public static double totalCoffee=0;
    public static double totalSoftDrinks=0;
    public static double totalTea=0;
    public static double totalWine=0;
    public static double totalLemonade=0;

    public static double totalTunaSalad=0;
    public static double totalChickenSalad=0;
    public static double totalCaesarSalad=0;


    public static double sumA;

    public static void SetSumA(double sum) {

        sumA = sum;
    }

    public static double GetSumA() {
        return sumA;
    }

    public static void display() {

        System.out.print("Your order costs: " + GetSumA());
        System.out.print("$");

    }

    public static void orders (ArrayList<String>foods,int qua) {
        foods = new ArrayList<>(foods);
        System.out.println("The dishes you've ordered: ");

        for(int i=0;i<foods.size();i++)
            System.out.printf("%s ",foods.get(i));
    }
    public static ArrayList FeedBack(ArrayList<String>foods,int qua,double sum){


        int foodtype;
        double rate;
        for(int i=0;i<foods.size();i++)

        {
            System.out.printf("%s",foods.get(i));
            System.out.println("");
            System.out.println("please rate that food out of 5");
            Scanner feedback=new Scanner(System.in);
            if(feedback.hasNextDouble()) {
                rate = feedback.nextDouble();
                if(rate>5) {
                    System.out.println("You Entered Wrong Number");
                    Customer.FeedBack(foods,qua,sum);
                }
                    switch (foods.get(i)) {

                        case ("Fried Fries"):
                            RateOfFriedFries.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfFriedFries);
                            break;
                        case ("Meat Ball"):
                            RateOfMeatBall.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfMeatBall);
                            break;
                        case ("Cheese Crepes"):
                            RateOfCheeseCrepes.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfCheeseCrepes);
                            break;
                        case ("Onion Rings"):
                            RateOfOnionRings.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfOnionRings);
                            break;
                        case ("Buffalo Chicken Wings"):
                            RateOfBuffaloChickenWings.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfBuffaloChickenWings);
                            break;
                        case ("Cheeseburger"):
                            RateOfCheeseburger.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfCheeseburger);
                            break;
                        case ("Chicken Meat Burger"):
                            RateOfChickenMeatBurger.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfChickenMeatBurger);
                            break;
                        case ("Beef Meat Burger"):
                            RateOfBeefMeatBurger.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfBeefMeatBurger);
                            break;
                        case ("Chicken Cordon Bleu"):
                            RateOfChickenCordonBleu.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfChickenCordonBleu);
                            break;
                        case ("Chicken Noodle"):
                            RateOfChickenNoodle.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfChickenNoodle);
                            break;

                        case ("Salmon"):
                            RateOfSalmon.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfSalmon);
                            break;
                        case ("Doner Kebab"):
                            RateOfDonerKebab.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfDonerKebab);
                            break;

                        case ("Adana Kebab"):
                            RateOfAdanaKebab.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfAdanaKebab);
                            break;
                        case ("Pizza Margherita"):
                            RateOfPizzaMargherita.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfPizzaMargherita);
                            break;
                        case ("Pizza With Beef"):
                            RateOfPizzawithbeef.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfPizzawithbeef);
                            break;
                        case ("Tomato Soup"):
                            RateOfTomatoSoup.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfTomatoSoup);
                            break;
                        case ("Chicken Soup"):
                            RateOfChickenSoup.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfChickenSoup);
                            break;
                        case ("Cheesy Potato Soup"):
                            RateOfChhesyPotatoSoup.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfChhesyPotatoSoup);
                            break;
                        case ("Smoky Ham and Split Pea Soup"):
                            RateOfSmokyHamandSplitPeaSoup.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfSmokyHamandSplitPeaSoup);
                            break;
                        case ("Banana Chocolate"):
                            RateOfBananaChocolate.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfBananaChocolate);
                            break;
                        case ("Buttery Raspberry Crumble Bars"):
                            RateOfButteryRaspberryCrumbleBars.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfButteryRaspberryCrumbleBars);
                            break;
                        case ("Ultimate Gooey Brownies"):
                            RateOfUltimateGooeyBrownies.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfUltimateGooeyBrownies);
                            break;
                        case ("Salted Caramel Chocolate Tart"):
                            RateOfSaltedCaramelChocolateTart.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfSaltedCaramelChocolateTart);
                            break;
                        case ("Ayran"):
                            RateOfAyran.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfAyran);
                            break;
                        case ("Coffee"):
                            RateOfCoffee.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfCoffee);
                            break;
                        case ("Soft Drinks"):
                            RateOfSoftDrinks.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfSoftDrinks);
                            break;
                        case ("Tea"):
                            RateOfTea.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfTea);
                            break;
                        case ("Wine"):
                            RateOfWine.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfWine);
                            break;
                        case ("Lemonade"):
                            RateOfLemonade.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfLemonade);
                            break;
                        case ("Tuna Salad"):
                            RateOfTunaSalad.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfTunaSalad);
                            break;
                        case ("Chicken Salad"):
                            RateOfChickenSalad.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfChickenSalad);
                            break;
                        case ("Caesar Salad"):
                            RateOfCaesarSalad.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfCaesarSalad);
                            break;
                        case ("Vegan Burger"):
                            RateOfVeganBurger.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfVeganBurger);
                            break;
                        case ("Beef Steak"):
                            RateOfBeefSteak.add(rate);
                            AllTheFoodRates.add((ArrayList) RateOfBeefSteak);
                            break;
                    }


                }
            else {
                System.out.println("Invalid input");
            }
        }
        return AllTheFoodRates;



    }


    public static double AvarageOfFriedFries() {

totalFriedFries=0;
        for (int i = 0; i < RateOfFriedFries.size(); i++) {
            totalFriedFries += RateOfFriedFries.get(i);
        }
        if(RateOfFriedFries.isEmpty()){
            return 0;
        }
        else
        return totalFriedFries/RateOfFriedFries.size();

    }

    public static double AvarageOfMeatBall() {

        for (int i = 0; i < RateOfMeatBall.size(); i++) {
            totalMeatBall += RateOfMeatBall.get(i);
        }
        if(RateOfMeatBall.isEmpty()){
            return 0;
        }
        else
        return totalMeatBall/RateOfMeatBall.size();
    }
    public static double AvarageOfCheeseCrepes() {

        for (int i = 0; i < RateOfCheeseCrepes.size(); i++) {
            totalCheeseCrepes += RateOfCheeseCrepes.get(i);
        }
        if(RateOfCheeseCrepes.isEmpty()){
            return 0;
        }
        else
        return totalCheeseCrepes/RateOfCheeseCrepes.size();
    }
    public static double AvarageOfOnionRings() {

        for (int i = 0; i < RateOfOnionRings.size(); i++) {
            totalOnionRings += RateOfOnionRings.get(i);
        }
        if(RateOfOnionRings.isEmpty()){
            return 0;
        }
        else
        return totalOnionRings/RateOfOnionRings.size();
    }
    public static double AvarageOfBuffaloChickenWings() {

        for (int i = 0; i < RateOfBuffaloChickenWings.size(); i++) {
            totalBuffaloChickenWings += RateOfBuffaloChickenWings.get(i);
        }
        if(RateOfBuffaloChickenWings.isEmpty()){
            return 0;
        }
        else
        return totalBuffaloChickenWings/RateOfBuffaloChickenWings.size();
    }
    public static double AvarageOfCheeseburger() {

        for (int i = 0; i < RateOfCheeseburger.size(); i++) {
            totalCheeseburger += RateOfCheeseburger.get(i);
        }
        if(RateOfCheeseburger.isEmpty()){
            return 0;
        }
        else
        return totalCheeseburger/RateOfCheeseburger.size();
    }
    public static double AvarageOfChickenMeatBurger() {

        for (int i = 0; i < RateOfChickenMeatBurger.size(); i++) {
            totalChickenMeatBurger += RateOfChickenMeatBurger.get(i);
        }
        if(RateOfChickenMeatBurger.isEmpty()){
            return 0;
        }
        else
        return totalChickenMeatBurger/RateOfChickenMeatBurger.size();
    }
    public static double AvarageOfBeefMeatBurger() {

        for (int i = 0; i < RateOfBeefMeatBurger.size(); i++) {
            totalBeefMeatBurger += RateOfBeefMeatBurger.get(i);
        }
        if(RateOfBeefMeatBurger.isEmpty()){
            return 0;
        }
        else
        return totalBeefMeatBurger/RateOfBeefMeatBurger.size();
    }
    public static double AvarageOfChickenCordonBleu() {

        for (int i = 0; i < RateOfChickenCordonBleu.size(); i++) {
            totalChickenCordonBleu += RateOfChickenCordonBleu.get(i);
        }
        if(RateOfChickenCordonBleu.isEmpty()){
            return 0;
        }
        else
        return totalChickenCordonBleu/RateOfChickenCordonBleu.size();
    }
    public static double AvarageOfChickenNoodle() {

        for (int i = 0; i < RateOfChickenNoodle.size(); i++) {
            totalChickenNoodle += RateOfChickenNoodle.get(i);
        }
        if(RateOfChickenNoodle.isEmpty()){
            return 0;
        }
        else
        return totalChickenNoodle/RateOfChickenNoodle.size();
    }
    public static double AvarageOfSalmon() {

        for (int i = 0; i < RateOfSalmon.size(); i++) {
            totalSalmon += RateOfSalmon.get(i);
        }
        if(RateOfSalmon.isEmpty()){
            return 0;
        }
        else
        return totalSalmon/RateOfSalmon.size();
    }
    public static double AvarageOfDonerKebab() {

        for (int i = 0; i < RateOfDonerKebab.size(); i++) {
            totalDonerKebab += RateOfDonerKebab.get(i);
        }
        if(RateOfDonerKebab.isEmpty()){
            return 0;
        }
        else
        return totalDonerKebab/RateOfDonerKebab.size();
    }
    public static double AvarageOfAdanaKebab() {

        for (int i = 0; i < RateOfAdanaKebab.size(); i++) {
            totalAdanaKebab += RateOfAdanaKebab.get(i);
        }
        if(RateOfAdanaKebab.isEmpty()){
            return 0;
        }
        else
        return totalAdanaKebab/RateOfAdanaKebab.size();
    }
    public static double AvarageOfPizzaMargherita() {

        for (int i = 0; i < RateOfPizzaMargherita.size(); i++) {
            totalPizzaMargherita += RateOfPizzaMargherita.get(i);
        }
        if(RateOfPizzaMargherita.isEmpty()){
            return 0;
        }
        else
        return totalPizzaMargherita/RateOfPizzaMargherita.size();
    }
    public static double AvarageOfPizzawithbeef() {

        for (int i = 0; i < RateOfPizzawithbeef.size(); i++) {
            totalPizzawithbeef += RateOfPizzawithbeef.get(i);
        }
        if(RateOfPizzawithbeef.isEmpty()){
            return 0;
        }
        else
        return totalPizzawithbeef/RateOfPizzawithbeef.size();
    }
    public static double AvarageOfTomatoSoup() {

        for (int i = 0; i < RateOfTomatoSoup.size(); i++) {
            totalTomatoSoup += RateOfTomatoSoup.get(i);
        }
        if(RateOfTomatoSoup.isEmpty()){
            return 0;
        }
        else
        return totalTomatoSoup/RateOfTomatoSoup.size();
    }
    public static double AvarageOfChickenSoup() {

        for (int i = 0; i < RateOfChickenSoup.size(); i++) {
            totalChickenSoup += RateOfChickenSoup.get(i);
        }
        if(RateOfChickenSoup.isEmpty()){
            return 0;
        }
        else
        return totalChickenSoup/RateOfChickenSoup.size();
    }
    public static double AvarageOfChhesyPotatoSoup() {

        for (int i = 0; i < RateOfChhesyPotatoSoup.size(); i++) {
            totalChhesyPotatoSoup += RateOfChhesyPotatoSoup.get(i);
        }
        if(RateOfChhesyPotatoSoup.isEmpty()){
            return 0;
        }
        else
        return totalChhesyPotatoSoup/RateOfChhesyPotatoSoup.size();
    }
    public static double AvarageOfSmokyHamandSplitPeaSoup() {

        for (int i = 0; i < RateOfSmokyHamandSplitPeaSoup.size(); i++) {
            totalSmokyHamandSplitPeaSoup += RateOfSmokyHamandSplitPeaSoup.get(i);
        }
        if(RateOfSmokyHamandSplitPeaSoup.isEmpty()){
            return 0;
        }
        else
        return totalSmokyHamandSplitPeaSoup/RateOfSmokyHamandSplitPeaSoup.size();
    }
    public static double AvarageOfBananaChocolate() {

        for (int i = 0; i < RateOfBananaChocolate.size(); i++) {
            totalBananaChocolate += RateOfBananaChocolate.get(i);
        }
        if(RateOfBananaChocolate.isEmpty()){
            return 0;
        }
        else
        return totalBananaChocolate/RateOfBananaChocolate.size();
    }
    public static double AvarageOfButteryRaspberryCrumbleBars() {

        for (int i = 0; i < RateOfButteryRaspberryCrumbleBars.size(); i++) {
            totalButteryRaspberryCrumbleBars += RateOfButteryRaspberryCrumbleBars.get(i);
        }
        if(RateOfButteryRaspberryCrumbleBars.isEmpty()){
            return 0;
        }
        else
        return totalButteryRaspberryCrumbleBars/RateOfButteryRaspberryCrumbleBars.size();
    }
    public static double AvarageOfUltimateGooeyBrownies() {

        for (int i = 0; i < RateOfUltimateGooeyBrownies.size(); i++) {
            totalUltimateGooeyBrownies += RateOfUltimateGooeyBrownies.get(i);
        }
        if(RateOfUltimateGooeyBrownies.isEmpty()){
            return 0;
        }
        else
        return totalUltimateGooeyBrownies/RateOfUltimateGooeyBrownies.size();
    }
    public static double AvarageOfSaltedCaramelChocolateTart() {

        for (int i = 0; i < RateOfSaltedCaramelChocolateTart.size(); i++) {
            totalSaltedCaramelChocolateTart += RateOfSaltedCaramelChocolateTart.get(i);
        }
        if(RateOfSaltedCaramelChocolateTart.isEmpty()){
            return 0;
        }
        else
        return totalSaltedCaramelChocolateTart/RateOfSaltedCaramelChocolateTart.size();
    }
    public static double AvarageOfAyran() {

        for (int i = 0; i < RateOfAyran.size(); i++) {
            totalAyran += RateOfAyran.get(i);
        }
        if(RateOfAyran.isEmpty()){
            return 0;
        }
        else
        return totalAyran/RateOfAyran.size();
    }
    public static double AvarageOfCoffee() {

        for (int i = 0; i < RateOfCoffee.size(); i++) {
            totalCoffee += RateOfCoffee.get(i);
        }
        if(RateOfCoffee.isEmpty()){
            return 0;
        }
        else
        return totalCoffee/RateOfCoffee.size();
    }
    public static double AvarageOfSoftDrinks() {

        for (int i = 0; i < RateOfSoftDrinks.size(); i++) {
            totalSoftDrinks += RateOfSoftDrinks.get(i);
        }
        if(RateOfSoftDrinks.isEmpty()){
            return 0;
        }
        else
        return totalSoftDrinks/RateOfSoftDrinks.size();
    }
    public static double AvarageOfTea() {

        for (int i = 0; i < RateOfTea.size(); i++) {
            totalTea += RateOfTea.get(i);
        }
        if(RateOfTea.isEmpty()){
            return 0;
        }
        else
        return totalTea/RateOfTea.size();
    }
    public static double AvarageOfWine() {

        for (int i = 0; i < RateOfWine.size(); i++) {
            totalWine += RateOfWine.get(i);
        }
        if(RateOfWine.isEmpty()){
            return 0;
        }
        else
        return totalWine/RateOfWine.size();
    }
    public static double AvarageOfLemonade() {

        for (int i = 0; i < RateOfLemonade.size(); i++) {
            totalLemonade += RateOfLemonade.get(i);
        }
        if(RateOfLemonade.isEmpty()){
            return 0;
        }
        else
        return totalLemonade/RateOfLemonade.size();
    }
    public static double AvarageOfTunaSalad() {

        for (int i = 0; i < RateOfTunaSalad.size(); i++) {
            totalTunaSalad += RateOfTunaSalad.get(i);
        }
        if(RateOfTunaSalad.isEmpty()){
            return 0;
        }
        else
        return totalTunaSalad/RateOfTunaSalad.size();
    }
    public static double AvarageOfChickenSalad() {

        for (int i = 0; i < RateOfChickenSalad.size(); i++) {
            totalChickenSalad += RateOfChickenSalad.get(i);
        }
        if(RateOfChickenSalad.isEmpty()){
            return 0;
        }
        else
        return totalChickenSalad/RateOfChickenSalad.size();
    }
    public static double AvarageOfCaesarSalad() {

        for (int i = 0; i < RateOfCaesarSalad.size(); i++) {
            totalCaesarSalad += RateOfCaesarSalad.get(i);
        }
        if(RateOfCaesarSalad.isEmpty()){
            return 0;
        }
        else
        return totalCaesarSalad/RateOfCaesarSalad.size();

    }
    public static double AvarageOfVeganBurger(){
        for (int i = 0; i < RateOfCaesarSalad.size(); i++) {
            totalVeganBurger += RateOfVeganBurger.get(i);
        }
        if(RateOfVeganBurger.isEmpty()){
            return 0;
        }
        else
        return totalVeganBurger/RateOfVeganBurger.size();
    }
    public static double AvarageOfBeefSteak(){
        for (int i = 0; i < RateOfBeefSteak.size(); i++) {
            totalBeefSteak += RateOfBeefSteak.get(i);
        }
        if(RateOfBeefSteak.isEmpty()){
            return 0;
        }
        else
        return totalBeefSteak/RateOfBeefSteak.size();
    }







    public static void ShowTheTopDish(ArrayList<ArrayList<Double>>AllTheFoodRates){
        double[]DishCodes;
        String[]NameOfFoods;
        double max;
        String maxName;
        DishCodes=new double[]{AvarageOfFriedFries(),AvarageOfMeatBall(),AvarageOfCheeseCrepes(),AvarageOfOnionRings(),
                AvarageOfBuffaloChickenWings(),AvarageOfCheeseburger(),AvarageOfChickenMeatBurger(),
                AvarageOfBeefMeatBurger(),AvarageOfVeganBurger(),AvarageOfBeefSteak(),AvarageOfChickenCordonBleu(),AvarageOfChickenNoodle(),AvarageOfSalmon(),
                AvarageOfDonerKebab(),AvarageOfAdanaKebab(),AvarageOfPizzaMargherita(),AvarageOfPizzawithbeef(),
                AvarageOfTomatoSoup(),AvarageOfChickenSoup(),AvarageOfChhesyPotatoSoup(),AvarageOfSmokyHamandSplitPeaSoup(),
                AvarageOfBananaChocolate(),AvarageOfButteryRaspberryCrumbleBars(),AvarageOfUltimateGooeyBrownies(),
                AvarageOfSaltedCaramelChocolateTart(),AvarageOfAyran(),AvarageOfCoffee(),AvarageOfSoftDrinks(),
                AvarageOfTea(),AvarageOfWine(),AvarageOfLemonade(),AvarageOfTunaSalad(),AvarageOfChickenSalad(),
                AvarageOfCaesarSalad()};

        NameOfFoods=new String[]{"Fried Fries","MeatBall","Cheese Crepes","OnionRings","Buffalo Chicken Wings",
                "Cheeseburger","Chicken Meat Burger","Beef Meat Burger","Vegan Burger","Beef Steak","Chicken Cordon Bleu","Chicken Noodle",
                "Salmon","Doner Kebab","Adana Kebab","Pizza Margherita","Pizza with beef","Tomato Soup","Chicken Soup",
                "Chhesy Potato Soup","Smoky Hamand Split Pea Soup","Banana Chocolate","Buttery Raspberry Crumble Bars",
                "Ultimate Gooey Brownies","Salted Caramel Chocolate Tart","Ayran","Coffee","Soft Drinks","Tea","Wine",
                "Lemonade","Tuna Salad","Chicken Salad","Caesar Salad"};

        maxName=NameOfFoods[0];
        max = DishCodes[0];

        for(int i=0; i<DishCodes.length; i++) {
            if(DishCodes[i]>max) {
                max=DishCodes[i];
                maxName=NameOfFoods[i];
            }

        }
        System.out.println("Our top dish of the week is: "+maxName);
        System.out.print("");
        System.out.println("The point is: "+max);

    }
}





