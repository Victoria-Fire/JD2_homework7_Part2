package by.academy.it.reunova.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Integer id;

    @Column
    private String nameTask;

    @Column
    private String description;
}

