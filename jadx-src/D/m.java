package D;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0130b;
import g.C0131c;
import g.C0133e;
import g.C0134f;
import g.DialogC0135g;
import java.io.Serializable;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public int f43a;

    /* renamed from: b, reason: collision with root package name */
    public Object f44b;

    public /* synthetic */ m(Serializable serializable) {
        this.f43a = 0;
        this.f44b = serializable;
    }

    public Object a() {
        int i2 = this.f43a;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = (Object[]) this.f44b;
        Object obj = objArr[i3];
        x0.g.c("null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool", obj);
        objArr[i3] = null;
        this.f43a--;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogC0135g b() {
        C0131c c0131c = (C0131c) this.f44b;
        DialogC0135g dialogC0135g = new DialogC0135g(c0131c.f1624a, this.f43a);
        View view = c0131c.f1627e;
        C0134f c0134f = dialogC0135g.f1658f;
        if (view != null) {
            c0134f.f1644n = view;
        } else {
            CharSequence charSequence = c0131c.d;
            if (charSequence != null) {
                c0134f.d = charSequence;
                TextView textView = c0134f.f1642l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0131c.f1626c;
            if (drawable != null) {
                c0134f.f1640j = drawable;
                ImageView imageView = c0134f.f1641k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0134f.f1641k.setImageDrawable(drawable);
                }
            }
        }
        if (c0131c.f1629g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0131c.f1625b.inflate(c0134f.f1648r, (ViewGroup) null);
            int i2 = c0131c.f1630i ? c0134f.f1649s : c0134f.f1650t;
            Object obj = c0131c.f1629g;
            ?? c0133e = obj;
            if (obj == null) {
                c0133e = new C0133e(c0131c.f1624a, i2, R.id.text1, null);
            }
            c0134f.f1645o = c0133e;
            c0134f.f1646p = c0131c.f1631j;
            if (c0131c.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0130b(c0131c, c0134f));
            }
            if (c0131c.f1630i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0134f.f1636e = alertController$RecycleListView;
        }
        dialogC0135g.setCancelable(true);
        dialogC0135g.setCanceledOnTouchOutside(true);
        dialogC0135g.setOnCancelListener(null);
        dialogC0135g.setOnDismissListener(null);
        l.o oVar = c0131c.f1628f;
        if (oVar != null) {
            dialogC0135g.setOnKeyListener(oVar);
        }
        return dialogC0135g;
    }

    public synchronized Pair c(int i2) {
        Pair pair;
        pair = (Pair) ((SparseArray) this.f44b).get(i2);
        ((SparseArray) this.f44b).remove(i2);
        return pair;
    }

    public boolean d(Object obj) {
        int i2 = this.f43a;
        int i3 = 0;
        while (true) {
            Object[] objArr = (Object[]) this.f44b;
            if (i3 >= i2) {
                int i4 = this.f43a;
                if (i4 >= objArr.length) {
                    return false;
                }
                objArr[i4] = obj;
                this.f43a = i4 + 1;
                return true;
            }
            if (objArr[i3] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
            i3++;
        }
    }

    public m(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f44b = new Object[i2];
    }

    public m(Context context) {
        int iJ = DialogC0135g.j(context, 0);
        this.f44b = new C0131c(new ContextThemeWrapper(context, DialogC0135g.j(context, iJ)));
        this.f43a = iJ;
    }
}
