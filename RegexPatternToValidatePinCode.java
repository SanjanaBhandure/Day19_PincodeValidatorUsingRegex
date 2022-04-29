/*
 * The Pin Code Validator program implements an application that needs
 * to ensure all validations in different ways.
 * UC4: Make sure 400 088 is also valid along with 400088.
 *
 * @author: Sanjana Bhandure
 * @version: 1.3
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
        boolean regexCheck = isValid("^[1-9]{1}[0-9]{2}\\s{0,1}?[0-9]{3}$","400 088");
        System.out.println(regexCheck);
    }
}
