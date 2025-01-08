import java.util.Scanner;

class Bowler {
    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;

    // Default constructor
    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    // Parameterized constructor
    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    // Method to compute bowling average
    public void computeBowlingAverage() {
        if (validateInputs()) {
            if (wickets > 0) {
                double bowling_avg = (double) runs_conceded / wickets;
                System.out.println("Name: " + name);
                System.out.println("bowling_avg=" + bowling_avg);
            } else {
                System.out.println("Error");
            }
        }
    }

    // Method to show statistics
    public void showStatistics() {
        if (validateInputs()) {
            System.out.println("Name=" + name);
            System.out.println("wickets=" + wickets);
            System.out.println("matches=" + matches);
            System.out.println("balls_bowled=" + balls_bowled);
            System.out.println("runs_conceded=" + runs_conceded);
        }
    }

    // Method to compute strike rate
    public void computeStrikeRate() {
        if (validateInputs()) {
            if (balls_bowled > 0) {
                double strike_rate = (double) runs_conceded / balls_bowled;
                System.out.println("Name: " + name);
                System.out.println("Strike_rate=" + strike_rate);
            } else {
                System.out.println("Error");
            }
        }
    }

    // Method to validate inputs
    private boolean validateInputs() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return false;
        }
        if ((runs_conceded > 0 || balls_bowled > 0) && matches == 0) {
            System.out.println("Error");
            return false;
        }
        return true;
    }
}

public class PS003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter wickets: ");
        int wickets = scanner.nextInt();

        System.out.print("Enter matches: ");
        int matches = scanner.nextInt();

        System.out.print("Enter balls bowled: ");
        int balls_bowled = scanner.nextInt();

        System.out.print("Enter runs conceded: ");
        int runs_conceded = scanner.nextInt();

        Bowler bowler = new Bowler(name, wickets, matches, balls_bowled, runs_conceded);
        bowler.computeBowlingAverage();
        bowler.showStatistics();
        bowler.computeStrikeRate();

        scanner.close();
    }
}
    