package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.a7m3p9xv.t6qk2z8.app.R;
import f.AbstractC0113a;
import java.lang.ref.WeakReference;

/* renamed from: g.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1633a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogC0135g f1634b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f1635c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f1636e;

    /* renamed from: f, reason: collision with root package name */
    public Button f1637f;

    /* renamed from: g, reason: collision with root package name */
    public Button f1638g;
    public Button h;

    /* renamed from: i, reason: collision with root package name */
    public NestedScrollView f1639i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1640j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f1641k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f1642l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1643m;

    /* renamed from: n, reason: collision with root package name */
    public View f1644n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f1645o;

    /* renamed from: q, reason: collision with root package name */
    public final int f1647q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1648r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1649s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1650t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1651u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0132d f1652v;

    /* renamed from: p, reason: collision with root package name */
    public int f1646p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final ViewOnClickListenerC0129a f1653w = new ViewOnClickListenerC0129a(0, this);

    public C0134f(Context context, DialogC0135g dialogC0135g, Window window) {
        this.f1633a = context;
        this.f1634b = dialogC0135g;
        this.f1635c = window;
        HandlerC0132d handlerC0132d = new HandlerC0132d();
        handlerC0132d.f1632a = new WeakReference(dialogC0135g);
        this.f1652v = handlerC0132d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0113a.f1500e, R.attr.alertDialogStyle, 0);
        this.f1647q = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f1648r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1649s = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f1650t = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f1651u = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0135g.c().f(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
