package is.ru.stringcalculator;

import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
        text = text.replaceAll("[^-?0-9]+", ",");
        if(text.contains(",")){
            
            int summa = sum(splitNumbers(text));
//            if( summa == 1 )
//                throw new IllegalArgumentException("Negatives not allowed: -1");

            return summa;
            //return sum(splitNumbers(text));
        }
		else
			return Integer.parseInt(text);
	}

    private static String[] splitNumbers(String numbers){
        return numbers.split(",");
    }

    private static int sum(String[] numbers){
        int total = 0;
        for(String number : numbers){
            if( Integer.parseInt(number) < 0 )
                negativeNumberErrorHandler( numbers );
            if( Integer.parseInt(number) > 1000 ) {}
            else
                total += Integer.parseInt(number);
        }
        return total;
    }
    static void negativeNumberErrorHandler(String[] numbers) {
        String errorMessage = "Negatives not allowed: ";
        int numberOfNumbers = 0;
        for( String number : numbers ) {
            if( Integer.parseInt(number) < 0 ) {
                if( numberOfNumbers > 0 )
                    errorMessage = errorMessage + ",";
                errorMessage = errorMessage + number;
                numberOfNumbers++;
            }
        }
        throw new IllegalArgumentException(errorMessage);
    }
}
