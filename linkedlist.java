import java.util.LinkedList;
public class linkedlist {
   
    public static void main(String[] args) {
        LinkedList <String> link=new LinkedList<String>();
        link.offer("Nav");
        link.offer("asfs");
        link.offer("sdgd");
        link.offer("sdgs");
        System.out.println(link);
        link.add(3,"adgweg");
        System.out.println(link);
       /* while(!link.isEmpty()){
               link.remove();
               System.out.println(link);

       */ 
        String first=link.peekFirst();
        String last=link.peekLast();
        System.out.println(first);
        System.out.println(last);
    }
    
}