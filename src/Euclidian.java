import java.util.*;
import java.io.*;

public class Euclidian {

    public Euclidian() {

    }

    //region Main Methods
    /*
    * @param filePath => the path to the file we are reading from
    * @param sets => the set to be created input can be training set or testing set
    *
    * Will read from the csv file that we specify the path.
    * Will create Point objects with the retrieved attributes
    * and store them into the sets
    *
    * */
    public ArrayList<Point> createSets(String filePath, ArrayList<Point> sets) throws FileNotFoundException {

            //Input file which needs to be parsed
            BufferedReader fileReader = null;

            //Delimiter used in CSV file
            final String DELIMITER = ",";
            try
            {
                //Contains the line
                String line = "";
                //Create the file reader
                fileReader = new BufferedReader(new FileReader(filePath));

                //Read the file line by line
                while ((line = fileReader.readLine()) != null)
                {
                    //Get all tokens available in line
                    String[] tokens = line.split(DELIMITER);
                    sets.add(new Point(Double.parseDouble(tokens[0]), Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), tokens[3]));
                }

                return sets;
            }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return sets;
        }
    }

    /*
    * @param trainingSet
    * @param testingSet
    *
    * Will calculate the distance for each instance of testing
    * against all instances of training set instance
    * */
    public void calculateDistance(ArrayList<Point> trainingSet, ArrayList<Point> testingSet, ArrayList<Double> distance) {
        for (int i = 0; i < testingSet.size(); i++) {
            Point aTestingSet = testingSet.get(i);
            for (int j = 0; j < trainingSet.size(); j++) {

                distance.add((double) Math.sqrt((trainingSet.get(j).getX() - aTestingSet.getX()) + (trainingSet.get(j).getY() - aTestingSet.getY()) + (trainingSet.get(j).getZ() - aTestingSet.getZ())));
            }
        }
    }

    /*
    * Given the euclidean distance
    * will give the testing set the class that belongs
    * based on the K = value;
    * */
    public void classify(){

    }
    //endregion
}
