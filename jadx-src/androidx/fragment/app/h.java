package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final q f1193a;

    public h(q qVar) {
        this.f1193a = qVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        boolean zEquals = g.class.getName().equals(str);
        q qVar = this.f1193a;
        if (zEquals) {
            return new g(context, attributeSet, qVar);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N.a.f470a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = d.class.isAssignableFrom(l.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    qVar.j();
                }
                if (string != null) {
                    androidx.emoji2.text.u uVar = qVar.f1216c;
                    ArrayList arrayList = (ArrayList) uVar.f1140a;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) != null) {
                            throw new ClassCastException();
                        }
                    }
                    Iterator it = ((HashMap) uVar.f1141b).values().iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                if (id != -1) {
                    qVar.j();
                }
                l lVar = qVar.f1234w;
                context.getClassLoader();
                lVar.a(attributeValue);
                throw null;
            }
        }
        return null;
    }
}
