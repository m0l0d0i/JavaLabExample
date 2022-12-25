/*
Задача #1001

Исходные данные:
Входной поток содержит набор целых чисел Ai (0 ≤ Ai ≤ 1018), отделённых друг от друга
произвольным количеством пробелов и переводов строк. Размер входного потока не превышает 256 КБ.

Результат:
Для каждого числа Ai, начиная с последнего и заканчивая первым, в отдельной строке вывести его
квадратный корень не менее чем с четырьмя знаками после десятичной точки.
*/

import java.io.*;
import java.util.*;

public class Timus_1001 
{
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException 
    {
        StringTokenizer tokenizer;
        Stack<Double> stack = new Stack<Double>();
        String line;
        while ( (line = reader.readLine()) != null ) 
        {
            tokenizer = new StringTokenizer(line);
            while (tokenizer.hasMoreTokens()) 
            {
                stack.add(Math.sqrt(Double.parseDouble(tokenizer.nextToken())));
            }
        }
        while (!stack.empty()) 
        {
            System.out.println(stack.pop());
        }
    }
}