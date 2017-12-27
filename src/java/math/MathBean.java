package math;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "mathBean")//annotation for NamedBean
@RequestScoped
public class MathBean {

    private double parameter1;
    private double parameter2;
    private double result;

    public MathBean() {
    }

    public String add() {
        result = parameter1 + parameter2;
        return "index";
    }

    public String subtract() {
        result = parameter1 - parameter2;
        return "index";
    }

    public String multiply() {
        result = parameter1 * parameter2;
        return "index";
    }

    public String divide() {

        result = parameter1 / parameter2;
        return "index";
    }

    public double getParameter1() {
        return parameter1;
    }

    public void setParameter1(double parameter1) {
        this.parameter1 = parameter1;
    }

    public double getParameter2() {
        return parameter2;
    }

    public void setParameter2(double parameter2) {
        this.parameter2 = parameter2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.parameter1) ^ (Double.doubleToLongBits(this.parameter1) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.parameter2) ^ (Double.doubleToLongBits(this.parameter2) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.result) ^ (Double.doubleToLongBits(this.result) >>> 32));
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
        final MathBean other = (MathBean) obj;
        if (Double.doubleToLongBits(this.parameter1) != Double.doubleToLongBits(other.parameter1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.parameter2) != Double.doubleToLongBits(other.parameter2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.result) != Double.doubleToLongBits(other.result)) {
            return false;
        }
        return true;
    }

}

