# String analyzer API

Simple rest api made with spring boot to analyze string that, returns information about occurances of specific symbols like: lowercases, 
uppercases, digits and special symbols.

##### Works with characters that are defined in RFC 7230 and RFC 3986.

### How to run:

#### 1. Run StringApiApplication.cs
#### 2. type 'http://localhost:8080/stringAnalyzer?input=VALUE' where VALUE is input string to be analyzed


### Example

### Input: http://localhost:8080/stringAnalyzer?input=1AhdkD@1
### Output: 
#### Input string contains:
#### 3 lowercase chars
#### 2 uppercase chars
#### 2 digits
#### 1 special symbols
