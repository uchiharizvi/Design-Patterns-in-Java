package Behavioural.Strategy.Example002.JDK8;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;
@FunctionalInterface
public interface Discounter extends UnaryOperator<BigDecimal> {
//    BigDecimal applyDiscount(BigDecimal amount);

    default Discounter combine(Discounter after){
        return value -> after.apply(this.apply(value));
    }
//    static Discounter christmasDiscounter(){
//        return amount->amount.multiply(BigDecimal.valueOf(0.9));
//    }
//    static Discounter newYearDiscounter(){
//        return amount->amount.multiply(BigDecimal.valueOf(0.8));
//    }
//    static Discounter easterDiscounter(){
//        return amount->amount.multiply(BigDecimal.valueOf(0.5));
//    }

}
