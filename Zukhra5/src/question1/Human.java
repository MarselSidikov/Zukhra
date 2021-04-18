package question1;

import java.util.Objects;

/**
 * 18.04.2021
 * Zukhra5
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human {
    private String firstName;
    private String lastName;
    private boolean isWorker;

    public Human(String firstName, String lastName, boolean isWorker) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isWorker = isWorker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
