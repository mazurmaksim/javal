package integer.cache;

public class IntegerConvention {
//    To increase the efficiency of boxing conversion (converting a primitive type value into an object of the corresponding shell class),
//    pre-created objects of Integer (-128 ... 127), Byte (-128 ... 127), Short (-128 ... 127), Character (0 ... 127) classes are used
//    for small modulo integer values. These sets are usually called a cache (e.g., integer cache) or a pool (e.g., integer pool).
//    Therefore c == d gives true. For the other values, a new object is created each time during boxing conversion. Therefore a == b is false.

 public boolean integerConventionCheck(Integer a, Integer b) {
     return a == b;
 }
}
