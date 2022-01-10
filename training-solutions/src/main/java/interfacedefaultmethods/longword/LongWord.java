package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {

    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        List<String> matrix = readFromFile(path);
        StringBuilder result = new StringBuilder();
        result.append(matrix.get(0))
;       for (int i = 1; i < matrix.size(); i++) {
                result.append(matrix.get(i).charAt(matrix.get(0).length() - 1));
        }
        return result.toString();
    }
}
