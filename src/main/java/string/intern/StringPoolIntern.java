package string.intern;

public class StringPoolIntern {

//    Returns a canonical representation for the string object.
//    A pool of strings, initially empty, is maintained privately by the class String.
//    When the intern method is invoked, if the pool already contains a string equal to
//    this String object as determined by the equals(Object) method, then the string from the pool is returned.
//    Otherwise, this String object is added to the pool and a reference to this String object is returned.
//    It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.
    public boolean stringInternCheck(String str1, String str2) {
        return str1.intern() == str2;
    }
}
