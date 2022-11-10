package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {
	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		StandardCalculator calc = new StandardCalculator();
		calc.divide(1, 0);
		 calc.printResult();
		// res = calc.divide(3, 4);
		//System.out.println(calc.getResult());
		// LogicCalculator calc = new LogicCalculator();
		// calc.AND(8, 6);
		// calc.printResult();
	}
}
