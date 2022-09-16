package Model;

import java.sql.Date;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Task {
    
    private Long id;
    private Long id_project;
    private String name;
    private String description;
    private String notes;
    private Boolean isCompleted;
    private Date deadLine;
    private Date createdAt;
    private Date updatedAt;
}
