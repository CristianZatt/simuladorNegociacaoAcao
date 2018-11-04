package br.czatt.simuladorNegociacaoAcao.model.customExceptions;

public class SaldoInsuficienteException extends Exception{

	private static final long serialVersionUID = 4690903736198669021L;
	
	private int errorCode;
	
	public SaldoInsuficienteException(int errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public SaldoInsuficienteException(String message, Throwable cause, int errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public SaldoInsuficienteException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public SaldoInsuficienteException(Throwable cause, int errorCode) {
		super(cause);
		this.errorCode = errorCode;
	}
	
	public int getCode() {
		return this.errorCode;
	}
	
}
