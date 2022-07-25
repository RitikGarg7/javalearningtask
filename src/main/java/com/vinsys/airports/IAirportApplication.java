package com.vinsys.airports;

public interface IAirportApplication {
    /**
     * Should it be 1 airport / or more than airport
     * @param str null|valid values string
     * @return array of item names if found else null
     * @exception  InvalidInputException is returned when you dont have a valid input
     */
    String[] SearchProducts(String str) throws InvalidInputException;
}
