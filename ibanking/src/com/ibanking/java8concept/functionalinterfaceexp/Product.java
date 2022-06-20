package com.ibanking.java8concept.functionalinterfaceexp;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface Product {

	boolean checkAvailability(int productId, Predicate p);

	void updateStatus(int productId, Consumer region);

}
