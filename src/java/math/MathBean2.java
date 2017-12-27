package math;//version with Integer.toString

import java.util.Objects;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "mathBean2")//annotation for NamedBean
@RequestScoped
public class MathBean2 {

    private int parameter1;
    private int parameter2;
    private String result;

    public MathBean2() {
    }

    public String add() {
        result = Integer.toString(parameter1 + parameter2);
        return "index";
    }

    public String subtract() {
        result = Integer.toString(parameter1 - parameter2);
        return "index";
    }

    public String multiply() {
        result = Integer.toString(parameter1 * parameter2);
        return "index";
    }

    public String divide() {

        if (parameter1 < 0 || parameter2 < 0) {
            System.out.println("Division by zero not possible");
        } else {
            result = Integer.toString(parameter1 / parameter2);
        }

        return "index";
    }

    public int getParameter1() {
        return parameter1;
    }

    public void setParameter1(int parameter1) {
        this.parameter1 = parameter1;
    }

    public int getParameter2() {
        return parameter2;
    }

    public void setParameter2(int parameter2) {
        this.parameter2 = parameter2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.parameter1;
        hash = 23 * hash + this.parameter2;
        hash = 23 * hash + Objects.hashCode(this.result);
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
        final MathBean2 other = (MathBean2) obj;
        if (this.parameter1 != other.parameter1) {
            return false;
        }
        if (this.parameter2 != other.parameter2) {
            return false;
        }
        if (!Objects.equals(this.result, other.result)) {
            return false;
        }
        return true;
    }

}