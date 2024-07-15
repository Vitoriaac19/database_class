package Bank;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "client")
    private Set<Account> accounts;


    @ManyToMany(
            mappedBy = "clients",
            fetch = FetchType.EAGER)
    private List<Bank> banks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
