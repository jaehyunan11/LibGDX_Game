Stack   


when internal application is done
it will be popped up
......
doMore();
......
doWork();
 float weight = 20.3;
......
main()
 int age;
 age = 12;
 age = 15;
 String name = "";
 Car myCar;
 myCar = new Car();
doWork() {
 float weight = 20.3;
doMore() {

}
};

.............................
Heap

myCar -> Car() # point to Car object
myCar -> Car() # point to second Car object

Garbage Collection - Don't have relationship just like first Car object that was pointed

..............................

Instance variable

class Car {
 int hp; // instance variable (primitive data)
 Engine myEngine;

}

Car my2car = new Car(); 
my2car.hp = 120;
Car my3car = new Car();
my3car.hp = 1000;
Engine bigEngine = new Engine();
my3car.myEngine = bigEngine;
