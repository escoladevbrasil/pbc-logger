package base;

import br.ifam.edu.pbc.base.Logger;
import br.ifam.edu.pbc.exception.LoggerException;

public class TestLogger {

    public static void main(String[] args) throws LoggerException {

        Logger logger = new Logger();

        logger.setSource("validation");

        logger.log("testando o log...");
    }

}
