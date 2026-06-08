package in.kuldeep.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.kuldeep.response.ApiResponse;

public class GlobalExceptionHandler {
	@ExceptionHandler(ConsultantNotFoundException.class)
    public ResponseEntity<ApiResponse<Object>> handleConsultantNotFoundException(
            ConsultantNotFoundException ex) {

        ApiResponse<Object> response =
                new ApiResponse<>(ex.getMessage(), null);

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Object>> handleException(
            Exception ex) {

        ApiResponse<Object> response =
                new ApiResponse<>("Internal Server Error", null);

        return new ResponseEntity<>(response,
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
