import java.util.Scanner; // Import the Scanner class to get user input

public class SchoolGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // --- 1. Get the 8 annual grades from the student ---
        double[] annualGrades = new double[8]; // Array to store 8 grades

        System.out.println("Bem-vindo ao Sistema de Cálculo de Médias Escolares!");
        System.out.println("Por favor, insira as 8 notas anuais do aluno:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            annualGrades[i] = scanner.nextDouble(); // Read each grade
            // Basic input validation: ensure grades are non-negative
            while (annualGrades[i] < 0) {
                System.out.println("Nota inválida! Por favor, digite uma nota não negativa.");
                System.out.print("Digite a nota " + (i + 1) + ": ");
                annualGrades[i] = scanner.nextDouble();
            }
        }

        // --- 2. Calculate Bimonthly Averages ---
        System.out.println("\n--- Médias Bimestrais ---");
        double[] bimonthlyAverages = new double[4]; // There are 4 bimesters

        // Bimester 1: Grades 1 and 2
        bimonthlyAverages[0] = (annualGrades[0] + annualGrades[1]) / 2;
        System.out.printf("Média do 1º Bimestre: %.2f%n", bimonthlyAverages[0]);

        // Bimester 2: Grades 3 and 4
        bimonthlyAverages[1] = (annualGrades[2] + annualGrades[3]) / 2;
        System.out.printf("Média do 2º Bimestre: %.2f%n", bimonthlyAverages[1]);

        // Bimester 3: Grades 5 and 6
        bimonthlyAverages[2] = (annualGrades[4] + annualGrades[5]) / 2;
        System.out.printf("Média do 3º Bimestre: %.2f%n", bimonthlyAverages[2]);

        // Bimester 4: Grades 7 and 8
        bimonthlyAverages[3] = (annualGrades[6] + annualGrades[7]) / 2;
        System.out.printf("Média do 4º Bimestre: %.2f%n", bimonthlyAverages[3]);

        // --- 3. Calculate Semester Averages ---
        System.out.println("\n--- Médias Semestrais ---");
        double[] semesterAverages = new double[2]; // There are 2 semesters

        // First Semester: Average of Bimester 1 and Bimester 2
        semesterAverages[0] = (bimonthlyAverages[0] + bimonthlyAverages[1]) / 2;
        System.out.printf("Média do 1º Semestre: %.2f%n", semesterAverages[0]);

        // Second Semester: Average of Bimester 3 and Bimester 4
        semesterAverages[1] = (bimonthlyAverages[2] + bimonthlyAverages[3]) / 2;
        System.out.printf("Média do 2º Semestre: %.2f%n", semesterAverages[1]);

        // --- 4. Calculate Final Average ---
        System.out.println("\n--- Média Final ---");
        double finalAverage = (semesterAverages[0] + semesterAverages[1]) / 2;
        // Alternatively, you could average all 8 annual grades directly:
        // double sumOfAllGrades = 0;
        // for (double grade : annualGrades) {
        //     sumOfAllGrades += grade;
        // }
        // double finalAverage = sumOfAllGrades / annualGrades.length;

        System.out.printf("Média Final: %.2f%n", finalAverage);

        // --- 5. Determine Approval Status (Optional but good for a school system) ---
        System.out.println("\n--- Situação do Aluno ---");
        double approvalThreshold = 7.0; // Example: student needs 7.0 or higher to pass

        if (finalAverage >= approvalThreshold) {
            System.out.println("Parabéns! O aluno foi APROVADO!");
        } else {
            System.out.println("O aluno foi REPROVADO. A média mínima para aprovação é " + approvalThreshold);
        }

        scanner.close(); // Close the scanner to release resources
    }
}