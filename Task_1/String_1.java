package zoho.Task_1;

public class String_1 {
    
//     Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


// helloName("Bob") → "Hello Bob!"
// helloName("Alice") → "Hello Alice!"
// helloName("X") → "Hello X!"

public String helloName(String name) {
    return "Hello " + name +"!";
  }

//   Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


// makeAbba("Hi", "Bye") → "HiByeByeHi"
// makeAbba("Yo", "Alice") → "YoAliceAliceYo"
// makeAbba("What", "Up") → "WhatUpUpWhat"

public String makeAbba(String a, String b) {
    return a + b + b + a;
  
  }

//   Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


// makeOutWord("<<>>", "Yay") → "<<Yay>>"
// makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
// makeOutWord("[[]]", "word") → "[[word]]"

public String makeOutWord(String out, String word) {
    return out.substring(0, 2) + word + out.substring(2, 4);
  
  }
//   The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".


// makeTags("i", "Yay") → "<i>Yay</i>"
// makeTags("i", "Hello") → "<i>Hello</i>"
// makeTags("cite", "Yay") → "<cite>Yay</cite>"

public String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">";
  
  }
  
//   Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.


// left2("Hello") → "lloHe"
// left2("java") → "vaja"
// left2("Hi") → "Hi"

public String left2(String str) {
    return str.substring(2) + str.substring(0, 2);

}

// Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.


// theEnd("Hello", true) → "H"
// theEnd("Hello", false) → "o"
// theEnd("oh", true) → "o"

public String theEnd(String str, boolean front) {
    if (front) {
      return str.substring(0, 1);
    } 
    else {
      return str.substring(str.length() - 1);
    }
  }

//   Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.


// withouEnd2("Hello") → "ell"
// withouEnd2("abc") → "b"
// withouEnd2("ab") → ""

public String withouEnd2(String str) {
    String res;
    if ( str.length() <= 2) {
      res = "";
    }
    else{ 
      res = str.substring(1,str.length()-1);
    }
    return res;
  }

  
// Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


// conCat("abc", "cat") → "abcat"
// conCat("dog", "cat") → "dogcat"
// conCat("abc", "") → "abc"

public String conCat(String a, String b) {
    if (a.isEmpty() || b.isEmpty()) {
      return a + b; 
    }
    if (a.charAt(a.length() - 1) == b.charAt(0)) {
      return a + b.substring(1);
    } else {
      return a + b;
    }
  }
  
//   Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.


// atFirst("hello") → "he"
// atFirst("hi") → "hi"
// atFirst("h") → "h@"

public String atFirst(String str) {
    if (str.length() >= 2) {
      return str.substring(0, 2);
    } else if (str.length() == 1) {
      return str + "@";
    } else {
      return "@@";
    }
  }

//   Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


// lastTwo("coding") → "codign"
// lastTwo("cat") → "cta"
// lastTwo("ab") → "ba"

public String lastTwo(String str) {
    if (str.length() < 2) {
      return str; 
    }
  
    int last = str.length() - 1;
    int secondLast = str.length() - 2;
  
    return str.substring(0, secondLast) + str.charAt(last) + str.charAt(secondLast);
  }
  
//   Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


// withoutX("xHix") → "Hi"
// withoutX("xHi") → "Hi"
// withoutX("Hxix") → "Hxi"

public String withoutX(String str) {
    if (str.length() == 0) {
        return ""; 
    }
  
    int start = 0;
    if (str.charAt(0) == 'x') {
        start = 1;
    }
  
    int end = str.length();
    if( str.length() > 1 ) {
    if (str.charAt(str.length() - 1) == 'x') {
        end = str.length() - 1;
    }
    }
  
    return str.substring(start, end);
  }
  
}
