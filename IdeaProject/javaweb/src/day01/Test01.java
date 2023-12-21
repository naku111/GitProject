package day01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Passenger domesticFirstClassPassenger = new Passenger(new FirstClassExcessBaggageChargeStrategy());
        Passenger domesticOtherClassPassenger = new Passenger(new OtherClassExcessBaggageChargeStrategy());
        Passenger internationalPassenger = new Passenger(new InternationalExcessBaggageChargeStrategy());
        System.out.println("请输入超重重量:");

        double excessWeight = new Scanner(System.in).nextDouble();

        System.out.println("头等舱超重费用为：" + domesticFirstClassPassenger.getExcessBaggageChargeStrategy(excessWeight) + " RMB");
        System.out.println("其他舱舱超重费用为：" + domesticOtherClassPassenger.getExcessBaggageChargeStrategy(excessWeight) + " RMB");
        System.out.println("外国乘客超重费用为：" + internationalPassenger.getExcessBaggageChargeStrategy(excessWeight) + " RMB");
    }
}
interface ChargeStrategy {
    double calculateCharge(double excessWeight);
}

// 定义国内乘客头等舱超重收费策略
class FirstClassExcessBaggageChargeStrategy implements ChargeStrategy {
    @Override
    public double calculateCharge(double excessWeight) {
        return 4 * excessWeight;
    }
}

// 定义国内乘客其他舱超重收费策略
class OtherClassExcessBaggageChargeStrategy implements ChargeStrategy {
    @Override
    public double calculateCharge(double excessWeight) {
        return 6 * excessWeight;
    }
}

// 定义外国乘客超重收费策略
class InternationalExcessBaggageChargeStrategy implements ChargeStrategy {
    @Override
    public double calculateCharge(double excessWeight) {
        return 12 * excessWeight; // 外国乘客的超重费用是国内乘客的两倍
    }
}

// 定义乘客类
class Passenger {
    ChargeStrategy chargeStrategy;
    public Passenger(ChargeStrategy chargeStrategy) {
        this.chargeStrategy=chargeStrategy;
    }

    public double getExcessBaggageChargeStrategy(double a) {
        return chargeStrategy.calculateCharge(a);
    }
}
