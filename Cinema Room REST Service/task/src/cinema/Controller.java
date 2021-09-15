package cinema;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    ImportantMessage latestMessage = new ImportantMessage();

    @PostMapping("/message")
    public void newMessage(@RequestBody ImportantMessage inputMessage) {
        latestMessage = inputMessage;
    }

    @GetMapping("/message")
    public ImportantMessage getLatestMessage(ImportantMessage latestMessage) {
        return latestMessage;
    }


}

class ImportantMessage {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String message = "Default Message";

    ImportantMessage() {}
}