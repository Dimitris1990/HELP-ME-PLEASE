package entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @Column(name = "sId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sId;
    @Column(name = "sname", length = 20, nullable =false)
    private String sname;
    @Column(name = "dob", nullable =false)
    private LocalDate dob;
    @Column(name = "dob", nullable =false)
    private double fees;

    public Student() {
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.sId;
        hash = 89 * hash + Objects.hashCode(this.sname);
        hash = 89 * hash + Objects.hashCode(this.dob);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.fees) ^ (Double.doubleToLongBits(this.fees) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.sId != other.sId) {
            return false;
        }
        if (Double.doubleToLongBits(this.fees) != Double.doubleToLongBits(other.fees)) {
            return false;
        }
        if (!Objects.equals(this.sname, other.sname)) {
            return false;
        }
        if (!Objects.equals(this.dob, other.dob)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "sId=" + sId + ", sname=" + sname + ", dob=" + dob + ", fees=" + fees + '}';
    }
    
    
}
