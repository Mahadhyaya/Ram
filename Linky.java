import java.util.LinkedList;
import java.util.List;

public class Linky {
    public static void main(String[] args) {
        LinkedList<Character> link = new LinkedList<>();
        link.add('B');
        link.add('E');
        link.add('F');
        System.out.println("Original Contents:" + link);
        link.addLast('G');
        link.addFirst('A');
        System.out.println("After this");
        System.out.println("Contents:" + link);
        link.add(2, 'D');
        link.add(2, 'C');
        System.out.println("After Insertion");
        System.out.println("Contents:" + link);
        System.out.println("The First and last elements are:" + link.getFirst() + " " + link.getLast());
        List<Character> sub = link.subList(2, 5);
        System.out.println("Contents of sublist view:" + sub);
        LinkedList<Character> l1 = new LinkedList<>(sub);
        link.removeAll(l1);
        System.out.println("After Removing l1 from link");
        System.out.println("Contents are:" + link);
        link.removeFirst();
        link.removeLast();
        System.out.println("After Removing First and Last element:");
        System.out.println("Contents :" + link);
        link.set(0, Character.toLowerCase(link.get(0)));
        System.out.println("After Changes:" + link);
        link.clear();
        System.out.println("After Changes:" + link);
        link.addAll(l1);
        System.out.println("After Changes:" + link);
        System.out.println(link.contains('D'));
        System.out.println(link.element());
        System.out.println(link.pollLast());
        System.out.println(link);
        String str = link.toString();
        Object[] array = link.toArray();
        System.out.println("The elements converted to array are:");
        for (Object i : array) {
            System.out.println(i);
        }
        
    }
}
