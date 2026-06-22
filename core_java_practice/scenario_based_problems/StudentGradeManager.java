package core_java_practice.scenario_based_problems;

public class StudentGradeManager {

    static String[] names = new String[100];
    static int[][] marks = new int[100][5];
    static int[] totals = new int[100];
    static char[] grades = new char[100];
    static int count = 0;

    public static void main(String[] args) {

        try {
            readStudentData("students.txt");

            System.out.println("Students Loaded Successfully!\n");

            sortByTotalMarks();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name to search: ");
            String searchName = sc.nextLine();

            searchStudent(searchName);

            writeReport("report.txt");

            System.out.println("\nReport generated successfully in report.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
        } catch (IOException e) {
            System.out.println("Error while reading/writing file.");
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }

    public static void readStudentData(String filename) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(filename));

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split("\\s+");

            names[count] = data[0];

            int total = 0;

            for (int i = 0; i < 5; i++) {
                marks[count][i] = Integer.parseInt(data[i + 1]);
                total += marks[count][i];
            }

            totals[count] = total;
            grades[count] = calculateGrade(total / 5);

            count++;
        }

        br.close();
    }

    public static char calculateGrade(int avg) {

        if (avg >= 60) {

            if (avg >= 90)
                return 'A';
            else if (avg >= 75)
                return 'B';
            else
                return 'C';

        } else {

            if (avg >= 50)
                return 'D';
            else
                return 'F';
        }
    }
    public static void searchStudent(String name) {

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (names[i].equalsIgnoreCase(name)) {

                System.out.println("\nStudent Found:");
                System.out.println("Name : " + names[i]);
                System.out.println("Total Marks : " + totals[i]);
                System.out.println("Grade : " + grades[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public static void sortByTotalMarks() {

        for (int i = 0; i < count - 1; i++) {

            for (int j = 0; j < count - i - 1; j++) {

                if (totals[j] < totals[j + 1]) {

                    int tempTotal = totals[j];
                    totals[j] = totals[j + 1];
                    totals[j + 1] = tempTotal;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    char tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;

                    int[] tempMarks = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = tempMarks;
                }
            }
        }
    }

    public static void writeReport(String filename) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

        bw.write("===== STUDENT REPORT =====\n\n");

        for (int i = 0; i < count; i++) {

            bw.write("Name: " + names[i]);
            bw.write("\nTotal Marks: " + totals[i]);
            bw.write("\nGrade: " + grades[i]);
            bw.write("\n--------------------------\n");
        }

        bw.close();
    }
}