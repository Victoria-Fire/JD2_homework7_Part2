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
@Table (name = "WORKTASK")
@Entity
@PrimaryKeyJoinColumn(name = "TASK_ID")
public class WorkTask extends Task {

    @Column
    private Double cost;
}
