package androidx.appcompat.view.menu;

import G.C0037m;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.InterfaceC0237B;
import l.m;
import l.n;
import l.p;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements m, InterfaceC0237B, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f896b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public n f897a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0037m c0037mM = C0037m.m(context, attributeSet, f896b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c0037mM.f196b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0037mM.i(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0037mM.i(1));
        }
        c0037mM.r();
    }

    @Override // l.InterfaceC0237B
    public final void a(n nVar) {
        this.f897a = nVar;
    }

    @Override // l.m
    public final boolean b(p pVar) {
        return this.f897a.q(pVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        b((p) getAdapter().getItem(i2));
    }
}
