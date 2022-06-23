package lk.ijse.dep8.note.dto;

import lk.ijse.dep8.note.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {

    private String id;
    private String email;
    private String password;
    private String fullName;
}
