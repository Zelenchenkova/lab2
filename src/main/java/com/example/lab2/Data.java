package com.example.lab2;

public class Data {

    public final static String QUESTION_1 = "1. Проводяться дві лотереї: \"4 з 32\" і \"5 з 64\". \nПовідомлення про результати який з лотерей несе більше інформації?";
    public final static String QUESTION_2 = "2. В кошику лежать 8 чорних куль і 24 білих. \nСкільки інформації несе повідомлення про те, що дістали чорний шар?";
    public final static String QUESTION_3 = "3. Яке максимально можливе число символів \nможе містити алфавіт, у якого розрядність двійкового коду дорівнює 6?";

    public final static String ANSWER_1 = "" +
            "Перший шлях вирішення тривіальний: \n"+
            "Події рівноімовірні. \n"+
            "Тому в першій лотереї кількість інформації про один виграш 5 біт\n" +
            "(2⁵ = 32), а в другій - 6 біт (2⁶ = 64). \n" +
            "Повідомлення про чотири виграші в першій лотереї несе 5х4 = 20 біт. \n" +
            "Повідомлення про п'ять виграшів другий лотереї несе 6х5 = 30 біт. \n" +
            "Отже, повідомлення про результати другої лотереї несе більше інформації.\n\n" +
            "Але можливий і такий шлях міркування:\n" +
            "Вибір першої кулі проводиться з 32 куль в барабані. \n"+
            "Результат несе 5 біт інформації. Але 2-й шар буде\n" +
            "вибиратися вже з 31 номера, 3-й - з 30 номерів, 4-й - з 29. \n" +
            "Отже, кількість інформації, яке несе 2-й номер, знаходиться з рівняння:\n" +
            "2ᶤ = 31, звідси i = 4,95420біта.\n" +
            "Для 3-го номера: 2ᶤ = 30;i = 4,90689біта.\n" +
            "Для 4-го номера: 2ᶤ = 29; i = 4,85798 біта.\n" +
            "У сумі отримуємо: 5 + 4,95420 + 4,90689 + 4,85798 = 19,71907 біта";

    public final static String ANSWER_2 = "" +
            "Дано: Kч = 8, Кк = 24. Знайти Iч =?\n" +
            "N = 8 + 24 = 32 всього куль\n" +
            "Рч = 8/32 = (0,25) записуємо 1/4-ймовірність діставання чорної кулі\n" +
            "Iч = log2 (1/1/4) = 2 біта\n" +
            "Повідомлення про те, що дістали чорну кулю, несе 2 біти інформації.";
    public final static String ANSWER_3 = "2⁶ = 64\n" +
            "Отже максимально можлива кількість символів такого алфавіту 64.";

}
