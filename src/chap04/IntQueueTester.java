package chap04;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntQueue queue = new IntQueue(64);

        while (true) {
            System.out.println();
            System.out.println("현재 데이터 개수: " + queue.size() + " / " + queue.getCapacity());
            System.out.println("(1) enque (2) deque (3) peek (4) dump (0) end");

            int menu = sc.nextInt();
            if (menu == 0) {
                break;
            }

            int value;
            switch (menu) {
                case 1:
                    System.out.print("데이터: ");
                    value = sc.nextInt();
                    try {
                        queue.enque(value);
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다");
                    }
                    break;

                case 2:
                    try {
                        value = queue.deque();
                        System.out.println("디큐한 데이터는 " + value + "입니다");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다");
                    }
                    break;

                case 3:
                    try {
                        value = queue.peek();
                        System.out.println("피크한 데이터는 " + value + "입니다");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다");
                    }
                    break;

                case 4:
                    queue.dump();
                    break;
            }
        }
    }
}
