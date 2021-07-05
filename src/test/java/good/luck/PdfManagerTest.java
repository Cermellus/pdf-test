package good.luck;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

class PdfManagerTest {

    private static final List<Integer> moduleIds = List.of(1, 2, 3, 4, 5);

    @Test
    void composeAndSaveToFile() {

        byte[] content = PdfManager.compose(moduleIds);
        try (FileOutputStream fos = new FileOutputStream("test.pdf")) {
            fos.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
