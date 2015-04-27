package common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by HASEGAWA_Hiroshi on 2015/04/27.
 */
@Entity
public class Employee {

    private long employId;
    private String mail;
    private String name;
    private String password;

    @Id
    @Column(name = "EMPLOY_ID", nullable = false, insertable = true, updatable = true)
    public long getEmployId() {
        return employId;
    }

    public void setEmployId(long employId) {
        this.employId = employId;
    }

    @Basic
    @Column(name = "MAIL", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "NAME", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (employId != employee.employId) return false;
        if (mail != null ? !mail.equals(employee.mail) : employee.mail != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (password != null ? !password.equals(employee.password) : employee.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (employId ^ (employId >>> 32));
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
