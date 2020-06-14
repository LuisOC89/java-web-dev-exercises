package org.launchcode.java.demos.lsn1datatypes;

public class StringAndSingleCharacter {
//    Java syntax requires double quotation marks when declaring strings.

//    Java has another variable type, char, which is used for a single character. char uses single quotation marks. The single character can be a letter, digit, punctuation, or whitespace like tab ('\t').
    String staticVariable = "dog";
    char charVariable = 'd';

    String str = "Rutabaga";

    //    Returns the character at index 3, ('a').
    char in3 = str.charAt(3);

    //    Returns the characters from indexes 2 - 4, ("tab").
    String subW = str.substring(2,4);

    //    Returns the length of the string.
    int l2ngth = str.length();

    //    Returns the index for the first occurrence of ‘a’, (3).
    int l3ng2 = str.indexOf('a');

    //    Splits the string into sections at each delimiter and stores the sections as elements in an array.
    String[] myArray = str.split("delimiter");

    //    In Java, concat concatenates only two strings. To join multiple strings, method chaining is required.
    String string4 = "Whatever";
    String newStr = staticVariable.concat(str).concat(string4);

    //    Removes any whitespace at the beginning or end of the string.
    String withoutSpacesString = str.trim();

    //    Changes all alphabetic characters in the string to UPPERCASE or lowercase, respectively.
    String upString = str.toUpperCase();
    String downString = str.toLowerCase();

    //    Searches for the specified text within a string and returns true or false.
    boolean aBoolean = str.contains("text");

    //    Compares strings for equality and returns a boolean.
    boolean otherBoolean = str.equals(string4);

    //    Primitive Types:
    //    int —> Integer
    //    float —> Float
    //    double —> Double
    //    char —> Character
    //    boolean —> Boolean

}
