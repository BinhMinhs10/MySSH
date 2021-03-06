package server.conn;

import java.io.IOException;

/**
 *
 * @author binhminh
 */
public interface IProcessCommand {
    public boolean login() throws IOException;
    
    public boolean cd();
    
    public boolean mkdir();
    
    public boolean touch();
    
    public boolean pwd();

    public boolean ls();

    public boolean date();

    public boolean rm();
    
    public boolean mv();
}
