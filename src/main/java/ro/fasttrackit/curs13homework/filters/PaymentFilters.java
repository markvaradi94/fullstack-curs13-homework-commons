package ro.fasttrackit.curs13homework.filters;

import lombok.Value;

@Value
public class PaymentFilters {
    String id;
    String status;
    Double amountPayable;
}
