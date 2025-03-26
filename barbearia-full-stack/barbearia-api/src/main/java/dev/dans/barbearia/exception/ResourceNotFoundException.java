package dev.dans.barbearia.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String resource, String data) {
        super("O atributo " + resource + " com o valor " + data + " não foi encontrado.");
    }

    public ResourceNotFoundException(String resource, Long data) {
        super("O atributo " + resource + " com o valor " + data + " não foi encontrado.");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
