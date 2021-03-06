package core.hashCodeAndEquals;

/**
 * Created by VasDA on 21.07.2016.
 */
public class Employee {
    private Integer id;
    private String firstname;
    private String lastName;
    private String department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id != null ? id.equals(employee.id) : employee.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

//        public boolean equals(Object o) {
//        if(o == null)
//        {
//            return false;
//        }
//        if (o == this)
//        {
//            return true;
//        }
//        if (getClass() != o.getClass())
//        {
//            return false;
//        }
//
//        Employee e = (Employee) o;
//        return (this.getId() == e.getId());
//
//    }

//    @Override
//    public int hashCode()
//    {
//        final int PRIME = 31;
//        int result = 1;
//        result = PRIME * result + getId();
//        return result;
//    }
}
