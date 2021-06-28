//создадим собственное исключение, выбрасывающее исключение приработе с классом Scanner

public class ScannerException extends Exception{
public ScannerException(String description){
super(description);
}
}
