package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: m.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0295u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f2463a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        f2463a = declaredField;
    }
}
