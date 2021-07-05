package good.luck;

import com.itextpdf.text.pdf.PdfReader;
import lombok.NonNull;

import java.util.List;

public class PdfManager {
    private static final String BLANK_PAGE = "blank.pdf";
    private static final String MODULE_PATH = "modules/";
    private static final String MODULE_PREFIX = "module-";
    private static final String MODULE_SUFFIX = ".pdf";

    protected static byte[] compose(@NonNull List<Integer> moduleIds) {
        //for each module concatenate and create final PDF. Then return byte[].
        return null;
    }

    static protected PdfReader readModule(Integer id) {
        //read from /resources/modules/module-{id}.pdf and return PdfReader.
        return null;
    }

}
