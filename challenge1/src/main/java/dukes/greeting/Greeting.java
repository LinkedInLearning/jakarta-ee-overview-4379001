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
    private String messaage;

    public Greeting() {
    }

    public Greeting(String messaage) {
        this.messaage = messaage;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMessaage() {
        return messaage;
    }

    public void setMessaage(String messaage) {
        this.messaage = messaage;
    }
}
