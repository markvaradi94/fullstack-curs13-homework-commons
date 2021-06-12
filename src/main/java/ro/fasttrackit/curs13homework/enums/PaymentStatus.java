package ro.fasttrackit.curs13homework.enums;

public enum PaymentStatus {
    PENDING,
    DONE,
    REJECTED;

    public static PaymentStatus of(String name) {
        return PaymentStatus.valueOf(name.toUpperCase());
    }
}
