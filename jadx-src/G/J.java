package G;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class J {
    public static final ArrayList d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f143a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f144b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f145c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f143a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewA = a(viewGroup.getChildAt(childCount));
                    if (viewA != null) {
                        return viewA;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }
}
