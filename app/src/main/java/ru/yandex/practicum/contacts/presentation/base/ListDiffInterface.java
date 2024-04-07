package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <T> {
    default boolean theSameAs(T t) {
        return true;
    }
    boolean equals(Object o);
}
