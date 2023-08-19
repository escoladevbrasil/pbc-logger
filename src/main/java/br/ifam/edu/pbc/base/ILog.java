package br.ifam.edu.pbc.base;

import br.ifam.edu.pbc.exception.LoggerException;

import java.io.IOException;

public interface ILog {

    void setSource(String source) throws LoggerException;

    void log(String message) throws LoggerException;

    void log(Throwable throwable) throws LoggerException;

}
