package company;

public class StateCensusAnalyserException extends Exception{
    public ExceptionType type;

    public enum ExceptionType {
        CENSUS_FILE_PROBLEM, CSV_FILE_INTERNAL_ISSUES, WRONG_FILE_EXTENSION;
    }

    public StateCensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
