// Q1. Single Inheritance — Animal
// - Create a parent class Animal with a method eat().
// - Create a child class Dog that extends Animal.
// - Add a method bark() in the Dog class.
// - Create an object of Dog and call both methods.


class Animal {
     
  void eat(){
    System.out.println("eating...");
  }
}

  class Dog extends Animal{
    
    void bark(){
       System.out.println("barking....");
    }
  }
  public class Inheritance{
  public static void main (String[] args){
     
     Dog d = new Dog();
     d.eat();
     d.bark();
  }
  }
