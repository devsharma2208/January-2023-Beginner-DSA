package IterativeStatement.AssignmentQuestions;

import java.util.Scanner;

public class AntiFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
