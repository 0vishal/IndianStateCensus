package StateCensusAnalyser;


    public class CustomException extends Exception{
        public enum ExceptionType {
            Wrong_File,
            Wrong_File_Type, Wrong_delimiter_Type, Wrong_header_Type;
        }
        public ExceptionType type;

        public CustomException(String s,ExceptionType type){
            super(s);
            this.type=type;

        }
    }
