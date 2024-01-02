package generics.practice.excercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        runExercise();
    }
    public static void runExercise() {

        // you have to implement the other classes such that the following code can run without any error

        Library<Algorithm> library = new Library<>();
        library.add(new SearchAlgorithm());
        library.add(new SortingAlgorithm());
        library.add(new GraphAlgorithm());

        Algorithm item = library.getLast();

        while(item!=null) {
            item.execute();
            item = library.getLast();
        }
    }
}

class SearchAlgorithm implements Algorithm {

    @Override
    public void execute() {
        System.out.println("Search Algorithm");
    }
}

class SortingAlgorithm implements Algorithm {

    @Override
    public void execute() {
        System.out.println("Sorting Algorithm");
    }
}

class GraphAlgorithm implements Algorithm {
    @Override
    public void execute() {
        System.out.println("Graph Algorithm");
    }
}

class Library<T extends Algorithm> {
    private final List<T> algorithms = new ArrayList<>();
    public void add(T t){
        algorithms.add(t);
    }

    public T getLast() {
        if(algorithms.size()>0) {
            T currentAlgorithm = algorithms.remove(algorithms.size()-1);
            if (currentAlgorithm != null) {
                algorithms.remove(currentAlgorithm);
                return currentAlgorithm;
            }
        }
        return null;
    }
}

interface Algorithm {
   void execute();
}
