package WebDriver.function;

public class TestCaseFailException extends Exception {
	private static final long serialVersionUID = 1L;
	String sMessage;

	public TestCaseFailException(Exception e7) {
		sMessage = e7.getMessage();
	}

	public String getMessage() {
		return sMessage;
	}

}