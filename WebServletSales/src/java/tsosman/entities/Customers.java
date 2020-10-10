package tsosman.entities;

import java.util.Objects;


public class Customers {
    private int ccode;
    private String cname;
    
    public Customers() {
    }

    public Customers(int ccode, String cname) {
        this.ccode = ccode;
        this.cname = cname;
    }

    public int getCcode() {
        return ccode;
    }

    public void setCcode(int ccode) {
        this.ccode = ccode;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.ccode;
        hash = 29 * hash + Objects.hashCode(this.cname);
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
        final Customers other = (Customers) obj;
        if (this.ccode != other.ccode) {
            return false;
        }
        if (!Objects.equals(this.cname, other.cname)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Customers{" + "ccode=" + ccode + ", cname=" + cname + '}';
    }
    
}
