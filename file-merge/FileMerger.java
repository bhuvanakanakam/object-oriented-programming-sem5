/* bhuvana kanakam se21ucse035
    Lab 09 - nov 13, 2023 */

import java.io.*;

public class FileMerger {
    public static void main(String[] args) {
        try {
            String[] inputFiles = {"file1.txt", "file2.txt", "file3.txt"};
            String outputFile = "output.txt";
            mergeFiles(inputFiles, outputFile);

            System.out.println("Data has been successfully merged and averages calculated.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mergeFiles(String[] inputFiles, String outputFile) throws IOException {
        if (inputFiles == null || inputFiles.length == 0) {
            throw new IllegalArgumentException("Input files must be specified.");
        }

        try (OutputStream outputStream = new FileOutputStream(outputFile);
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream))) {

            double[] columnSums = null;
            int rowCount = 0;

            for (String inputFile : inputFiles) {
                try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                    String header = reader.readLine();
                    if (rowCount == 0) {
                        writer.write(header + "\n");
                    }

                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] values = line.split("\\s+");

                        if (rowCount == 0) {
                            columnSums = new double[values.length];
                        }
                        for (String value : values) {
    				try {
        				double numericValue = Double.parseDouble(value);
        				// Only include numeric values in the sum
        				for (int i = 0; i < values.length; i++) {
            					columnSums[i] += numericValue;
        				}
    				} catch (NumberFormatException e) {
        				// Skip non-numeric values
        				continue;
    				}
			}
                        rowCount++;
                    }
                }
            }

            // Calculate the averages and write them to the output file
            if (columnSums != null) {
                writer.write("Averages:\n");
                for (double columnSum : columnSums) {
                    double average = columnSum / rowCount; // Corrected: use rowCount instead of inputFiles.length
                    writer.write(average + "\t");
                }
            }
        }
    }
}
