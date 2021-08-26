package login_practice_backup;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class ReadFileAsStream {
    public static void main(String... arguments) {
        CredentialsParser parser;
        try {
            parser = new CredentialsParser("c:/temp/credtest.txt");
            Credential[] credentials = parser.getCredentials();
            for (Credential credential : credentials) {
                System.out.println(String.format("%s : %s", credential.getUsername(), credential.getPassword()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//Parser for the credentials file format
class CredentialsParser {
    private Set<Credential> credentials = new HashSet<>();
    String filename = null;
    public CredentialsParser() {
        super();
    }
    public CredentialsParser(String filename) throws IOException {
        super();
        setFilename(filename);
        if (getFilename() != null) {
            parseCredentialsFile();
        }
    }
    public Credential[] getCredentials() {
        return credentials.toArray(new Credential[credentials.size()]);
    }
    // method to add credentials
    public void addCredential(String entry) {
        if (entry.indexOf(':') > -1) {
            String[] values = entry.split(":");
            credentials.add(new Credential(values[0], values[1]));
        }
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    protected void parseCredentialsFile() throws IOException {
        // read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(filename))) {
            stream.forEach(this::addCredential);
        }
    }
}
// Value holder for each credential entry
class Credential {
    private String username = null;
    private String password = null;
    public Credential() {
        super();
    }
    public Credential(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
 