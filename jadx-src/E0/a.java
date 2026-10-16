package E0;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f66a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        x0.g.d("forName(...)", charsetForName);
        f66a = charsetForName;
        x0.g.d("forName(...)", Charset.forName("UTF-16"));
        x0.g.d("forName(...)", Charset.forName("UTF-16BE"));
        x0.g.d("forName(...)", Charset.forName("UTF-16LE"));
        x0.g.d("forName(...)", Charset.forName("US-ASCII"));
        x0.g.d("forName(...)", Charset.forName("ISO-8859-1"));
    }
}
