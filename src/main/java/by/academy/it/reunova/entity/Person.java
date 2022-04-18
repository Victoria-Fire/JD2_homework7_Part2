package by.academy.it.reunova.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Person {

    @Column(name = "watcher_name")
    private String name;

    @Column(name = "watcher_surname")
    private String surname;
}
