package lk.ijse.dep8.note.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users{userId:[A-F0-9\\-]{36}/")
public class NoteController {

}
