import java.util.Scanner;

public class Area {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.print("Enter a string value: ");
        String name = sc.next();
        System.out.println(vowelCheck(name));
        System.out.println("-----------------------------------");
        boolean b = true;
        while (b) {
            System.out.println("\n1.area_triangle\n2.volume_cube\n3.volume_cuboid\n4.volume_cylinder\n5.area_circle\n6.Exit");
            System.out.println("-----------------------------------");
            System.out.print("Enter a choice: ");
            String choice = sc.next();
            switch (choice) {
                case "area_triangle": {
                    System.out.print("Enter the base value: ");
                    float base = sc.nextFloat();
                    System.out.print("Enter the height value: ");
                    float height = sc.nextFloat();
                    System.out.println("The area of the triangle: " + triangle(base, height));
                    break;

                }
                case "volume_cube": {
                    System.out.print("Enter the radius value for the cube: ");
                    float rad_cube = sc.nextFloat();
                    System.out.println("The volume of the cube: " + cube(rad_cube));
                    break;
                }
                case "volume_cuboid": {
                    System.out.print("Enter the length value: ");
                    float length = sc.nextFloat();
                    System.out.print("Enter the breadth value: ");
                    float breadth = sc.nextFloat();
                    System.out.print("Enter the height value: ");
                    float height_cub = sc.nextFloat();
                    System.out.println("The volume of the cuboid: " + cuboid(length, breadth, height_cub));
                    break;
                }
                case "volume_cylinder": {
                    System.out.print("Enter the radius value for the cylinder: ");
                    float rad_CY = sc.nextFloat();
                    System.out.print("Enter the height value for the cylinder: ");
                    float height_CY = sc.nextFloat();
                    System.out.println("The volume of the cylinder: " + cylinder(rad_CY, height_CY));
                    break;
                }
                case "area_circle": {
                    System.out.print("Enter the radius value for the cube: ");
                    float rad_circle = sc.nextFloat();
                    System.out.println("The area of circle: " + circle(rad_circle));
                    break;
                }
                case "Exit": {
                    b = false;
                    break;
                }
                default: {
                    System.out.println("!!!!!!!!!!!!Enter the name in list!!!!!!!!!!!!");
                }
            }
            System.out.println("-----------------------------------");
        }
    }
    public static float circle(float rad) {
        return ((float) Math.PI * rad * rad);
    }

    public static float triangle(float base, float height) {
        return 0.5f * base * height;
    }

    public static float cylinder(float rad, float height) {
        return (float) Math.PI * rad * rad * height;
    }

    public static float cube(float rad) {
        return rad * rad * rad;
    }

    public static float cuboid(float length, float breadth, float height) {
        return length * breadth * height;
    }


    public static String vowelCheck(String name) {
        String name1 = name.toLowerCase();
        for (int i = 0; i < name1.length(); i++) {
            char ch = name1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel is present";
            }
        }
        return "Vowel is not present";
    }
}
/*
        System.out.println("-----------------------------------");
        System.out.print("Enter the base value: ");
        float base = sc.nextFloat();
        System.out.print("Enter the height value: ");
        float height = sc.nextFloat();
        System.out.println("The area of the triangle: " + triangle(base, height));
        System.out.println("-----------------------------------");
        System.out.print("Enter the radius value for the cube: ");
        float rad_cube = sc.nextFloat();
        System.out.println("The volume of the cube: " + cube(rad_cube));
        System.out.println("-----------------------------------");
        System.out.print("Enter the radius value for the cylinder: ");
        float rad_CY = sc.nextFloat();
        System.out.print("Enter the height value for the cylinder: ");
        float height_CY = sc.nextFloat();
        System.out.println("The volume of the cylinder: " + cylinder(rad_CY, height_CY));
        System.out.println("-----------------------------------");
        System.out.print("Enter the length value: ");
        float length = sc.nextFloat();
        System.out.print("Enter the breadth value: ");
        float breadth = sc.nextFloat();
        System.out.print("Enter the height value: ");
        float height_cub = sc.nextFloat();
        System.out.println("The volume of the cuboid: " + cuboid(length, breadth, height_cub));
*/