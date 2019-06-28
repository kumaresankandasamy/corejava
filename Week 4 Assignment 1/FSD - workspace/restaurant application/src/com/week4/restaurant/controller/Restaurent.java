package com.week4.restaurant.controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.week4.restaurant.model.Dish;
import com.week4.restaurant.model.Dishtype;


public class Restaurent {
	public static void main(String[] args) {
		Dish dish1 = new Dish(1,"Chicken_Briyani",Dishtype.Non_Veg,190.0,300.0);
		Dish dish2 = new Dish(2,"Briyani",Dishtype.Non_Veg,160.0,200.0);
		
		List<Dish> dish = new ArrayList<>();
		dish.add(dish1);
		dish.add(dish2);
		
		
		System.out.println("=================Welcome=====================");
		System.out.println("Please choose from the below options ");
		
		System.out.println(" 1 => To sort the dishes in the increasing order of calories");
		System.out.println("2 => To sort the dishes in the decreasing order of calories");
		System.out.println("3 => To sort the dishes in the increasing order of price");
		System.out.println("4 => To sort the dishes in the decreasing order of price ");
		System.out.println("===============================================");
		
		Comparator<Dish> incresOrderCal = (d1,d2) -> Double.valueOf(d1.getCalories()).compareTo(d2.getCalories());
		Comparator<Dish> decresOrderCal = (d1,d2) -> Double.valueOf(d2.getCalories()).compareTo(dish1.getCalories());
		Comparator<Dish> incresOrderPrice = (d1,d2) -> Double.valueOf(d1.getPrice()).compareTo(d2.getPrice());
		Comparator<Dish> decresOrderPrice = (d1,d2) -> Double.valueOf(d2.getPrice()).compareTo(d1.getPrice());
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		sc.close();
		switch(option) {
		case 1:
			dish.sort(incresOrderCal);
			break;
		case 2:
			dish.sort(decresOrderCal);
			break;
		case 3:
			dish.sort(incresOrderPrice);
			break;
		case 4:
			dish.sort(decresOrderPrice);
			break;
		default:
			System.out.println("No options available");
			break;
		
			
		}
		Iterator<Dish> iterator = dish.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}
	

}
