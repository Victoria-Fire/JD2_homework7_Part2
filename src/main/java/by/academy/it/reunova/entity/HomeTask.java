package by.academy.it.reunova.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "HOMETASK")
@Entity
@PrimaryKeyJoinColumn(name = "TASK_ID")
public class HomeTask extends Task {

    @Column
    private String startDate;

    @Column
    private String endDate;

    @AttributeOverrides({
            @AttributeOverride(name = "name", column = @Column(name = "executor_name")),
            @AttributeOverride(name = "surname", column = @Column(name = "executor_surname")),
    })

    @Embedded
    private Person executor;

    @Embedded
    private Person watcher;
}
