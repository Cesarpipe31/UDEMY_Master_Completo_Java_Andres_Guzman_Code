import java.sql.SQLOutput;

public class Primitivos {
    public static void main(String[] args){
        System.out.println(" ---  BYTE  --- ");
        Byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en Byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor máximo de un byte " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte " + Byte.MIN_VALUE);
        System.out.println(" ");

        System.out.println(" ---  SHORT --- ");
        Short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en Byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor máximo de un short " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short " + Short.MIN_VALUE);
        System.out.println(" ");

        System.out.println(" ---  INT --- ");
        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en Byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor máximo de un int " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un int " + Integer.MIN_VALUE);
        System.out.println(" ");

        System.out.println(" ---  LONG --- ");
        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroInt);
        System.out.println("tipo long corresponde en Byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor máximo de un long " + Long.MAX_VALUE);
        System.out.println("valor minimo de un long " + Long.MIN_VALUE);
        System.out.println(" ");

        System.out.println(" ---  FLOAT --- ");
        float numeroFloat = 1.0F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("tipo float corresponde en Byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("valor máximo de un float " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float " + Float.MIN_VALUE);
        System.out.println(" ");

        System.out.println(" ---  DOUBLE  --- ");
        double numeroDouble = 1.0;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("tipo double corresponde en Byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("valor máximo de un double " + Double.MAX_VALUE);
        System.out.println("valor minimo de un double " + Double.MIN_VALUE);
        System.out.println(" ");


    }
}
