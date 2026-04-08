package com.practicejava;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String category = "Fruits";
        String item = "Mango";

switch (category) {
    case "Vegetables" ->{
        switch (item) {
            case "Carrot"->
                System.out.println("₹50 per kg");
               
            case "Tomato"->
                System.out.println("₹40 per kg");
               
            default->
                System.out.println("Vegetable not found");
        }
    }
     
        
    case "Fruits"->{
        switch (item) {
            case "Apple"->
                System.out.println("₹180 per kg");
            case "Mango"->
                System.out.println("₹120 per kg");
            default->
                System.out.println("Fruit not found");
        }
    }
      
    default->
        System.out.println("Category not found");
}
// Output: ₹120 per kg
    }
    


}

