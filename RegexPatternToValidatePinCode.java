/*
 * The Pin Code Validator program implements an application that needs
 * to ensure all validations in different ways.
 * UC3: Restrict the PIN code from taking alphabets or special characters at the End.
 * Check for 400088B – this should fail
 *
 * @author: Sanjana Bhandure
 * @version: 1.2
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
        boolean regexCheck = isValid("^[1-9]{1}[\\d]{5}$","400088B");
        System.out.println(regexCheck);
    }
}
