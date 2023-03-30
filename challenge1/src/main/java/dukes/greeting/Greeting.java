package dukes.greeting;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "greeting")
@Cacheable(value = false)
@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name  = "id")
    private UUID id;
    @Column(name = "message")
    private String message;

    public Greeting() {
    }

    public Greeting(String messaage) {
        this.message = messaage;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String messaage) {
        this.message = messaage;
    }
}