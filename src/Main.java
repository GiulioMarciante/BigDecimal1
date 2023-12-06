import java.math.BigDecimal;
import java.math.RoundingMode;

//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
// (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum,
// crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
public class Main {
    public static void main(String[] args) {
        BigDecimal bigNum1 = BigDecimal.valueOf(10.3);
        BigDecimal bigNum2 = BigDecimal.valueOf(2.2);
        System.out.println(calculateOperation(bigNum1,bigNum2,AritmeticOp.DIVISION));
    }
    public static BigDecimal calculateOperation(BigDecimal n1, BigDecimal n2,AritmeticOp operator){
        BigDecimal bigResult = BigDecimal.valueOf(0.0);
        switch(operator){
            case AritmeticOp.ADDITION:
                System.out.println("Risultato dell'addizione:");
                bigResult = n1.add(n2);
                break;
            case AritmeticOp.SUBTRACTION:
                System.out.println("Risultato della sottrazione:");
                bigResult = n1.subtract(n2);
                break;
            case AritmeticOp.MULTIPLICATION:
                System.out.println("Risultato della moltiplicazione:");
                bigResult = n1.multiply(n2);
                break;
            case AritmeticOp.DIVISION:
                System.out.println("Risultato della divisione:");
                bigResult = n1.divide(n2,2, RoundingMode.HALF_DOWN);
                break;
            case AritmeticOp.MIN:
                System.out.println("Il valore minimo tra "+ n1 + " e " + n2 + " è:");
                bigResult = n1.min(n2);
                break;
            case AritmeticOp.MAX:
                System.out.println("Il valore massimo tra "+ n1 + " e " + n2 + " è:");
                bigResult = n1.max(n2);
                break;
            default:
        }
        return bigResult;
    }
}