/*
  https://www.codewars.com/kata/lombok-encapsulation
 */

package com.softserve.homework03.additionaltask;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EncapsulationDemo {
    private int number;
    private String stringValue;
    private Object anObject;
}