package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	Rectangle rectangle = new Rectangle();
        System.out.print("Nhập vào rộng dài của hình chữ nhật : ");
        rectangle.width = scanner.nextInt();
        System.out.print("Nhập vào chiều cao của hình chữ nhật : ");
        rectangle.height = scanner.nextInt();
        rectangle.outDisplay();
    }
}

    class Rectangle {

    double width, height;


        public Rectangle(){

        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public  double getPerimeter() {

            return (this.width + this.height) * 2;
        }

        public  double getArea() {

            return this.width * this.height;
        }

        public String display() {
            return "Rectangle{" + "width=" + width + ", height=" + height + "}";
        }

        public void outDisplay(){
            Rectangle rectangle = new Rectangle(width,height);
            System.out.println("Your Rectangle \n"+ rectangle.display());
            System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
            System.out.println("Area of the Rectangle: "+ rectangle.getArea());
        }

    }

