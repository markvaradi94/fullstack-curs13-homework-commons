package ro.fasttrackit.curs13homework.filters;

import lombok.Value;

@Value
public class InvoiceFilters {
    String id;
    Double amount;
    String sender;
    String receiver;
    Boolean payed;
}
