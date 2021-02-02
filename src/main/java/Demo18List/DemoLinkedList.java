package Demo18List;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> link = new LinkedList<Integer>();
        for (int i =1;i<=10;i++){
            link.add(i);
        }

        System.out.println(link);
    }
}
