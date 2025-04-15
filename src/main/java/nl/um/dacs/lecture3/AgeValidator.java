package nl.um.dacs.lecture3;

public class AgeValidator {
    public static boolean isEligibleToVote(int age) {
        if (age < 0) {
            return false;
        }
        if (age > 120) {
            return false;
        }

        return age >= 18;
    }
}