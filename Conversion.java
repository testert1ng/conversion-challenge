import java.text.DecimalFormat;

public class Conversion {
	private double value;
	private String fromUnit;
	private String toUnit;

	public Conversion() {
		this.value = 0.00;
		this.fromUnit = "";
		this.toUnit = "";
	}

	public Conversion convert(double value, String fromUnit) {
		this.value = value;
		this.fromUnit = fromUnit;
		return this;
	}

	public Conversion to(String toUnit) {
		this.toUnit = toUnit;
		return this;
	}

	public double execute() throws Exception {
		double result = 0.00;
		if (this.fromUnit.equals("lb") && this.toUnit.equals("kg")) {
			result = this.value / 2.2;
		} else if (this.fromUnit.equals("kg") && this.toUnit.equals("lb")) {
			result = this.value * 2.2;
		} else if (this.fromUnit.equals("lb") && this.toUnit.equals("oz")) {
			result = this.value * 16;
		} else if (this.fromUnit.equals("oz") && this.toUnit.equals("lb")) {
			result = this.value / 16;
		} else if (this.fromUnit.equals("kg") && this.toUnit.equals("oz")) {
			result = this.value * 2.2 * 16;
		} else if (this.fromUnit.equals("oz") && this.toUnit.equals("kg")) {
			result = this.value / 16 / 2.2;
		} else if (this.fromUnit.equals("ft") && this.toUnit.equals("in")) {
			result = this.value * 12;
		} else if (this.fromUnit.equals("in") && this.toUnit.equals("ft")) {
			result = this.value / 12;
		} else if (this.fromUnit.equals("ft") && this.toUnit.equals("m")) {
			result = this.value * 0.3;
		} else if (this.fromUnit.equals("m") && this.toUnit.equals("ft")) {
			result = this.value / 0.3;
		} else if (this.fromUnit.equals("in") && this.toUnit.equals("m")) {
			result = this.value / 12 * 0.3;
		} else if (this.fromUnit.equals("m") && this.toUnit.equals("in")) {
			result = this.value / 0.3 * 12;
		} else if (this.fromUnit.equals("pt") && this.toUnit.equals("fl oz")) {
			result = this.value * 16;
		} else if (this.fromUnit.equals("fl oz") && this.toUnit.equals("pt")) {
			result = this.value / 16;
		} else {
			throw new ConversionException();
		}
		DecimalFormat df = new DecimalFormat("#.00");
		result = Double.valueOf(df.format(result));
		return result;
	}

	public static void main(String[] args) {
		try {
			// double pints = new Conversion().convert(1200, "fl oz").to("pt").execute();
			double pints = new Conversion().convert(16, "lb").to("kg").execute();
			System.out.println(pints);
		} catch (Exception e) {

		}

	}
}

class ConversionException extends Exception {
	public ConversionException() {
		System.out.println("Invalid conversions!");
	}
}
