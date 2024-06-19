//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Lunghezza della stringa all'interno delle parentesi tonde
                System.out.println(checkString("Questa è una stringa"));
            }
//metodo in cui mi andrò a creare una Stringa dove poi andremo a controllare la sua lunghezza 
            private static String checkString(String value) {
                
//ritorno di controllo, se la lunghezza della stringa è maggiore o uguale a 10, oppure  è minore di 10
                return (value.length() >= 10) ? "lunghezza maggiore o uguale di 10" : "Lunghezza minore di 10";
            }
    }



