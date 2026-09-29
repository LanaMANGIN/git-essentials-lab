package library;

public class LoanPolicy {
    public int getMaxBooks(String role) {
        if ("student".equalsIgnoreCase(role)) {
            return 3;
        }
        if ("faculty".equalsIgnoreCase(role)) {
            return 5;
        }
        return 2;
    }
}