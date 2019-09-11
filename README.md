# UNiDAYS
UNiDAYS Discounts Coding Challenge

I built a basic discount system that applies discounts to an online shopping order and calculates the total price based on a set of pricing rules.

## How to run
I used IntelliJ IDEA to build my program and run the Main class.
My program reads the input from stdin and prints the ouput to stdout.

## My approach
I made an Item class and extended it to A, B, C, D item types. I implemented the Visitor Design Pattern in order to be able to automatically calculate the total discount for each type of item. I also made the PricingRules class to be Singleton. To store the pricing rules, I used a HashMap where the key is the name of the item and the value is its object instance. I also chose to represent the Basket as a HashMap with the item as key and its frequency as value. I iterated through the items in the basket and I applied the discounts, then I calculated the total price. I made a Result class to store the total price and the delivery charge.
