package Project;
import java.util.Scanner;
import java.util.ArrayList;
public class Choices {
    public static double sum=0;
    public static ArrayList<ArrayList<Double>>AllTheFoodRates;
    //THE PRICES OF THE FOOD CAN BE MODIFIED:
    public static double priceFriedFries=3.0;
    public static double priceMeatBall=4.0;
    public static double priceCheeseCrepes=4.0;
    public static double priceOnionRings=4.0;
    public static double priceBuffaloChickenWings=5.5;
    public static double priceCheeseBurger=8.5;
    public static double priceChickenMeatBurger=6.0;
    public static double priceBeefMeatBurger=7.0;
    public static double priceVeganBurger=4.0;
    public static double priceBeefSteak=12.0;
    public static double priceChickenCordonBleu=8.0;
    public static double priceChickenNoodle=6.5;
    public static double priceSalmon=12.0;
    public static double priceDonerKebab=11.0;
    public static double priceAdanaKebab=12.0;
    public static double pricePizzaMargherita=9.0;
    public static double pricePizzaWithBeef=11.0;
    public static double priceTomatoSoup=3.0;
    public static double priceChickenSoup=4.0;
    public static double priceCheesyPotatoSoup=4.0;
    public static double priceSmokyHamAndSplitPeaSoup=5.5;
    public static double priceBananaChocolate=2.0;
    public static double priceButteryRasoberryCrumbleBars=4.0;
    public static double priceUltimateGooeyBrownies=4.0;
    public static double priceSaltedCaramelChocolateTart=5.0;
    public static double priceAyran=1.0;
    public static double priceCoffee=2.0;
    public static double priceSoftDrinks=1.5;
    public static double priceTea=1.25;
    public static double priceWine=25.0;
    public static double priceLemonade=1.5;
    public static double priceTunaSalad=4.0;
    public static double priceChickenSalad=4.0;
    public static double priceCaesarSalad=4.5;





    public static double displayChoices(double sum, ArrayList<String>foods,int qua){
        int choice=0;
        System.out.println("Welcome to our restaurant!");
        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("Press 1 to ORDER ");
        System.out.println("Press 2 to PAY THE BILL ");
        System.out.println("Press 3  to GIVE US FEEDBACK ");
        System.out.println("Press 4 to SEE OUR TOP DISHES OF THE WEEK ");
        System.out.println("Press 5 IF YOU ARE NOT GOING TO TAKE ANOTHER ACTION");
        System.out.println("");
        System.out.println("Please enter a number (1,2,3,4,5 )");
        int number1;
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();

        while (number1 != -2) {
            Choices.TheSystem(number1,sum,foods,qua);

            if (number1 == -2){
                Choices.displayChoices(sum,foods,qua);

            }


        }

        return choice;
    }

    public static double TheSystem(int numberr,double sum, ArrayList<String>foods,int qua){
        int i=0;
        int number1;

        switch(numberr){
            case 1:

                //ORDER
                Choices.DISPLAYMENU(sum,foods,qua);
                break;
            case 2:
                //PAY THE BILL
                Choices.PayTheBill(foods,qua);
                break;
            case 3:
                //FEEDBACK
                int Fed;
                Customer.FeedBack(foods,qua,sum);
                System.out.println("Feedback process is done please press -1 to return previous menu...");

                Scanner inputFeedBack=new Scanner(System.in);
                Fed=inputFeedBack.nextInt();
                if(Fed==-1)
                    Choices.displayChoices(sum,foods,qua);
                break;
            case 4 :
                //SHOWS THE TOP DISH OF THE WEEEK
                int TopDish;
                Customer.ShowTheTopDish(AllTheFoodRates);

                System.out.println("Press -1 to return back to previous menu..");
                Scanner inputTopDish=new Scanner(System.in);
                TopDish=inputTopDish.nextInt();
                if(TopDish==-1)
                    Choices.displayChoices(sum,foods,qua);

                break;
            case 5:
                int fnsh;
                if(sum!=0){
                    System.out.println("First YOU HAVE TO PAY THE BILL!");
                    Choices.PayTheBill(foods,qua);

                }
                else if(sum==0) {
                    foods.clear();
                    System.out.println("your orders are deleted...");
                    System.out.println("THANK YOU, COME AGAIN <3");
                    System.out.println("Press -1 to return main menu...");
                    Scanner finish =new Scanner (System.in);
                    fnsh=finish.nextInt();
                    if (fnsh==-1)
                        Choices.displayChoices(sum,foods,qua);
                }

                break;

            case -1:
                //RETURNS THE MAIN MENU
                Choices.displayChoices(sum,foods,qua);

            default:
                System.out.println("YOU MUST ENTER 1, 2, 3, 4 or 5..");
                Choices. displayChoices(sum, foods, qua);
                break;
        }
        return i;
    }

    public static double DISPLAYMENU(double sum, ArrayList<String>foods,int qua){
        int choice=0;

        System.out.println("What do you want to eat?");
        System.out.println("Press 1 to order starters. ");
        System.out.println("Press 2 to order main dishes. ");
        System.out.println("Press 3  to order soups. ");
        System.out.println("Press 4 to desserts. ");
        System.out.println("Press 5 to order drinks.");
        System.out.println("Press 6 to order salads.");
        System.out.println("Press -1 to return previous menu");
        System.out.println("Press -3 to see the sum of your order: ");
        System.out.println("Please enter a number ");


        Scanner innnput=new Scanner(System.in);
        int newnumber=innnput.nextInt();
        Choices.Categories(newnumber,sum,foods,qua);


        Project.Choices.displayChoices(sum,foods,qua);


        return choice;
    }

    public static double Categories(int newnumber, double sum, ArrayList<String>foods,int qua){

        int sayı;

        int a=0;

        switch (newnumber) {

            case 1:
                System.out.println("1.Fried Fries = $"+priceFriedFries);
                System.out.println("2.Meat Ball = $"+priceMeatBall);
                System.out.println("3.Cheese Crepes = $"+priceCheeseCrepes);
                System.out.println("4.Onion Rings = $"+priceOnionRings);
                System.out.println("5.Buffalo Chicken Wings = $"+priceBuffaloChickenWings);
                System.out.println("");
                System.out.println("Press -1 to return previous page...");


                Scanner input=new Scanner(System.in);
                sayı=input.nextInt();


                while(sayı!=-1) {


                    if(sayı==1){

                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceFriedFries*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);

                        foods.add("Fried Fries");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);


                    }
                    else if(sayı==2){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceMeatBall*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);

                        foods.add("Meat Ball");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");
                        System.out.println(foods);
                    }
                    else if(sayı==3){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceCheeseCrepes*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);

                        foods.add("Cheese Crepes");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");
                        System.out.println(foods);
                    }
                    else if(sayı==4){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceOnionRings*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Onion Rings");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı==5){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceBuffaloChickenWings*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Buffalo Chicken Wings");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }



                    System.out.println("Enter a value or -1 to return previous menu");
                    sayı=input.nextInt();
                }
                System.out.println("The sum of your order is"+sum);
                System.out.println("Returning the menu...");
                Project.Choices.DISPLAYMENU(sum,foods,qua);


                break;



            case 2 :
                System.out.println("6.Cheeseburger = $"+priceCheeseBurger);
                System.out.println("7.Chicken Meat Burger = $"+priceChickenMeatBurger);
                System.out.println("8.Beef Meat Burger = $"+priceBeefMeatBurger);
                System.out.println("9.Vegan Burger = $"+priceVeganBurger);
                System.out.println("10.Beef Steak = $"+priceBeefSteak);
                System.out.println("11.Chicken Cordon Bleu = $"+priceChickenCordonBleu);
                System.out.println("12.Chicken Noodle = $"+priceChickenNoodle);
                System.out.println("13.Salmon = $"+priceSalmon);
                System.out.println("14.Doner Kebab = $"+priceDonerKebab);
                System.out.println("15.Adana Kebab = $"+priceAdanaKebab);
                System.out.println("16.Pizza Margherita = $"+pricePizzaMargherita);
                System.out.println("17.Pizza With Beef = $"+pricePizzaWithBeef);
                System.out.println("Press -1 to return previous menu");

                Scanner input2=new Scanner(System.in);

                double sayı2=input2.nextInt();

                while(sayı2!=-1) {


                    if(sayı2==6){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceCheeseBurger*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Cheeseburger");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı2==7){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceChickenMeatBurger*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Chicken Meat Burger");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı2==8){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceBeefMeatBurger*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Beef Meat Burger");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı2==9){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceVeganBurger*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Vegan Burger");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı2==10){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceBeefSteak *qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Beef Steak");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if (sayı2==11){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceChickenCordonBleu*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Chicken Cordon Bleu");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);

                    }
                    else if (sayı2==12){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceChickenNoodle*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Chicken Noodle");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);

                    }
                    else if (sayı2==13){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceSalmon*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Salmon");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);

                    }
                    else if (sayı2==14){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceDonerKebab*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Doner Kebab");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);

                    }
                    else if (sayı2==15){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceAdanaKebab*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Adana Kebab");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);

                    }
                    else if (sayı2==16){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(pricePizzaMargherita*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Pizza Margherita");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);

                    }
                    else if (sayı2==17){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(pricePizzaWithBeef*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Pizza With Beef");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);

                    }

                    System.out.println("Enter a value or -1 to return previous menu");
                    sayı2=input2.nextInt();
                }
                System.out.println("The sum of your order is"+sum);
                System.out.println("Returning the menu...");
                Project.Choices.DISPLAYMENU(sum,foods,qua);



                break;


            case 3:
                System.out.println("18.Tomato Soup = $"+priceTomatoSoup);
                System.out.println("19.Chicken Soup = $"+priceChickenSoup);
                System.out.println("20.Cheesy Potato Soup = $"+priceCheesyPotatoSoup);
                System.out.println("21.Smoky Ham and Split Pea Soup = $"+priceSmokyHamAndSplitPeaSoup);
                System.out.println("Press -1 to return previous menu");

                Scanner input3=new Scanner(System.in);
                double sayı3=input3.nextInt();


                while(sayı3!=-1){
                    if (sayı3==18){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceTomatoSoup*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Tomato Soup");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı3==19){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceChickenSoup*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Chicken Soup");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı3==20){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceCheesyPotatoSoup*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Cheesy Potato Soup");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı3==21){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceSmokyHamAndSplitPeaSoup*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Smoky Ham and Split Pea Soup");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }

                    System.out.println("Enter a value or -1 to return previous menu");
                    sayı3=input3.nextInt();
                }
                System.out.println("The sum of your order is"+sum);
                System.out.println("Returning the menu...");
                Project.Choices.DISPLAYMENU(sum,foods,qua);

                break;

            case 4 :
                System.out.println("22.Banana Chocolate = $"+priceBananaChocolate);
                System.out.println("23.Buttery Raspberry Crumble Bars= $"+priceButteryRasoberryCrumbleBars);
                System.out.println("24.Ultimate Gooey Brownies = $"+priceUltimateGooeyBrownies);
                System.out.println("25.Salted Caramel Chocolate Tart= $"+priceSaltedCaramelChocolateTart);
                System.out.println("Press -1 to return previous menu");
                Scanner input4=new Scanner(System.in);
                double sayı4=input4.nextInt();
                while(sayı4!=-1){
                    if(sayı4==22){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceBananaChocolate*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Banana Chocolate");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı4==23){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceButteryRasoberryCrumbleBars*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Buttery Raspberyy Crumble Bars");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı4==24){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceUltimateGooeyBrownies*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Ultimate Gooey Brownies");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı4==25){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceSaltedCaramelChocolateTart*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Salted Caramel Chocolate Tart");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }

                    System.out.println("Enter a value or -1 to return previous menu");
                    sayı4=input4.nextInt();
                }
                System.out.println("The sum of your order is"+sum);
                System.out.println("Returning the menu...");
                Project.Choices.DISPLAYMENU(sum,foods,qua);

                break;

            case 5 :
                System.out.println("26.Ayran = $"+priceAyran);
                System.out.println("27.Coffee = $"+priceCoffee);
                System.out.println("28.Soft Drinks = $"+priceSoftDrinks);
                System.out.println("29.Tea = $"+priceTea);
                System.out.println("30.Wine = $"+priceWine);
                System.out.println("31.Lemonade= $"+priceLemonade);
                System.out.println("Press -1 to return previous menu");
                Scanner input5=new Scanner(System.in);
                double sayı5=input5.nextInt();
                while(sayı5!=-1){
                    if(sayı5==26){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceAyran*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Ayran");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);

                    }
                    else if(sayı5==27){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceCoffee*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Coffee");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı5==28){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceSoftDrinks*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Soft Drinks");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı5==29){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceTea*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Tea");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı5==30){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceWine*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Wine");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı5==31){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceLemonade*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Lemonade");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }

                    System.out.println("Enter a value or -1 to return previous menu");
                    sayı5=input5.nextInt();
                }
                System.out.println("The sum of your order is"+sum);
                System.out.println("Returning the menu...");
                Project.Choices.DISPLAYMENU(sum,foods,qua);

                break;

            case 6 :
                System.out.println("32.Tuna Salad = $"+priceTunaSalad);
                System.out.println("33.Chicken Salad = $"+priceChickenSalad);
                System.out.println("34.Caesar Salad = $"+priceCaesarSalad);
                System.out.println("Press -1 to return previous menu");
                Scanner input6=new Scanner(System.in);
                double sayı6=input6.nextInt();
                while(sayı6!=-1){
                    if(sayı6==32){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceTunaSalad*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Tuna Salad");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı6==33){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceChickenSalad*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Chicken Salad");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }
                    else if(sayı6==34){
                        System.out.println("How much do you want?");
                        Scanner quantity=new Scanner(System.in);
                        qua=quantity.nextInt();
                        sum=sum+(priceCaesarSalad*qua);
                        System.out.print("the sum of your order is"+sum);
                        System.out.print("$");
                        Customer.SetSumA(sum);
                        foods.add("Caesar Salad");
                        System.out.println("");
                        System.out.println("The dishes you've ordered: ");

                        System.out.println(foods);
                    }

                    System.out.println("Enter a value or -1 to return previous menu");
                    sayı6=input6.nextInt();
                }

                System.out.println("The sum of your order is"+sum);
                System.out.println("Returning the menu...");
                Project.Choices.DISPLAYMENU(sum,foods,qua);

                break;

            case -1:
                Choices.displayChoices(sum,foods,qua);
                break;
            case -3:
                System.out.println("The sum of your order is"+sum);
                Choices.DISPLAYMENU(sum,foods,qua);


                break;
            default :
                System.out.println("YOU ENTERED WRONG NUMBER! Please enter given numbers.");

        }
        return a;
    }
    public static void PayTheBill(ArrayList<String>foods,int qua){
        int paying;
        int rakam;
        Customer.orders(foods,qua);
        System.out.println("");
        Customer.display();
        System.out.println("");
        System.out.println("Press 1 to pay");
        Scanner inputpay=new Scanner(System.in);
        paying=inputpay.nextInt();
        if(paying==1) {
            sum = 0;
            System.out.println("Thank you  <3");

            System.out.println("Press -1 to turn back to main menu");
            Scanner input12 = new Scanner(System.in);
            rakam = input12.nextInt();
            if (rakam == -1) {
                Choices.displayChoices(sum, foods, qua);
            }
        }



    }


}
