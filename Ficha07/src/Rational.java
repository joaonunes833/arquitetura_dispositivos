import java.util.Objects;

public class Rational implements Comparable<Rational>{
    private int numerator;
    private int denominator;

    public Rational(){
        this.numerator = 0;
        this.denominator = 0;
    }
    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return numerator == rational.numerator && denominator == rational.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public int compareTo(Rational o) {
        int denoDiff = this.getDenominator() - o.getDenominator();
        int numDiff = this.getNumerator() - o.getNumerator();
        int total = denoDiff + numDiff;
        return total;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
