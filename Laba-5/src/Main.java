import Package.*;
import ErrorsPackage.*;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try
        {
            System.out.println("----------Task1----------");
            Class clsName = Class.forName(args[0]);
            Constructor constrCar = clsName.getConstructor(String.class, Integer.TYPE);
            Object obj = constrCar.newInstance("Lada", 5);
            Method method = clsName.getMethod(args[1], String.class, double.class);
            method.invoke(obj, "model0", Integer.valueOf(args[2]));
            System.out.println(obj);
            System.out.println("");

            //Задание 2
            System.out.println("----------Task2----------");
            Car car = new Car("", 0);
            transport_vehicle tv = StaticClass.createVehicle("Lada", 5, car);
            System.out.println(tv);
            System.out.println("");

            //Задание 3
            System.out.println("----------Task3----------");
            Scooter scooter = new Scooter("Porshe", 5);
            System.out.println("Марка скутера: " + scooter.getBrand());
            System.out.println("Модели скутеров и цены:");
            StaticClass.printNameModels(scooter);
            StaticClass.printPriseModels(scooter);

            System.out.println("");
            System.out.println("Добавление Модели");
            try {
                scooter.addNamePriceModel("Buclazhan", 80000);
            } catch (DuplicateModelNameException e) {
                System.out.println(e);
            }
            StaticClass.printNameModels(scooter);
            StaticClass.printPriseModels(scooter);

            System.out.println("");
            System.out.println("Удаление Модели");
            try {
                scooter.delNamePriceModel("Buclazhan");
            } catch (NoSuchModelNameException e) {
                System.out.println(e);
            }
            StaticClass.printNameModels(scooter);
            StaticClass.printPriseModels(scooter);

            System.out.println("");
            System.out.println("Изменение названия Модели");
            try {
                scooter.changeNameModel("model0", "model99");
            } catch (DuplicateModelNameException | NoSuchModelNameException e) {
                System.out.println(e);
            }
            StaticClass.printNameModels(scooter);
            StaticClass.printPriseModels(scooter);

            System.out.println("");
            System.out.println("Изменение цены Модели");
            try {
                scooter.setPriceByName("model1", 187);
            } catch (NoSuchModelNameException e) {
                System.out.println(e);
            }
            StaticClass.printNameModels(scooter);
            StaticClass.printPriseModels(scooter);
            System.out.println("");

            //Задание 4
            System.out.println("----------Task4----------");
            Quadbike quadbike = new Quadbike("Motorik", 5);
            System.out.println("Марка квадроцикла: " + quadbike.getBrand());
            System.out.println("Модели квадроцикла и цены:");
            StaticClass.printNameModels(quadbike);
            StaticClass.printPriseModels(quadbike);

            System.out.println("");
            System.out.println("Добавление Модели");
            try {
                quadbike.addNamePriceModel("Buclazhan", 80000);
            } catch (DuplicateModelNameException e) {
                System.out.println(e);
            }
            StaticClass.printNameModels(quadbike);
            StaticClass.printPriseModels(quadbike);

            System.out.println("");
            System.out.println("Удаление Модели");
            try {
                quadbike.delNamePriceModel("Buclazhan");
            } catch (NoSuchModelNameException e) {
                System.out.println(e);
            }
            StaticClass.printNameModels(quadbike);
            StaticClass.printPriseModels(quadbike);

            System.out.println("");
            System.out.println("Изменение названия Модели");
            try {
                quadbike.changeNameModel("model0", "model99");
            } catch (DuplicateModelNameException | NoSuchModelNameException e) {
                System.out.println(e);
            }
            StaticClass.printNameModels(quadbike);
            StaticClass.printPriseModels(quadbike);

            System.out.println("");
            System.out.println("Изменение цены Модели");
            try {
                quadbike.setPriceByName("model1", 187);
            } catch (NoSuchModelNameException e) {
                System.out.println(e);
            }
            StaticClass.printNameModels(quadbike);
            StaticClass.printPriseModels(quadbike);
            System.out.println("");

            //Задание 5
            System.out.println("----------Task5----------");
            Moped moped = new Moped("Mospeed", 5);
            System.out.println("Марка мопеда: " + moped.getBrand());
            System.out.println("Модели мопеда и цены:");
            StaticClass.printNameModels(moped);
            StaticClass.printPriseModels(moped);

            System.out.println("");
            System.out.println("Добавление Модели");
            try {
                moped.addNamePriceModel("Buclazhan", 80000);
            } catch (DuplicateModelNameException e) {
                System.out.println(e);
            }
            StaticClass.printNameModels(moped);
            StaticClass.printPriseModels(moped);

            System.out.println("");
            System.out.println("Удаление Модели");
            try {
                moped.delNamePriceModel("Buclazhan");
            } catch (NoSuchModelNameException e) {
                System.out.println(e);
            }
            StaticClass.printNameModels(moped);
            StaticClass.printPriseModels(moped);

            System.out.println("");
            System.out.println("Изменение названия Модели");
            try {
                moped.changeNameModel("model0", "model99");
            } catch (DuplicateModelNameException | NoSuchModelNameException e) {
                System.out.println(e);
            }
            StaticClass.printNameModels(moped);
            StaticClass.printPriseModels(moped);

            System.out.println("");
            System.out.println("Изменение цены Модели");
            try {
                moped.setPriceByName("model1", 187);
            } catch (NoSuchModelNameException e) {
                System.out.println(e);
            }
            StaticClass.printNameModels(moped);
            StaticClass.printPriseModels(moped);
            System.out.println("");

            //Задание 6
            System.out.println("----------Task6----------");
            System.out.println("Средняя арифметическая цена среди ... ТС: " + StaticClass.arithmeticMeanOfModelPrices(scooter, quadbike, moped));
            System.out.println("");

            //Задание 7
            System.out.println("----------Task7----------");
            System.out.println("Класс, Brand, size,... name,price");
            transport_vehicle cari = StaticClass.readTransportVehicle();
            StaticClass.writeTransportVehicle(cari);

        }
        catch (ClassNotFoundException | InstantiationException | InvocationTargetException | NoSuchMethodException |
               IllegalAccessException | NoSuchModelNameException | IOException |DuplicateModelNameException e)
        {
            System.out.println(e.getMessage());
        }


    }
}
