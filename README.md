# Conversion Challange

## 0x00 General Overview

This is [Avoka][1] Technical Interview I have done in September 2017. 

If you are also interested in this company, pleas keep your eye on [https://www.avoka.com/careers/][2].

## 0x01 Challange

Get the [pdf][3] version.

### The Challenge:

Implement a utility class/prototype with a Fluent Interface, which can perform conversions 
between various units of measurement. The class/prototype can be implemented in a programming language of your choice. 

### Rules

- All conversions should be rounded to 2 decimal places. 
- Invalid conversions, such as converting a length to a weight, must throw an exception 
- Only the following conversions need to be supported:


From / To                        | Connversion
---------------------------------|---------------
Pounds (lb) / Kilograms (kg)     | 2.2lb = 1kg 
Pounds (lb) / Ounces (oz)        | 1lb = 16oz 
Feet (ft) / Inches (in)          | 1ft = 12in 
Feet (ft) / Meters (m)           | 1ft = 0.3m 
Pint (pt) / Fluid Ounces (fl oz) | 1pt = 16fl oz

### Example Usage

```javascript
// JavaScript 
var kilograms = new Conversion() 
  .convert(16, “lb”) 
  .to(“kg”) 
  .execute(); 
// kilograms should now equal 7.27 (based on conversion table) 
```

```java
// Java 
double pints = new Conversion() 
  .convert(1200, “fl oz”) 
  .to(“pt”) 
  .execute(); 
// pints should now equal 75 
```

### Notes/Hints: 

- You’re free to choose the names of classes, methods, parameters, etc. as you see fit. The code samples above are examples only. 
- [https://en.wikipedia.org/wiki/Fluent_interface][4]
- Take note of any assumptions you make while designing your solution 
- Exact conversion ratios are unimportant. 16lbs is closer to 7.26kg in practice but for the purposes of this exercise, the conversion values provided are close enough. 
- Your final solution should be submitted as a single text file with a .txt extension or provided via a link to an online editor such as [https://jsfiddle.net/][5]

[1]: https://www.avoka.com/
[2]: https://www.avoka.com/careers/
[3]: https://github.com/testerting/conversion-challenge/blob/master/ConversionChallenge.pdf
[4]: https://en.wikipedia.org/wiki/Fluent_interface
[5]: https://jsfiddle.net/
 