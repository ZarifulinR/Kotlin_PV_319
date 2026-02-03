fun main() {
    /*val person:Person=Person("Tom",18);
    val person1:Person=Person("Anna",20)
    person.age=37;
    person.sayHello();
    person.go("Mall");
    person.personToString();

     */
    val myBook = Book("Lord of the Rings",-50);
    myBook.print();
    val prod = Product("orang",13.0);
    val prod1 = Product("jus",13.0);
    val prod2 = Product("milk",13.0);
    val prod3 = Product("bred",13.0);
    println(prod.price);
    prod.applyDiscount(50);
    println(prod.price);
    print(prod==prod1);

    val laptop = Laptop("Lenovo", 30)
    val phone = Phone("123-456", "Samsung")


    laptop.turnOn()
    phone.turnOn()


    val devices: List<Device> = listOf(laptop, phone)

    for (device in devices) {
        device.turnOn()
        device.turnOff()
    }
}