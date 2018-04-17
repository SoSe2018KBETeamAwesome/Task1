package de.htw.ai.kbe;

public class PropsFileUtilError extends Exception {
    public PropsFileUtilError(String message) {
        super("Props Util" + message);
    }
}
