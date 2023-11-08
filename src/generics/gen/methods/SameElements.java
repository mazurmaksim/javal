package generics.gen.methods;

public class SameElements {
    // create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.
    // This case are exclude two different types of arrays as String Integer or any other cases
    public <T extends Comparable<T>> String compareArrays(T[] a1, T[] a2){
        if(a1.length == 0 && a2.length == 0) {
            return "Arrays have length 0";
        } else if(a1.length > a2.length || a1.length < a2.length) {
            return "Arrays have different length";
        } else {
            for (int i = 0; i < a1.length; i++) {
                if(!a1[i].equals(a2[i])) {
                   return "Arrays are different";
                }
            }
        }
        return "Arrays have same order";
    }
}
