package abcproject;

public class test_class {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] studentNames = new String[numStudents];
        int[][] subjectMarks = new int[numStudents][];
        int[] totalMarks = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter the number of subjects for " + studentNames[i] + ": ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            subjectMarks[i] = new int[numSubjects];
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + " for " + studentNames[i] + ": ");
                subjectMarks[i][j] = scanner.nextInt();
            }

            // Calculate total marks for the current student
            for (int mark : subjectMarks[i]) {
                totalMarks[i] += mark;
            }
        }

        // Find the index of the student with the highest total marks
        int maxTotalIndex = 0;
        for (int i = 1; i < numStudents; i++) {
            if (totalMarks[i] > totalMarks[maxTotalIndex]) {
                maxTotalIndex = i;
            }
        }

        System.out.println("Winner: " + studentNames[maxTotalIndex]);
        System.out.println("Total Marks: " + totalMarks[maxTotalIndex]);

        scanner.close();
		
	}

}
