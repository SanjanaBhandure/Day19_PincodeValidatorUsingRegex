/*
 * The Pin Code Validator program implements an application that needs
 * to ensure all validations in different ways.
 * UC1: Restrict the PIN code from taking alphabets or special characters at the beginning.
 * Check for A400088 – this should fail
 *
 * @author: Sanjana Bhandure
 * @version: 1.1
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
        boolean regexCheck = isValid("^[1-9]{1}[\\d]{5}$","A400088");
        System.out.println(regexCheck);
    }
}
