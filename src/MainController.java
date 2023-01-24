package Users.filipdimitrijevic.KTH.project.Project.src;

@RestController
public class MainController {
    @GetMapping("/")
    public String index() {
        return "Welcome to my movie search app!";
    }
}
