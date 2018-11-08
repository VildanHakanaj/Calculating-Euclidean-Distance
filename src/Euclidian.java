import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.*;
import java.io.*;

public class Euclidian {

    public Euclidian() {

    }

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

    public void calculateDistance(ArrayList<Point> trainingSet, ArrayList<Point> testingSet, ArrayList<Double> distance) {
        for (int i = 0; i < testingSet.size(); i++) {
            for (int j = 0; j < trainingSet.size(); j++) {
               distance.add((double)Math.sqrt((trainingSet.get(j).getX() - testingSet.get(i).getX()) + (trainingSet.get(j).getY() - testingSet.get(i).getY()) + (trainingSet.get(j).getZ() - testingSet.get(i).getZ())));
            }
        }
    }

}
