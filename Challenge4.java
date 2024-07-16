import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Bag b = new Bag();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1. Add Ball\n2. Remove ball\n3. Check if the bag is empty\n4. Check which game we can play\n5. Exit");
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the ball type (BASKETBALL/TENNISBALL): ");
                    String ballType = sc.next();
                    if (ballType.equalsIgnoreCase("BASKETBALL")) {
                        b.addBall(new Basketball("red", 2000, 25));
                    } else if (ballType.equalsIgnoreCase("TENNISBALL")) {
                        b.addBall(new Tennisball("green", 60, 10));
                    } else {
                        System.out.println("Invalid ball type.");
                    }
                    break;
                case 2:
                    System.out.println("Enter the position of the ball to remove: ");
                    int pos = sc.nextInt();
                    b.removeBall(pos);
                    break;
                case 3:
                    if (b.isEmpty()) {
                        System.out.println("The bag is empty.");
                    } else {
                        System.out.println("The bag has some balls.");
                    }
                    break;
                case 4:
                    b.checkGame();
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Ball {
    private double radius;

    Ball() {
    }

    Ball(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

class Basketball extends Ball {
    String color;
    double price;

    Basketball(String color, double price, int radius) {
        super(radius);
        this.color = color;
        this.price = price;
    }
}

class Tennisball extends Ball {
    String color;
    double price;

    Tennisball(String color, double price, int radius) {
        super(radius);
        this.color = color;
        this.price = price;
    }
}

class Bag {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    Ball[] balls = new Ball[size];
    int count = 0;


    public void addBall(Ball ball) {
        if (count < balls.length) {
            balls[count] = ball;
            count++;
            System.out.println("Ball added successfully.");
        } else {
            System.out.println("The bag is full.");
        }
    }

    public void removeBall(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                balls[i] = balls[i + 1];
            }
            balls[count - 1] = null;
            count--;
            System.out.println("Ball removed successfully.");
        } else {
            System.out.println("Invalid position.");
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void checkGame() {
        int bbCount = 0;
        int tbCount = 0;
        for (int i = 0; i < count; i++) {
            if (balls[i] instanceof Basketball) {
                bbCount++;
            } else if (balls[i] instanceof Tennisball) {
                tbCount++;
            }
        }
        if (bbCount > 0 && tbCount == 0) {
            System.out.println("You can play basketball.");
        } else if (tbCount > 0 && bbCount == 0) {
            System.out.println("You can play tennis.");
        } else if (bbCount > 0 && tbCount > 0) {
            System.out.println("You can play both basketball and tennis.");
        } else {
            System.out.println("There are no balls in the bag to play any game.");
        }
    }
}


//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Challenge4 {
//    public static void main(String[] args) {
//        Bag b = new Bag();
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("-----------------------------------------------------");
//            System.out.println("1. Add Ball\n2. Remove Ball\n3. Check if the bag is empty\n4. Check which game we can play\n5. Exit");
//            System.out.print("Enter your choice: ");
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter the ball type (BASKETBALL/TENNISBALL): ");
//                    String ballType = sc.next().toUpperCase();
//                    if (ballType.equals("BASKETBALL")) {
//                        b.addBall(new Basketball("red", 2000, 25));
//                    } else if (ballType.equals("TENNISBALL")) {
//                        b.addBall(new Tennisball("green", 60, 10));
//                    } else {
//                        System.out.println("Invalid ball type.");
//                    }
//                    break;
//                case 2:
//                    System.out.println("Enter the position of the ball to remove: ");
//                    int position = sc.nextInt();
//                    b.removeBall(position-1);
//                    break;
//                case 3:
//                    if (b.isEmpty()) {
//                        System.out.println("The bag is empty.");
//                    } else {
//                        System.out.println("The bag has some balls.");
//                    }
//                    break;
//                case 4:
//                    b.checkGame();
//                    break;
//                case 5:
//                    sc.close();
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//}
//
//class Ball {
//    private double radius;
//
//    Ball() {
//    }
//
//    Ball(int radius) {
//        this.radius = radius;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//}
//
//class Basketball extends Ball {
//    String color;
//    double price;
//
//    Basketball(String color, double price, int radius) {
//        super(radius);
//        this.color = color;
//        this.price = price;
//    }
//}
//
//class Tennisball extends Ball {
//    String color;
//    double price;
//
//    Tennisball(String color, double price, int radius) {
//        super(radius);
//        this.color = color;
//        this.price = price;
//    }
//}
//
//class Bag {
//    private ArrayList<Ball> balls;
//
//    Bag() {
//        balls = new ArrayList<>();
//    }
//
//    public void addBall(Ball ball) {
//        balls.add(ball);
//        System.out.println("Ball added.");
//    }
//
//    public void removeBall(int index) {
//        if (index >= 0 && index < balls.size()) {
//            balls.remove(index);
//            System.out.println("Ball removed.");
//        } else {
//            System.out.println("Invalid position.");
//        }
//    }
//
//    public boolean isEmpty() {
//        return balls.isEmpty();
//    }
//
//    public void checkGame() {
//            int bbCount = 0;
//            int tbCount = 0;
//            for (Ball ball : balls) {
//                if (ball instanceof Basketball) {
//                    bbCount++;
//                } else if (ball instanceof Tennisball) {
//                    tbCount++;
//                }
//            }
//            if (bbCount > 0 && tbCount == 0) {
//                System.out.println("You can play basketball.");
//            } else if (tbCount > 0 && bbCount == 0) {
//                System.out.println("You can play tennis.");
//            } else if (bbCount > 0 && tbCount > 0) {
//                System.out.println("You can play both basketball and tennis.");
//            } else {
//                System.out.println("There are no balls in the bag to play any game.");
//            }
//
//    }
//}

