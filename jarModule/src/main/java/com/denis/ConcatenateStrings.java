package com.denis;


public class ConcatenateStrings {

    public ConcatenateStrings() {
    }

    public static String concatenate (String a, String b) {
      String result = a + b;
      if (a == null || b == null || result.length() == 0) {
          result = "Please fill in all fields!";
      }
          return result;

  }
}
