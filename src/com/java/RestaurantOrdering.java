
package com.java;

import java.util.Scanner;

public class RestaurantOrdering {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String yn = "";
        double total_price = 0;

        do {

            System.out.println("Enter the category - veg/non-veg/starter/drinks:");
            String catg = sc.next();

            switch (catg.toLowerCase()) {

                // VEG CATEGORY
                case "veg" -> {

                    String vyn = "";
                    double veg_total_price = 0;

                    do {

                        System.out.println("Enter the Veg Item:");
                        String veg_item = sc.next();

                        switch (veg_item.toLowerCase()) {

                            case "pbm" -> {
                                System.out.println("Paneer Butter Masala - 250/- rs");
                                veg_total_price += 250;
                            }

                            case "dal" -> {
                                System.out.println("Dal Tadaka - 200/- rs");
                                veg_total_price += 200;
                            }

                            case "pvm" -> {
                                System.out.println("Paneer Tikka Masala - 280/- rs");
                                veg_total_price += 280;
                            }

                            case "mtr" -> {
                                System.out.println("Matar Paneer - 240/- rs");
                                veg_total_price += 240;
                            }

                            case "pal" -> {
                                System.out.println("Palak Paneer - 230/- rs");
                                veg_total_price += 230;
                            }

                            case "chp" -> {
                                System.out.println("Chilli Paneer - 220/- rs");
                                veg_total_price += 220;
                            }

                            case "shp" -> {
                                System.out.println("Shahi Paneer - 270/- rs");
                                veg_total_price += 270;
                            }

                            case "mix" -> {
                                System.out.println("Mix Veg Curry - 180/- rs");
                                veg_total_price += 180;
                            }

                            case "kof" -> {
                                System.out.println("Malai Kofta - 250/- rs");
                                veg_total_price += 250;
                            }

                            case "chm" -> {
                                System.out.println("Chana Masala - 190/- rs");
                                veg_total_price += 190;
                            }

                            case "dum" -> {
                                System.out.println("Dum Veg Biriyani - 300/- rs");
                                veg_total_price += 300;
                            }

                            case "veg" -> {
                                System.out.println("Veg Pulao - 280/- rs");
                                veg_total_price += 280;
                            }

                            default -> System.out.println("Entered item is not available");
                        }

                        System.out.println("Do you want to continue with Veg Items? Y/N");
                        vyn = sc.next();

                    } while (vyn.equalsIgnoreCase("y"));

                    System.out.println("Veg Total Price is: " + veg_total_price);

                    total_price += veg_total_price;
                }

                // NON-VEG CATEGORY
                case "non-veg" -> {

                    String nvyn = "";
                    double non_veg_total_price = 0;

                    do {

                        System.out.println("Enter the Non-Veg Item:");
                        String non_veg_item = sc.next();

                        switch (non_veg_item.toLowerCase()) {

                            case "mdb" -> {
                                System.out.println("Mutton Dum Biriyani - 500/- rs");
                                non_veg_total_price += 500;
                            }

                            case "cdb" -> {
                                System.out.println("Chicken Dum Biriyani - 350/- rs");
                                non_veg_total_price += 350;
                            }

                            case "cfb" -> {
                                System.out.println("Chicken Fry Biriyani - 380/- rs");
                                non_veg_total_price += 380;
                            }

                            case "pdb" -> {
                                System.out.println("Prawns Dum Biriyani - 450/- rs");
                                non_veg_total_price += 450;
                            }

                            case "fdb" -> {
                                System.out.println("Fish Dum Biriyani - 400/- rs");
                                non_veg_total_price += 400;
                            }

                            case "egb" -> {
                                System.out.println("Egg Biriyani - 220/- rs");
                                non_veg_total_price += 220;
                            }

                            case "ch65" -> {
                                System.out.println("Chicken 65 - 280/- rs");
                                non_veg_total_price += 280;
                            }

                            case "cfr" -> {
                                System.out.println("Chicken Fry - 300/- rs");
                                non_veg_total_price += 300;
                            }

                            case "tka" -> {
                                System.out.println("Chicken Tikka - 320/- rs");
                                non_veg_total_price += 320;
                            }

                            case "mfr" -> {
                                System.out.println("Mutton Fry - 450/- rs");
                                non_veg_total_price += 450;
                            }

                            case "pfr" -> {
                                System.out.println("Prawns Fry - 350/- rs");
                                non_veg_total_price += 350;
                            }

                            case "cmd" -> {
                                System.out.println("Chicken Mandi - 1550/- rs");
                                non_veg_total_price += 1550;
                            }

                            default -> System.out.println("Entered item is not available");
                        }

                        System.out.println("Do you want to continue with Non-Veg Items? Y/N");
                        nvyn = sc.next();

                    } while (nvyn.equalsIgnoreCase("y"));

                    System.out.println("Non-Veg Total Price is: " + non_veg_total_price);

                    total_price += non_veg_total_price;
                }

                // STARTER CATEGORY
                case "starter" -> {

                    String syn = "";
                    double starter_total_price = 0;

                    do {

                        System.out.println("Enter the Starter Item:");
                        String starter = sc.next();

                        switch (starter.toLowerCase()) {

                            case "cmj" -> {
                                System.out.println("Chicken Majestic - 200/- rs");
                                starter_total_price += 200;
                            }

                            case "kebab" -> {
                                System.out.println("Kebab - 250/- rs");
                                starter_total_price += 250;
                            }

                            case "apf" -> {
                                System.out.println("Apollo Fish - 250/- rs");
                                starter_total_price += 250;
                            }

                            case "pt" -> {
                                System.out.println("Paneer Tikka - 220/- rs");
                                starter_total_price += 220;
                            }

                            case "prawnsfry" -> {
                                System.out.println("Prawns Fry - 200/- rs");
                                starter_total_price += 200;
                            }

                            default -> System.out.println("Entered item is not available");
                        }

                        System.out.println("Do you want to continue with Starters? Y/N");
                        syn = sc.next();

                    } while (syn.equalsIgnoreCase("y"));

                    System.out.println("Starter Total Price is: " + starter_total_price);

                    total_price += starter_total_price;
                }

                // DRINKS CATEGORY
                case "drinks" -> {

                    String dyn = "";
                    double drinks_price = 0;

                    do {

                        System.out.println("Enter the Drink:");
                        String drinks = sc.next();

                        switch (drinks.toLowerCase()) {

                            case "thumsup" -> {
                                System.out.println("Thumsup - 20/- rs");
                                drinks_price += 20;
                            }

                            case "sprite" -> {
                                System.out.println("Sprite - 20/- rs");
                                drinks_price += 20;
                            }

                            case "dietcoke" -> {
                                System.out.println("Diet Coke - 20/- rs");
                                drinks_price += 20;
                            }

                            default -> System.out.println("Entered drink is not available");
                        }

                        System.out.println("Do you want to continue with Drinks? Y/N");
                        dyn = sc.next();

                    } while (dyn.equalsIgnoreCase("y"));

                    System.out.println("Drinks Total Price is: " + drinks_price);

                    total_price += drinks_price;
                }

                default -> System.out.println("Entered Category is not available!");
            }

            System.out.println("Do you want to continue with Categories? Y/N");
            yn = sc.next();

        } while (yn.equalsIgnoreCase("y"));

        // FINAL BILL
        System.out.println("--------------------------------");
        System.out.println("       RESTAURANT BILL");
        System.out.println("--------------------------------");
        System.out.println("Total Price: Rs. " + total_price);
        System.out.println("--------------------------------");
        System.out.println("Thank You! Visit Again!");

        sc.close();
    }
}
	
	
	


