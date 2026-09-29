package library;

public final class LoanPolicy {
    public int maxBooks(MemberType type) {
        if (type == MemberType.FACULTY) {
            return 5;
        }
        return 3;
    }

    public int maxDays() {
        return 14;
    }

    public int overdueFee(int daysOverdue) {
        if (daysOverdue <= 0) {
            return 0;
        }
        return daysOverdue * 100;
    }
}
