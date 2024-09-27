package org.example.project2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

@RestController
public class Controller {

    //1
    //@RequestMapping("/currentTime")
    //public LocalDateTime currentTime() {
    //    return LocalDateTime.now();
    //}


    //2
    //@RequestMapping ("/api")
    //public List<Integer> getNumbers(@RequestParam int q) {
    //    List<Integer> numbers = new ArrayList<>();
    //    for (int i = 1; i <= q; i++) {
    //        numbers.add(i);
    //    }
    //    return numbers;
    //}


    //3
    //private Random random = new Random();

    //@RequestMapping("/random_number")
    //public int getRandomNumber() {
    //    return random.nextInt(500) + 1;
    //}


    //4
//    @RequestMapping("/fib")
//    public long fibonacci(@RequestParam int num){
//        return fib(num);
//    }
//    private long fib(int q) {
//        if (q <= 1) {
//            return q;
//        }
//        long before = 0, current = 1;
//        for (int i = 2; i <= q; i++) {
//            long a = current;
//            current += before;
//            before = a;
//        }
//        return current;
//        }
//    }


    //5
//    @RequestMapping("/{string}")
//    public String reverseString(@PathVariable String string) {
//        return new StringBuilder(string).reverse().toString();
//    }






    //Dop.zad.

    //1
//    @RequestMapping("/dayOfWeek")
//    public String getDayOfWeek(@RequestParam String date) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        LocalDate localDate = LocalDate.parse(date, formatter);
//        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
//
//        return dayOfWeek.toString();
//    }

    //2
//    @RequestMapping("/api2")
//    public int[] getNumbers(@RequestParam int q) {
//        int[] num = new int[q];
//
//        for (int i = 0; i < q; i++) {
//            num[i] = i + 1;
//        }
//        return num;
//    }




    //3_4
//    @RequestMapping("/fib")
//    public long fibonacci(@RequestParam int q) {
//        return fib(q);
//    }
//    private long fib(int num) {
//        if (num <= 1) {
//            return num;
//        }
//        long[] fibArray = new long[num + 1];
//        fibArray[0] = 0;
//        fibArray[1] = 1;
//        for (int i = 2; i <= num; i++) {
//            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
//        }
//        return fibArray[num];
//    }



    //5
//    @RequestMapping("/{string}")
//    public String getStringLength(@PathVariable String string) {
//        int length = string.length();
//        return length + " символов.";
//    }



}








