package cinema;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.*;

@RestController
public class Controller {

    @GetMapping("/test/{status}")
    public void getStatus(@PathVariable String status) {
        switch (status) {
            case "200":
                throw new ResponseStatusException(HttpStatus.OK);
            case "300":
                throw new ResponseStatusException(HttpStatus.MULTIPLE_CHOICES);
            case "400":
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            case "500":
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}