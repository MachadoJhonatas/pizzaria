package com.machado.pizzaria_api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UnitsOfMeasurement {
    MINILITERS("ml", "Miniliters"),
    LITERS("L", "Liters"),
    GRAMS("g", "Grams"),
    KILOGRAMS("kg", "Kilograms"),
    SECONDS("s", "Seconds"),
    MINUTES("min", "Minutes"),
    CELSIUS("ºC", "Celsius")
    // não trabalhamos com fahrenheit (não admito kk)
    ;

    private final String simbol;
    private final String description;

}
