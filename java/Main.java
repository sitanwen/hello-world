import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // 创建随机数生成器和扫描器
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 生成1到100之间的随机数
        int targetNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("欢迎来到数字猜谜游戏!");
        System.out.println("我已经想好了一个1到100之间的数字。");
        System.out.println("你能猜出这个数字吗？");

        // 循环直到用户猜对数字
        while (userGuess != targetNumber) {
            System.out.print("请输入你的猜测: ");

            // 检查输入是否为整数
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                attempts++;

                // 给出提示
                if (userGuess < targetNumber) {
                    System.out.println("太小了！再再试大一点。");
                } else if (userGuess > targetNumber) {
                    System.out.println("太大了！请再猜小一点。");
                } else {
                    System.out.println("恭喜你，猜对了！");
                    System.out.println("你用了" + attempts + "次猜出了正确答案。");
                }
            } else {
                System.out.println("请输入一个有效的整数！");
                scanner.next(); // 清除无效输入
            }
        }

        // 关闭扫描器
        scanner.close();
    }
}
