package Enum;

import java.util.Date;

import entities.order;
import entities.enums.orderstatus;

public class Exemplo {

	public static void main(String[] args) {
		order order = new entities.order(1080, new Date(), orderstatus.pending_payment);

		System.out.println(order);

		orderstatus os1 = orderstatus.delivered;
		 orderstatus os2 = orderstatus.valueOf("delivered");
		
		 System.out.println(os1);
		System.out.println(os2);
	}

}
