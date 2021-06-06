package CensusAnalyserUC2;

public class CensusAnalyserException {
enum ExceptionType {
	CENSUS_FILE_PROBLEM unable to parse;
}
ExceptionType type;
public CensusAnalyserException(String message,String name ) {
	super(message);
	this.type = ExceptionType.valueOf(name);
}
public CensusAnalyserException(string message,ExceptionType type) {
	super(message);
	this.type = type;
}
public CensusAnalyserExceptionType(string message,ExceptionType type, Throwable cause) {
	super(message, cause);
	this.type = type;
}

}
