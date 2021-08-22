import java.util.ArrayList;
import org.javatuples.Triplet;
import java.util.List;



public class DIP
{

}

enum Relationship
{
    PARENT,
    CHILD,
    SIBLING
}

class Person
{
    public String name;

    public Person(String name)
    {
        this.name=name;
    }
}

class Relationships
{
    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person Child)
    {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child,Relationship.CHILD, parent));



    }
}