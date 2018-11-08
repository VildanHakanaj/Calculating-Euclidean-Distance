import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Euclidian ec = new Euclidian();
        String  testingPath = "C:\\Users\\ahaka\\IdeaProjects\\Euclidian Distance\\Data\\testingSet.csv";
        String trainingPath = "C:\\Users\\ahaka\\IdeaProjects\\Euclidian Distance\\Data\\trainingData.csv";
        ArrayList<Point> trainingSet = new ArrayList<>();
        ArrayList<Point> testingSet = new ArrayList<>();
        ArrayList<Double> distance = new ArrayList<>();
        ec.createSets(trainingPath, trainingSet);
        ec.createSets(testingPath, testingSet);

        ec.calculateDistance(trainingSet, testingSet, distance);
        System.out.println();

    }
}
