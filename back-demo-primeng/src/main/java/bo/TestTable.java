package bo;

/**
 * Created by sminne on 12/09/2016.
 */

import javax.persistence.*;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "testtable")
public class TestTable {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;

  protected TestTable() {}

  public TestTable(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format(
      "Customer[id=%d, firstName='%s', lastName='%s']",
      id, firstName, lastName);
  }

}
