package com.mycompany.app;



import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        port(getHerokuAssignedPort());

        get("/", (req, res) -> "Hello, World");

        post("/compute", (req, res) -> {
            //System.out.println(req.queryParams("input1"));
            //System.out.println(req.queryParams("input2"));

            String input1 = req.queryParams("input1");
            java.util.Scanner sc1 = new java.util.Scanner(input1);
            sc1.useDelimiter("[;\r\n]+");
            java.util.ArrayList<Integer> inputList = new java.util.ArrayList<>();
            while (sc1.hasNext())
            {
                int value = Integer.parseInt(sc1.next());
                inputList.add(value);
            }
            System.out.println(inputList);

            String input2 = req.queryParams("input2");
            java.util.Scanner sc2 = new java.util.Scanner(input2);
            sc2.useDelimiter("[;\r\n]+");
            int[] intArray= new int[100];
            int counter=0;
            while (sc2.hasNext())
            {
                int value = Integer.parseInt(sc2.next());
                intArray[counter]=value;
                counter++;
            }
            System.out.println(intArray);

            String input3 = req.queryParams("input3");
            java.util.Scanner sc3 = new java.util.Scanner(input3);
            sc3.useDelimiter("[;\r\n]+");
            String str3=sc3.next();

            String input4 = req.queryParams("input4");
            java.util.Scanner sc4 = new java.util.Scanner(input4);
            sc4.useDelimiter("[;\r\n]+");
            String str4=sc4.next();


            int answer=App.addAndMultiply(inputList, intArray,str3,str4);


            Map map = new HashMap();
            map.put("result", answer);
            return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());


        get("/compute",
                (rq, rs) -> {
                    Map map = new HashMap();
                    map.put("result", "not computed yet!");
                    return new ModelAndView(map, "compute.mustache");
                },
                new MustacheTemplateEngine());
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }




    public static int addAndMultiply(ArrayList<Integer> arrayList, int[] array, String str1, String str2) {
        System.out.println("inside of method");
        if (arrayList == null) return 0;
        if (array == null) return 0;

        int sumOfArrayList = 0;
        int sumOfArray = 0;

        // ArrayList<Integer> ve int[] parametrelerinin toplamını bul
        for (Integer num : arrayList) {
            sumOfArrayList += num;
        }

        for (Integer num : array) {
            sumOfArray += num;
        }

        int firstNumber,secondNumber;

        if (str1!=null)
            firstNumber= str1.length()*sumOfArrayList;
        else
            firstNumber= 0;

        if (str2!=null)
            secondNumber=str2.length()*sumOfArray;
        else
            secondNumber= 0;



        int answer= firstNumber+secondNumber;
        System.out.println("the answer is: "+answer);
        return answer;
    }
}

