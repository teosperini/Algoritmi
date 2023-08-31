import java.util.LinkedList;

public class ListeConcatenate {
    public static class Node{
        public Node next;
        public int key;
        public Node(int key){
            this.key = key;
        }
        public Node(int key, Node next){
            this.key = key;
            this.next = next;
        }

        @Override
        public String toString() {
            return "[" +
                    "next= " + next +
                    ", key= " + key +
                    ']';
        }
    }


    Node baseNode;
    public ListeConcatenate(){
    }

    public void insert(int key){
        baseNode = new Node(key, baseNode);
    }

    @Override
    public String toString() {
        Node p = baseNode;
        StringBuilder result = new StringBuilder();
        while(p != null){
            result.append(p.key);
            p = p.next;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ListeConcatenate lista = new ListeConcatenate();
        lista.insert(1);
        lista.insert(3);
        lista.insert(5);
        System.out.println(lista);
    }
}
