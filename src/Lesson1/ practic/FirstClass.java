
public class FirstClass {
        public static void main(String[] args) {
                int sel1= 2;
                int sel2 = 3;
                int sel3 = 1;
                int sel4 =4;
                int sel5=-34;
                System.out.println ("Задание 1 :" + myMath(sel1,sel2,sel3,sel4));
                System.out.println("Задание 2 :" +checkInterval(7,12));
                System.out.println("Задание3 : Число"+ sel5 + "является положительным:"+ checkNumber(sel5));
                System.out.println("Задание 4 :"+Hello("Александр"));
        }
                public static float myMath (int a, int b, int c, int d) {
                return a*(b+((float) c/d));
        }
        public static boolean checkInterval(int one, int too) {
                int summa=one+too;
                return (summa<=20)&&(summa>10);
        }
        public static boolean checkNumber(int number){
           return number>=0;
        }
        public static String Hello(String name) {
                return ("Привет,"+ name +"!");

        }
}









