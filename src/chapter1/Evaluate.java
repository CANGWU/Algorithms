package chapter1;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/15 9:03
 */
public class Evaluate {

    public static void main(String[]args){



        Stack<Double> vals = new Stack<>();
        Stack<String> ops = new Stack<>();

        while (!StdIn.isEmpty()){

           String s = StdIn.readString();


            switch (s){


                case "(" :

                    break;
                case "+":
                    ops.push(s);
                    break;
                case "-":
                    ops.push(s);
                    break;
                case "*":
                    ops.push(s);
                    break;
                case "/":
                    ops.push(s);
                    break;
                case "sqrt":
                    ops.push(s);
                    break;

                case ")":

                    double v = vals.pop();
                    String o = ops.pop();

                    switch (o){
                        case "+":
                            v = vals.pop() + v;
                            break;
                        case "-":
                            v = vals.pop() - v;
                            break;
                        case "*":
                            v = vals.pop() * v;
                            break;
                        case "/":
                            v = vals.pop() / v;
                            break;
                        case "sqrt":
                            v = Math.sqrt(v);
                    }
                    vals.push(v);
                    break;
                default:
                    vals.push(Double.parseDouble(s));

            }

        }
        StdOut.println(vals.pop());

    }




}
