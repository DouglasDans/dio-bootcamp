package dev.dans.barbearia.exception;

public class ResourceAlreadyExistsException extends RuntimeException {
    public ResourceAlreadyExistsException(String resource, String data) {
        super("O atributo " + resource + " com o valor " + data + " já está em uso.");
    }
}
