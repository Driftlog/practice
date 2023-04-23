package edu.sg.nus.iss;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    
    private ArrayList<String> cart;

    public Cart() {
        this.cart = new ArrayList<>();
    }

    public void UIstart() {
        System.out.println("Welcome to your shopping cart");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            System.out.println("> ");

            if (input.equals("list")) {
                if (this.cart.isEmpty()) {
                    System.out.println("Your cart is empty");
                } else {
                    int i = 1;
                    for (String item : this.cart) {
                        System.out.println(i + ". " + item);
                        i++;
                    }
                }
            }

            if (input.contains("add")) {
                String items = input.substring(5);
                String[] itemz = items.split(",");
                for (String item : itemz) {
                    this.cart.add(item);
                }
            }

            if (input.contains("delete")) {
                String index = input.substring(8);
                int deleteIndex = Integer.parseInt(index);
                if (this.cart.size() > deleteIndex) {
                    this.cart.remove(deleteIndex);
                }
            }

            if (input.contains("quit")) {
                break;
            }
        }

        scanner.close();
        
    }
    }
