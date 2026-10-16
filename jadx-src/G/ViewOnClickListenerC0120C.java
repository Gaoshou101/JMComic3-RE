package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: g.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0120C implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f1575a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1576b;

    /* renamed from: c, reason: collision with root package name */
    public Method f1577c;
    public Context d;

    public ViewOnClickListenerC0120C(View view, String str) {
        this.f1575a = view;
        this.f1576b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.f1577c == null) {
            View view2 = this.f1575a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f1576b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f1577c = method;
                        this.d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f1577c.invoke(this.d, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
