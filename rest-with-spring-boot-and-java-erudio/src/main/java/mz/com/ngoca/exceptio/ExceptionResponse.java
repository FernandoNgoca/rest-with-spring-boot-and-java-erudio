package mz.com.ngoca.exceptio;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}
