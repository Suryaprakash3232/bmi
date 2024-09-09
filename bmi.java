import java.io.*;
import java.util.Scanner;
class bmi {  

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your weight: ");
	double weight = input.nextDouble();
	System.out.print("Enter your height: ");
	double height = input.nextDouble();
	double BMI = weight / (height*height);
	if (BMI<18.5){
		System.out.println("BMI: "+BMI+", Category: Underweight ");
	}
	else if (18.5<=BMI && BMI<24.9){
		System.out.println("BMI: "+BMI+", Category: Normal Weight ");
	}
	else if (25<=BMI && BMI<29.9){
		System.out.println("BMI: "+BMI+", Category: OverWeight ");
	}
	else {
		System.out.println("BMI: "+BMI+", Category: Obesity ");
	}
    }  
}