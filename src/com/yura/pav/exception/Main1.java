package com.yura.pav.exception;

public class Main1 {

    public static void main(String[] args) throws MyExeption {


        Group gr = new Group();
        try {
            gr.addStudent(new Student("Marta", "Che", "white", 20, 3, 312121));
            gr.addStudent(new Student("Wasley", "Krusher", "black", 22, 3, 134324));
            gr.addStudent(new Student("Brian", "Terefin", "black", 19, 3, 454242));
            gr.addStudent(new Student("Den", "Lazkov", "white", 20, 3, 345345));
            gr.addStudent(new Student("Koral", "Illinoys", "black", 21, 3, 543523));

        } catch (MyExeption e) {
            System.out.println(e.getMessage());

        }
        System.out.println(gr);
        System.out.println();

        System.out.println(gr.searchStudent("Lazkov"));

        System.out.println(gr.deleteStudent(134324));

    }
}
