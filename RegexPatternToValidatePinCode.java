/*
 * The Pin Code Validator program implements an application that needs
 * to ensure all validations in different ways.
 * UC1: Create a regex pattern to validate PIN code 400088.
 *
 * @author: Sanjana Bhandure
 * @version: 1.0
 * @date: 29-04-2022
 */
package com.Bridgelabz.Day19_PincodeValidatorUsingRegex;

import java.util.regex.Pattern;

public class RegexPatternToValidatePinCode {
    /*
     * isValid method
     */
    static public boolean isValid(String regex,String input) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matches(regex,input);

    }
    public static void main(String[] args) {
        boolean regexCheck = isValid("^[1-9]{1}[\\d]{5}$","400088");
        System.out.println(regexCheck);
    }
}
