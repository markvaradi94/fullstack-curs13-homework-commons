package ro.fasttrackit.curs13homework.utils;

import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

public interface ModelMapper<A, E> {
    A toApi(E source);

    E toEntity(A source);

    default List<A> toApi(Collection<E> source) {
        return source.stream()
                .map(this::toApi)
                .collect(toList());
    }

    default List<E> toEntity(Collection<A> source) {
        return source.stream()
                .map(this::toEntity)
                .collect(toList());
    }
}
