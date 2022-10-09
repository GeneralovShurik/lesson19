package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
	// коллекции
        //создадим класс Node+
        MyList list = new MyList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();

        //Date,Calendar
        // если дефолтный в date запишется текущее время системы

        Date date = new Date();
        System.out.println(date);


        //если готовый date
        date.setTime(54664546);
        System.out.println(date);

        //если нету но хотим создать свою
        Date date2 = new Date(4444444448888l);
        System.out.println(date2);

        // форматирование даты
        SimpleDateFormat format = new SimpleDateFormat("MM yy dd");
        System.out.println(format.format(date));

        //есть строка с датой --её превратить в объект date
        //Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        //Date d = format.parse(s);
        //System.out.println(d);

        //Calendar-это абстрактный класс
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        c.set(Calendar.MONTH, Calendar.SEPTEMBER);
        c.set(Calendar.DAY_OF_MONTH, 3);
        System.out.println(c);
        c.add(Calendar.YEAR, 1);
        c.add(Calendar.HOUR, -2);
        System.out.println(c);

        Date d = c.getTime();
        System.out.println(format.format(d));


        GregorianCalendar gc = new GregorianCalendar();
        gc.isLeapYear(1200);


    }
}
