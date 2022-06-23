package lk.ijse.dep8.note.dto;


import lk.ijse.dep8.note.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {
    @Null(message = "id Cannot be empty")
    private String id;
    @Email(message = "Invalid email")
    @NotNull(message = "email Cannot be empty")
    private String email;
    @NotBlank(message = "password Cannot be empty")
    @Length(min = 6,message = "password at least should be 6 characters long")
    private String password;
    @NotNull(message = "name Cannot be empty")
    @Pattern(regexp = "[A-Za-z]+")
    private String fullName;


}
