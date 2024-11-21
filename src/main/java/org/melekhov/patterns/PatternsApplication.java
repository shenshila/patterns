package org.melekhov.patterns;

import org.melekhov.patterns.adapter.MemoryCard;
import org.melekhov.patterns.adapter.MemoryCardAdapter;
import org.melekhov.patterns.adapter.Pc;
import org.melekhov.patterns.adapter.Usb;
import org.melekhov.patterns.factory.factory.CoffeeMachine;
import org.melekhov.patterns.proxy.DbImpl;
import org.melekhov.patterns.proxy.DbProxy;
import org.melekhov.patterns.singleton.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.melekhov.patterns.factory.Product.AMERICANO;

@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {

//        Singleton
//        Создать класс логирования. Метод в нем должен выводить имя переданного класса и дополнительную информацию.
//        classLogg(Object obj, String info)
//
//        Пример вывода в методе: Log info: 21.07.23 - TestClass - Some info

        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();

        System.out.println(logger.classLog(logger1, "Hello World!"));
        System.out.println();

//        Factory
//        Создать класс кофе, от него наследовать два вида кофе,
//        в зависимости от того какой тип кофе мы хотим, создавать именно его через фабрику. (espresso, americano)

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.getCoffee(AMERICANO);
        System.out.println();

//        Adapter
//        Компьютер может читать информацию только с USB, нужно прочитать через usb адаптер информацию с карты памяти.
//        (создаю карту, адаптер и с компьютера читаю)

        Pc pc = new Pc();
        Usb usb = new Usb();

        pc.readUsb(usb);

        System.out.println();

        MemoryCard memoryCard = new MemoryCard();
        MemoryCardAdapter memoryCardAdapter  = new MemoryCardAdapter(memoryCard);

        pc.readUsb(memoryCardAdapter);

        System.out.println();

//        Proxy
//        Создание класса который хранит название бд и "подключается" к ней по полному url.
//        Подключаться через proxy, который добавляет к названию полный адрес.
//        (через proxy обращаюсь к названию бд, вижу строчку подключено localhost:port/название бд)

        DbImpl db = new DbImpl();
        DbProxy dbProxy = new DbProxy(db);
        System.out.println(dbProxy.connect());

    }

}
