package u0;

import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class c extends IOException {
    public c(File file, File file2, String str) {
        x0.g.e("file", file);
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String string = sb.toString();
        x0.g.d("toString(...)", string);
        super(string);
    }
}
