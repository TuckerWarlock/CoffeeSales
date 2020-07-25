# M4 Assignment Instructions: Program Coffee Sales

## Overview
For this assignment, you will develop an application to determine the cost of coffee sales. The main objective of this program is to use methods (separate function) for doing the calculation. 
Additionally, your program will use these methods in another class file and access them there. You will write a program that accepts the unit weight of a bag of coffee in pounds and the number of bags sold. 
The program will then display the current date, the number of bags sold, the weight per bag, the price per pound, the tax rate used, the subtotal, the tax charged, and the total price of the sale.

## Instructions
Write a program with the following specifications:

### For this assignment, you will develop two classes (separate files). The first class will contain the following:
#### The main method for greeting the user when the program begins with “Welcome to the Coffee Sales Calculator.” or similar message.
* A method for user input for the bag weight and number of bags.
* A method that handles output for the results. The results will include the current date calculated using the built-in Date class. Align the output to look like a sales receipt.
* A method for output of a message that is displayed when the user is done calculating coffee sales.
### The second class will contain:
#### Two constant data fields:
* One for the price per pound, which is $5.99
* One for the tax rate, which is 7.25% (expressed as 0.0725)
* A no-argument constructor that creates a sale of one bag weighing one pound.
* A constructor that accepts arguments from the first class for number of bags and the weight of each bag.
* A constructor that accepts arguments from the first class for number of bags and the weight of each bag.
* A method named getSale() that returns the sale amount before tax.
* A method named getSaleTax() that returns the tax on the transaction.
* A method named getTotalPrice() that returns the total sale price.
* A method named getPrice() that returns the price per pound.
* A method named getTaxRate() that returns the tax rate.

#### Calculations will be based on the following formulas:
* totalPrice = bagWeight * numberOfBags * pricePerLB
* totalPriceWithTax = totalPrice + (totalPrice * taxRate)

The program will calculate sales until the user indicates that there are no further sales. 
All output will be limited to two decimal place.
