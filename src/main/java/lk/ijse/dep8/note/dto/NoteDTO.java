package lk.ijse.dep8.note.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NoteDTO implements Serializable {

    @Null(message = "Id cant be set")
    private int id;

    @NotNull(message = "text cannot be empty")
    private String text;

    @Pattern(regexp = "[A-Fa-f0-9\\-]{36}", message = "Invalid userId")
    private String userId;

}
