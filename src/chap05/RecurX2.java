package chap05;

import chap04.IntStack;

public class RecurX2 {
    static void recur(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {                                // 4
                s.push(n);                              // 4push 3push 2push 1push 2push 1push 1push
                n = n - 1;                              // n=3 n=2 n=1 n=0 n=1 n=0
                continue;
            }

            if (s.isEmpty() != true) {                  //
                n = s.pop();                            // 4pop
                System.out.println(n);                  // 4출력 3출력
                n = n - 2;                              // n=2 n=1
                continue;
            }
            break;
        }

    }
}
