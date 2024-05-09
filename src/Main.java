//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                System.out.println(checkString("Questa è una stringa"));
            }

            private static String checkString(String value) {

                return (value.length() >= 10) ? "lunghezza maggiore o uguale di 10" : "Lunghezza minore di 10";
            }
    }



