
import java.util.PriorityQueue;
import java.util.Queue;

class Que{
    public static void main(String[] args) {
        Queue <String> nav=new PriorityQueue<String>();
         nav.offer("Naveen");
         nav.offer("vedha");
         nav.offer("santhosh");
         
         while(!nav.isEmpty()){
        System.out.println(nav.poll());
         }
    }
    
}
