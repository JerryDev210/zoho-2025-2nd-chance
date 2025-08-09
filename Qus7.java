import java.util.*;
public class Qus7 {

    public static void main(String[] args) {
        Stack<Integer> tallQueue = new Stack<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++) {
            int newPerson =in.nextInt();
            while (!tallQueue.isEmpty() && tallQueue.peek()<newPerson) {
                tallQueue.pop();
            }
            tallQueue.add(newPerson);
        }
        // we can use recursive call to print 
        Collections.reverse(tallQueue);
        while (!tallQueue.isEmpty()) {
            System.out.print(tallQueue.pop()+" ");
        }
    }
}

/*
5
10 5 15 8 3

6
10 5 12 8 3 15

 */