package com.theironyard.novauc;


import sun.tools.tree.SwitchStatement;
import sun.util.resources.cldr.nb.TimeZoneNames_nb;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kevinallen on 3/3/17.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        ArrayList<SportsGoods> inventory = new ArrayList<>();
        inventory.add(createItem("Rawlings", 10, "Baseball"));
        inventory.add(createItem("Wilson", 5, "Football"));
        inventory.add(createItem("Spalding", 14, "Tennis"));
        inventory.add(createItem("Nike", 15, "Pads"));
        inventory.add(createItem("Rebok", 7, "Bats"));
        inventory.add(createItem("Prokids", 1, "Rackets"));


        System.out.println(inventory);
        String name = scanner.nextLine();
        int quantity = scanner.nextInt();
        String category = scanner.nextLine();


    }


    public static SportsGoods createItem(String name, int quantity, String category) throws Exception {

        switch (category) {

            case "Baseball" :
                return new Baseball(name, quantity, category);
            case "Football" :
                return new Football(name,quantity,category);

            case "Tennis" :
                return new Tennis(name,quantity,category);

            case "Pads":
                return  new Pads(name, quantity,category);

            case "Bats":
                return new Bats(name,quantity,category);

            case "Rackets":
                return new Rackets(name, quantity,category);


          }
        throw new Exception();

        }


    }


































