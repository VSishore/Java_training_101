public class apple_orange_problem {
    public static void count_fruit(int[] apple,int[] orange,int apple_tree_dist,int orange_tree_dist,int[] home){
        System.out.println("---------------------------");
        if(home.length==2) {
            //apple
            int count_apple = 0;
            for (int k : apple) {
                    int dist = apple_tree_dist + k;
                    if (dist >= home[0] && dist <= home[1]) {
                        count_apple++;
                        System.out.println(k);
                    }
            }
            System.out.println("---------------------------");
            //orange
            int count_orange = 0;
            for (int i : orange) {
                    int dist = orange_tree_dist + i;
                    if (dist >= home[0] && dist <= home[1]) {
                        count_orange++;
                        System.out.println(i);
                    }
            }
            System.out.println("---------------------------");
            System.out.println(STR."the apple count is: \{count_apple}");
            System.out.println(STR."The Orange count is: \{count_orange}");
        }
        else{
            System.out.println("the home size is not in range");
        }
    }

    public  static void main(String[] args){
        int[] apple={2,3,-4};
        int[] orange= {3, -2, -4};
        int apple_tree_dist=4;
        int orange_tree_dist=12;
        int[] home={7,10};
        count_fruit(apple,orange,apple_tree_dist,orange_tree_dist,home);
    }
}
